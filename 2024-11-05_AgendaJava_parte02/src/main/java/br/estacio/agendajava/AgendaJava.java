

package br.estacio.agendajava;

import br.estacio.agendajava.modelo.Contato;
import br.estacio.agendajava.modelo.ContatoDAO;
import br.estacio.agendajava.util.DatabaseConection;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;

public class AgendaJava {
    //DAO ==> Data Acess Object
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EntityManager em;
        ContatoDAO dao;
        
        int opcao = 0;
        
        do{
            System.out.println("Escolha uma opcao: ");
            System.out.println("1- Cadastrar");
            System.out.println("2- Editar");
            System.out.println("3- Apagar");
            System.out.println("4- Consultar");
            System.out.println("5- Exibir todos");
            System.out.println("6- Sair");
            
            opcao = Integer.parseInt(teclado.nextLine());
            
            switch(opcao){
                case 1:
                    System.out.println("Cadastrar contato");
                    //Capturando os dados
                    System.out.println("Informe o nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("Informe o telefone: ");
                    String telefone = teclado.nextLine();
                    System.out.println("Informe o e-mail: ");
                    String email = teclado.nextLine();
                    //Criando um contato
                    Contato contato = new Contato(null, nome, telefone, email);
                    //Conectando com o banco de dados
                    em = DatabaseConection.getEntityManager();
                    //Instanciando a ContatoDAO
                    dao = new ContatoDAO(em);
                    //Iniciando a transação
                    em.getTransaction().begin();
                    dao.cadastrar(contato);
                    em.getTransaction().commit();
                    em.close();
                    
                    System.out.println("Contato gravado com sucesso!");
                    break;
                case 2:
                    //Editar (capturando os dados)
                    System.out.println("Informe o ID do contato: ");
                    Integer novoId = Integer.valueOf(teclado.nextLine());
                    System.out.println("Informe o nome: ");
                    String novoNome = teclado.nextLine();
                    System.out.println("Informe o telefone: ");
                    String novoTelefone = teclado.nextLine();
                    System.out.println("Informe o e-mail: ");
                    String novoEmail = teclado.nextLine();
                    
                    contato = new Contato(novoId, novoNome, novoTelefone, novoEmail);
                    em = DatabaseConection.getEntityManager();
                    dao = new ContatoDAO(em);
                    em.getTransaction().begin();
                    dao.alterar(contato);
                    em.getTransaction().commit();
                    em.close();
                    
                    break;
                case 3:
                    System.out.println("Informe o ID do contato: ");
                    Integer id = Integer.valueOf(teclado.nextLine());
                    
                    em = DatabaseConection.getEntityManager();
                    dao = new ContatoDAO(em);
                    
                    em.getTransaction().begin();
                    contato = dao.buscarPorId(id);
                    dao.remover(contato);
                    em.getTransaction().commit();
                    em.close();
                    break;
                case 4:
                    //consultar
                    System.out.println("Informe o telefone: ");
                    telefone = teclado.nextLine();
                    
                    em = DatabaseConection.getEntityManager();
                    dao = new ContatoDAO(em);
                    
                    em.getTransaction().begin();
                    Contato novo = dao.buscarPorTelefone(telefone);
                    em.close();
                    
                    if(novo != null){
                        System.out.println(novo);
                    }else{
                        System.out.println("Contato nao encontrado");
                    }
                    
                    break;
                case 5:
                    //Exibir todos
                    em = DatabaseConection.getEntityManager();
                    dao = new ContatoDAO(em);
                    
                    em.getTransaction().begin();
                    List<Contato> contatos = dao.buscarTodos();
                    //em.getTransaction().commit();
                    em.close();
                    
                    for(int i = 0; i < contatos.size(); i++){
                        System.out.println(contatos.get(i));
                    }
                    
                    break;
                case 6:
                    //Saindo
                    System.out.println("Ate logo...");
                    teclado.close();
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
            }
                
            
        }while(opcao != 6);        
        
    }
}
