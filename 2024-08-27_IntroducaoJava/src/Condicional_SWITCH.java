public class Condicional_SWITCH {
    public static void main(String[] args) {
        int opcao = 4;
        //O switch no JAVA trabalha com valores inteiros, char e String [1.7]
        switch(opcao){
            case 1: 
                System.out.println("Aula de java");
                break;
            case 2:
                System.out.println("Aula de python");
                break;
            case 3:
                System.out.println("Aula de MySQL");
                break;
            case 4:
                System.out.println("Aula de Postgres");
                break;
            default:
                System.out.println("Opção padrão");
                break;
        }
    }
}
