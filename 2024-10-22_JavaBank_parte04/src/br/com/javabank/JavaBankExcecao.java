
package br.com.javabank;

import br.com.javabank.exceptions.DepositoInvalidoException;
import br.com.javabank.modelo.Corrente;


public class JavaBankExcecao {
    public static void main(String[] args) {
        Corrente cc = new Corrente("Juca Pereira", "1234", 1000, 500);
        
        cc.imprimeSaldo();
                
        try {
            cc.depositar(100);
        } catch (DepositoInvalidoException ex) {
            System.out.println(ex);    
        }
        try{
            //TODO O CÓDIGO QUE PODE VIR A LANÇAR UM EXCEÇÃO
            //cc.sacar(10/0);
            //cc.sacar(Double.parseDouble("Cem"));
            cc.sacar(-10);
            //cc.depositar(1100);
                 
        }catch(NumberFormatException e){
            System.out.println("O valor informado é invalido");
        }catch (ArithmeticException e){
            //CAPTURA A EXCEÇÃO
            //System.out.println("Erro: " + e);
            System.out.println("Ocorreu uma divisao por zero");
        }catch(IllegalArgumentException e){
            System.out.println();
        }catch(Exception e){
            System.out.println("Erro generico");
        }finally{
            //SEMPRE SERÁ EXECUTADO OCORRENDO UMA EXCEÇÃO OU NÃO
            System.out.println("Fim do programa");
        }
        
        cc.imprimeSaldo();
    }
}
