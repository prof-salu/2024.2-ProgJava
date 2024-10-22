
package br.com.javabank;

import br.com.javabank.modelo.Conta;
import br.com.javabank.modelo.Corrente;
import br.com.javabank.modelo.Poupanca;
import java.util.ArrayList;
import java.util.List;

public class JavaBankAbstrato {
    public static void main(String[] args) {
        //Referencia para uma conta
        Conta conta1 = new Corrente();
        
        //Referencia para uma Corrente
        Corrente conta2 = new Corrente();
        
        //Referencia para uma Poupanca
        Conta conta3 = new Poupanca();
        
        List<Conta> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        
    }
}
