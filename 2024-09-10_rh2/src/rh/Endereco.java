package rh;

public class Endereco {        
    String rua;
    String numero;
    String bairro;
    
    //Construtor vazio ou default
    Endereco(){
        
    }
    
    //Construtor com parametros ou cheio
    Endereco(String rua, String numero, String bairro){
        //O construtor vai ser utilizado para ininializar as 
        // propriedades de uma classe
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }
    
    //Sobrecarga de construtores
    Endereco(String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }
    
    //Reescrita [override]
    @Override
    public String toString() {
        return this.rua + ", " + this.numero; 
    }
}
