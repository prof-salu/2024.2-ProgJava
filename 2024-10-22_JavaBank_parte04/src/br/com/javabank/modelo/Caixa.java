package br.com.javabank.modelo;


public class Caixa extends Funcionario {
    
    public int totalHoras;
    
    public Caixa(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }    

    @Override
    public double calculaSalario() {
        return getSalario() + (totalHoras * 7);
    }  
}
