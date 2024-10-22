
package br.com.javabank.modelo;


public interface IAutenticavel {
    //Até a versão 8 do java apenas eram permitadas funçõespublicas e abtsratas em interfaces
    public abstract boolean login(String matricula, String senha);
}