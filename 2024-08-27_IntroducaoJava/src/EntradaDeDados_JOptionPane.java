
import javax.swing.JOptionPane;


public class EntradaDeDados_JOptionPane {
    public static void main(String[] args) {
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog(null, "Informe o seu nome: ");
        
        //JOptionPane.showMessageDialog(null, nome);
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade: "));
        
        //JOptionPane.showMessageDialog(null, idade);
        
        //JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
        JOptionPane.showMessageDialog(  null, 
                                        "Nome: %s \nIdade: %d".formatted(nome, idade), 
                                        "Resposta",
                                        JOptionPane.WARNING_MESSAGE);
    }
}
