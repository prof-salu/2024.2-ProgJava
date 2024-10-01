
package br.com.javabank.modelo;

import br.com.javabank.exceptions.DepositoInvalidoException;

/**
 * Classe que representa um conta no sistema JavaBank
 * @author aluno
 */
public class Conta{
    private String titular;
    private String numero;
    protected double saldo;
    
    public Conta(String titular, String numero, double saldo){
        //com parametros
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Conta(){
        //padrão
    }
    /**
     * A função sacar remove fundos de uma conta
     * @param valor referente ao valor a ser sacado
     * @return retorna true caso o saque seja bem sucedido
     */
    public boolean sacar(double valor){
        if(this.saldo - valor >= 0 && valor > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado: " + valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    
    //Impletar o deposito: Valor deverá ser positivo, retorna TRUE caso seja bem sucedido
    //throws --> faz com que o tratamento da exceção seja adiado para a proxima chamada
    public boolean depositar(double valor)throws DepositoInvalidoException{
        
        if(valor <= 0){
            //throw --> Lança uma exceçao
            throw new DepositoInvalidoException("Valor invalido para deposito");
        }
        
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }else{
            System.out.println("Valor inválido!");
            return false;
        }
    }    
    
    //Transferir saldo de uma conta para outra
    //throws --> faz com que o tratamento da exceção seja adiado para a proxima chamada
    public boolean transferir(double valor, Conta favorecido)throws DepositoInvalidoException{
        if(sacar(valor) == true){
            favorecido.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
    
    //Função GET sempre terá retorno do mesmo tipo da variavel
    public double getSaldo(){
        return this.saldo;
    }
    
    //Função SET sempre será void e recebrá um  parametro do mesmo tipo da variavel
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public String getNumero(){
        return this.numero;
    }    
    //Na classe corrente, reescrever o método imprimeSaldo para exibir alem do saldo 
    //atual o saldo + o limite da conta.
    public void imprimeSaldo(){
        System.out.println("Saldo: R$%.2f".formatted(saldo));
    }
}
