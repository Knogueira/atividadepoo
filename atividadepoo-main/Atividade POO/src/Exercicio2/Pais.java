package Exercicio2;

public class Pais {
    private String nome;
    private long dimensao;
    private long populacao;

    // Construtor
    public Pais(String nome, long dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    // Métodos para retornar o nome do país
    public String getNome() {
        return this.nome;
    }

    // Métodos para retornar a dimensão territorial do país
    public long getDimensao() {
        return this.dimensao;
    }

    // Métodos para retornar a população do país
    public long getPopulacao() {
        return this.populacao;
    }
}

