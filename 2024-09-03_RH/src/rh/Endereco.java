package rh;

public class Endereco {        
    String rua;
    String numero;
    String bairro;
    
    //Reescrita [override]
    @Override
    public String toString() {
        return this.rua + ", " + this.numero; 
    }
}
