

package br.estacio.agendajava;

import br.estacio.agendajava.modelo.Contato;
import br.estacio.agendajava.util.DatabaseConection;
import javax.persistence.EntityManager;

public class AgendaJava {

    public static void main(String[] args) {
        //Criando um novo contato
        Contato contato = new Contato();
        
        contato.setNome("Juca");
        contato.setTelefone("1223454");
        contato.setEmail("juca@email.com");
        
        //Conectando com o banco de dados
        EntityManager em = DatabaseConection.getEntityManager();
        
        //Iniciando uma oeração com o banco de dados
        em.getTransaction().begin();
        
        //Gravando o contato no banco
        em.persist(contato);
        
        em.getTransaction().commit();
        em.close();
    }
}
