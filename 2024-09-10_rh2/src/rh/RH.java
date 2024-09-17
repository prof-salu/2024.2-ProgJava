package rh;

public class RH {    
    public static void main(String[] args) {
        //Instanciação [operador new]
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = f2;
        Funcionario f4 = new Funcionario();
        
        Endereco e1 = new Endereco("Avenida Julio", "1490", "Maracanã");
        Endereco e2 = new Endereco("Praça Afonfo Pena", "100", "Tijuca");
        Endereco e3 = new Endereco("Rua das Flores", "Botafogo");
        
        //DOT NOTATION        
        //e1.bairro = "Maracanã";
        //e1.numero = "1490";
        //e1.rua = "Avenida 123";
        
        f1.nome = "Juca";
        f1.matricula = "1001";
        f1.cpf = "1234";
        f1.cargo = "Desenvolvedor I";
        f1.salario = 5000;
        f1.email = "juca@email.com";
        f1.endereco = e1;
        
        f2.nome = "Ana";
        f2.matricula = "1002";
        f2.cpf = "5678";
        f2.cargo = "Gerente";
        f2.salario = 8000;
        f2.email = "ana@email.com";
        f2.endereco = e1;
        
        f3.salario = 200000;
        
        f4.nome = "Juca";
        f4.matricula = "1001";
        f4.cpf = "1234";
        f4.cargo = "Desenvolvedor I";
        f4.salario = 5000;
        f4.email = "juca@email.com";
        
        //Imprimindo os dados
        //sout + TAB ==> System.out.println("");
        
        f1.exibeDados();
        
        f2.exibeDados();        
        
        System.out.println("Funcionario [Pos Memória]: " + f3);
        System.out.println("");
        
        System.out.println("f2 é igual a f3? ==> " + (f2 == f3));
        System.out.println("f1 é igual a f4? ==> " + (f1 == f4));
        System.out.println("");
        
        System.out.println("Comissao funcionario f1: " + f1.calcularComissao());
        System.out.println("Comissao funcionario f2: " + f2.calcularComissao());
        
        //Imprimir o total pago em comissões
        
        //Com valores 10% padrão e 5%
        double comissoes = f1.calcularComissao() + f2.calcularComissao(5);
        
        System.out.println("Total pago no mês em comissões: R$%.2f".formatted(comissoes));
        
        //Imprimir a quantidade de funcionarios logados no sistema
        System.out.println("Total de funcionarios logados: " + Funcionario.getTotalFuncionarios());
        
        //Array ou vetores
        
        //Criando um vetor para armazenar até 5 funcionarios
        //Lista vazias
        Funcionario lista1[] = new Funcionario[5];
        Funcionario[] lista2 = new Funcionario[5];
        
        //Armazena 4 funcionarios (f1, f2, f3, f4)
        Funcionario lista3[] = {f1, f2, f3, f4};
        
        lista3[0].exibeDados();
        lista3[1].exibeDados();
        lista3[2].exibeDados();
        lista3[3].exibeDados();
        
        for(int i = 0; i < lista3.length;i++){
            lista3[i].exibeDados();
        }
        
        //for each
        for (Funcionario funcionario : lista3) {
            funcionario.exibeDados();
        }
    }   
}