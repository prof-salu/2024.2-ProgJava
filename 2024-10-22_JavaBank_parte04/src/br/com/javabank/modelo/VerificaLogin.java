package br.com.javabank.modelo;

public class VerificaLogin {
    private int totalAcessos = 0;
    private int totalFalhas = 0;
    
    public void verificausuarios(IAutenticavel autenticavel, String matricula, String senha){
        if(autenticavel.login(matricula, senha)){
            totalAcessos++;
        }else{
            totalFalhas++;
        }
    }

    public int getTotalAcessos() {
        return totalAcessos;
    }

    public int getTotalFalhas() {
        return totalFalhas;
    }
}
