
package br.com.javabank.exceptions;

public class DepositoInvalidoException extends Exception{
    //Exception (checked) --> exceção em tempo de compilação
    //Obrigatório o tratamento da exceção
    public DepositoInvalidoException(String message) {
        super(message);
    }
    
}
