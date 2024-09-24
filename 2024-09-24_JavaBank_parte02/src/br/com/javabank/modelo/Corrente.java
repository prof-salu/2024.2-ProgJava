
package br.com.javabank.modelo;

public class Corrente extends Conta{
    
    private double chequeEspecial;
    
    public Corrente(){
        
    }
    
    public Corrente(String titular, String numero, double saldo, double chequeEspecial){
        //Acessando o construtor da classe pai (Conta)
        //O comando super() deve sempre ser chamado primeiro
        super(titular, numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    //Reescrita de método
    
    //Alterando o comportamento da função original
    //Para realizar uma sobrescrita, a função deve possuir 
    //obrigatoriamente a mesma assinatura da função original.
    //assinatura => mesmo retorno, mesmo nome e mesmos parametros
    @Override
    public boolean sacar(double valor) {
        if((this.saldo + chequeEspecial) - valor >= 0 && valor > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado: " + valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    //O comando super ligado a uma função, executa a função original criada na super classe
    @Override
    public void imprimeSaldo() {
        super.imprimeSaldo();
        System.out.println("Saldo + Cheque Especial: R$%.2f".formatted(saldo + chequeEspecial));
    }
    
    
    
}
