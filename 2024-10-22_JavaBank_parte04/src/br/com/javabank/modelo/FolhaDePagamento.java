
package br.com.javabank.modelo;


public class FolhaDePagamento {
    private double totalPagoMes = 0;
    
    public void adicionarPagamento(IPagamentos funcionario){
        totalPagoMes += funcionario.calculaSalario();
    }

    public double getTotalPagoMes() {
        return totalPagoMes;
    }
    
    
}
