
package br.com.javabank;

//CTRL + SHIFT + I ==> Organizar imports
import br.com.javabank.modelo.Corrente;
import br.com.javabank.modelo.Poupanca;

public class JavaBankHeranca {
    public static void main(String[] args) {
        Corrente cc = new Corrente("Mariano", "9876", 1000, 2000);
        Poupanca cp = new Poupanca("Ana", "7658", 1000, 1);
        
        cc.sacar(200);
        cp.sacar(300);
        
        cc.imprimeSaldo();
        cp.imprimeSaldo();
        
        cc.transferir(500, cp);
        
        cc.imprimeSaldo();     
        cp.imprimeSaldo();
        
        System.out.println("Rendimento[cp]: " + cp.calculaRendimento());
        
        cc.sacar(1000);
        cc.imprimeSaldo();       
        
        cc.sacar(2000);
        cc.imprimeSaldo();     
    }
}
