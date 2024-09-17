package lojaswing;

public class Hardware {
    String modelo;
    String nome;
    String marca;
    double preco;
    String anoFabricacao;

    public Hardware() {
    }

    public Hardware(String modelo, String nome, String marca, double preco, String anoFabricacao) {
        this.modelo = modelo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Hardware{" + "modelo=" + modelo + ", nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", anoFabricacao=" + anoFabricacao + '}';
    }
}
