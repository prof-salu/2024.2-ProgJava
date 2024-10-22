package br.com.javabank.modelo;

public class Gerente extends Funcionario implements IAutenticavel{
    
    public double bonus;
    
    public Gerente(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean login(String matricula, String senha) {
        return getMatricula() == matricula && senha == "9999";
    }

    @Override
    public double calculaSalario() {
        return getSalario();
    }
}
