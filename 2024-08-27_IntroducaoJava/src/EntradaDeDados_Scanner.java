
import java.util.Scanner;

//CTRL + SHIFT + I [organize import]
public class EntradaDeDados_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//instanciação
        
        int idade;
        String nome;
        
        System.out.println("Informe a idade:");
        idade = Integer.parseInt(sc.nextLine());//Wrapper        
        
        System.out.println("Informe o nome: ");
        //Captura a primeira palavra
        //nome = sc.next();
        //Captura uma string completa
        nome = sc.nextLine();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        //Fechando o scanner
        sc.close();
    }
}
