
package br.com.javabank;

import br.com.javabank.modelo.Caixa;
import br.com.javabank.modelo.FolhaDePagamento;
import br.com.javabank.modelo.Gerente;
import br.com.javabank.modelo.Vendedor;
import br.com.javabank.modelo.VerificaLogin;

public class JavaBankInterfaces {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("1001", "Juca", 4000);
        v1.setTotalVendas(10000);
        v1.setComissao(0.05);
        
        Gerente g1 = new Gerente("1002", "Marcia", 10000);
        
        Caixa c1 = new Caixa("1003", "Marlene", 2500);
        c1.setTotalHoras(28);
        
        VerificaLogin vf = new VerificaLogin();
        
        FolhaDePagamento folha = new FolhaDePagamento();
        
        
        //System.out.println(v1.login("1001", "1234"));
        //System.out.println(g1.login("1002", "9999"));
        //System.out.println(c1.login("1002", "9999"));
        
        vf.verificausuarios(v1, "0001", "1234");
        vf.verificausuarios(g1, "0001", "1234");
        //vf.verificausuarios(c1, "0001", "1234");
        
        vf.verificausuarios(v1, "1001", "1234");
        vf.verificausuarios(g1, "1002", "9999");
        
        System.out.println("Erros: " + vf.getTotalFalhas());
        System.out.println("Logados: " + vf.getTotalAcessos());
        
        folha.adicionarPagamento(c1);
        folha.adicionarPagamento(v1);
        folha.adicionarPagamento(g1);
        
        System.out.println("Total pago: " + folha.getTotalPagoMes());
    }
}
