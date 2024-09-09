package listaDuplamenteEncadeada.basicas;

public class Contato {
    private String nome;
    private String endereco;
    private String numero;

    public Contato(String nome, String endereco, String numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public Contato() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + "\nEndereco: " + endereco + "\nNumero: " + numero + "]";
    }

}
