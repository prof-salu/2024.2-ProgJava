
package br.com.javabank.modelo;

/**
 *
 * @author aluno
 */
public class Vendedor extends Funcionario implements IAutenticavel{
    
    public double totalVendas;
    public double comissao;
    
    public Vendedor(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
     @Override
    public boolean login(String matricula, String senha) {
        return getMatricula() == matricula && senha == "1234";
    }

    @Override
    public double calculaSalario() {
        return getSalario() + (totalVendas * comissao);
    }
    
}
