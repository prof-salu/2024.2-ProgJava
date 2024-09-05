
package rh;

//Classe que representa um funcionario
public class Funcionario {
    //Propriedades (caracteristicas)
        //nome, matricula, cpf, e-mail, cargo, salario
    String nome;
    String matricula;
    String cpf; 
    String email;
    String cargo;
    double salario;
    //Composição
    Endereco endereco;

    //Comportamentos (funcionalidades)
        //subrotinas sem retorno [procedimento] retornam void
    void exibeDados(){
        System.out.println("Funcionario [Pos Memória]: " + this);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: R$%.2f".formatted(this.salario));
        System.out.println("E-mail: " + this.email);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("");
    }
    
    //Calcular comissao. Retornar o valor da comissao de 10%
    double calcularComissao(){
        return this.salario * 0.1;
    }
    
    //Calcular comissao. Retornar o valor da comissao de 10%
    //Sobrecarga [overload] - assinaturas direntes
    double calcularComissao(double comissao){
        return this.salario * comissao / 100;
    }    
}