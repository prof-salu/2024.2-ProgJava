
public class Condicional_IF {
    //ALT + SHIFT + F [AUTO FORMAT]
    public static void main(String[] args) {
        int idade = 23;

        if (idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Voto opcional");
        } else if (idade < 16) {
            System.out.println("Não pode votar");
        } else {
            System.out.println("Voto obrigatorio");
        }
    }
}
