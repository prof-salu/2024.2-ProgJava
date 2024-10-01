
package br.com.javabank.modelo;

public class Poupanca extends Conta {
    private double txJuros;

    public Poupanca(String titular, String numero, double saldo, double txJuros) {
        //O comando super() deve sempre ser chamado primeiro
        super(titular, numero, saldo);
        this.txJuros = txJuros;
    }

    public Poupanca(double txJuros) {
        this.txJuros = txJuros;
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
