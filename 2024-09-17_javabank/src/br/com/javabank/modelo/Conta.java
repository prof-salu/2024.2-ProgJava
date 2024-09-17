
package br.com.javabank.modelo;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;
    
    public Conta(String titular, String numero, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Conta(){
        
    }
    
    public boolean sacar(double valor){
        if(this.saldo - valor >= 0 && valor > 0){
            this.saldo = this.saldo - valor;
            aplicarTaxaServico();
            System.out.println("Valor sacado: " + valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    
    //Impletar o deposito: Valor deverá ser positivo, retorna TRUE caso seja bem sucedido
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }else{
            System.out.println("Valor inválido");
            return false;
        }
    }    
    
    //Transferir saldo de uma conta para outra
    public boolean transferir(double valor, Conta favorecido){
        if(sacar(valor) == true){
            favorecido.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
    
    private void aplicarTaxaServico(){
        this.saldo = this.saldo - 0.10;
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
    
}
