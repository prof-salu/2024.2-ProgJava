
package br.estacio.agendajava.modelo;

//DAO ==> Data Acess Object

import java.util.List;
import javax.persistence.EntityManager;

public class ContatoDAO {
    private EntityManager em;

    public ContatoDAO(EntityManager em) {
        this.em = em;
    }
    //cadastrar, editar, apagar, consultar
    public void cadastrar(Contato contato){
        em.persist(contato);
    }
    
    public void remover(Contato contato){
        contato = em.merge(contato);
        em.remove(contato);
    }
    
    public void alterar(Contato contato){
        em.merge(contato);
    }
    
    public Contato buscarPorId(Integer id){
        return em.find(Contato.class, id);
    }
    
    public List<Contato> buscarPorNome(String nome){
        //Fazendo um busca por telefone
        String jpql = "SELECT c FROM Contato c WHERE c.nome = :nome";
        
        return em.createQuery(jpql, Contato.class)
                .setParameter("nome", nome)
                .getResultList();
    }
    
    public Contato buscarPorTelefone(String telefone){
        //Fazendo um busca por telefone
        String jpql = "SELECT c FROM Contato c WHERE c.telefone = :telefone";
        
        List<Contato> contatos = em.createQuery(jpql, Contato.class)
                .setParameter("telefone", telefone)
                .getResultList();
        
        if(!contatos.isEmpty()){
            return contatos.get(0);
        }else{
            return null;
        }    
    }
    
    public List<Contato> buscarTodos(){
        String jpql = "SELECT c FROM Contato c";
        
        return em.createQuery(jpql, Contato.class)
                .getResultList();
    }
}
