
package br.com.javabank.modelo;

public final class Poupanca extends Conta {
    private double txJuros;

    public Poupanca() {
    }
   
    public Poupanca(String titular, String numero, double saldo, double txJuros) {
        //O comando super() deve sempre ser chamado primeiro
        super(titular, numero, saldo);
        this.txJuros = txJuros;
    }

    public Poupanca(double txJuros) {
        this.txJuros = txJuros;
    }

    @Override
    public boolean sacar(double valor) {
        if(this.saldo - valor >= 0 && valor > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado: " + valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    
    

    public double getTxJuros() {
        return txJuros;
    }

    public void setTxJuros(double txJuros) {
        this.txJuros = txJuros;
    }
    
    public double calculaRendimento(){
        return (saldo * txJuros) / 100;
    }
}
