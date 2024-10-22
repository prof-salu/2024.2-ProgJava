
package br.com.javabank;

import br.com.javabank.exceptions.DepositoInvalidoException;
import br.com.javabank.modelo.Corrente;


public class JavaBank {
  
    public static void main(String[] args) throws DepositoInvalidoException{
        Corrente cc1 = new Corrente("Juca", "1234", 1000, 500);      
        Corrente cc2 = new Corrente("Mariana", "7654", 300, 500);      
        
        //public    ==> Qualquer classe do projeto pode acessar
        //private   ==> Apenas a propria classe tem acesso
        //protected ==> Apenas classes do mesmo pacote e classes filhas 
                      //podem acessar   
        //default   ==> Apenas classes do mesmo pacote tem acesso
         
        //Saque de 400
//        cc1.saldo = cc1.saldo - 400;
//        System.out.println("Saldo: " + cc1.saldo);
//        
//        //Saque de 700
//        if(cc1.saldo - 700 < 0){
//            System.out.println("Saldo insuficiente");
//        }else{
//            cc1.saldo = cc1.saldo - 700;        
//        }       
//        System.out.println("Saldo: " + cc1.saldo);
        
        //Saque de 400
        cc1.sacar(400);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        //Saque de 700
        cc1.sacar(700);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        cc1.sacar(-700);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        //Alterar o titular para Juca Pereira
        System.out.println("Titular: " + cc1.getTitular());
        cc1.setTitular("Juca Pereira");
        System.out.println("Titular: " + cc1.getTitular());
        
        //Deposito de 200
        cc1.depositar(200);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        //depositar -400
        cc1.depositar(-400);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        //Transferir 150 da cc1 para cc2
        System.out.println("ANTES da transferencia");
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Saldo: " + cc2.getSaldo());
        cc1.transferir(150, cc2);
        System.out.println("DEPOIS da transferencia");
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Saldo: " + cc2.getSaldo());
        
        cc2.sacar(2.1);
        System.out.println("Saldo: " + cc2.getSaldo());
    }    
}
