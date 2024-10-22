
package br.com.javabank.exceptions;

public class SaqueInvalidoException extends RuntimeException{
    //Exception (unchecked) --> exceção em tempo de execução
    public SaqueInvalidoException(String message) {
        super(message);
    }
    
}
