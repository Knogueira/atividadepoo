package Exercicio2;

import java.util.ArrayList;

public class Continente {

    private String nome;
    private Pais paisComMaiorPopulacao;
    private Pais paisComMenorPopulacao;
    private Pais paisMaiorDimensao;
    private Pais paisMenorDimensao;
    private long dimensaoTotal;
    private long populacaoTotal;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.dimensaoTotal = 0;
        this.populacaoTotal = 0;
        this.paisComMaiorPopulacao = null;
        this.paisComMenorPopulacao = null;
        this.paisMaiorDimensao = null;
        this.paisMenorDimensao = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPaisComMaiorPopulacao(Pais paisComMaiorPopulacao) {
        this.paisComMaiorPopulacao = paisComMaiorPopulacao;
    }

    public void setPaisComMenorPopulacao(Pais paisComMenorPopulacao) {
        this.paisComMenorPopulacao = paisComMenorPopulacao;
    }

    public void setPaisMaiorDimensao(Pais paisMaiorDimensao) {
        this.paisMaiorDimensao = paisMaiorDimensao;
    }

    public void setPaisMenorDimensao(Pais paisMenorDimensao) {
        this.paisMenorDimensao = paisMenorDimensao;
    }

    public void setDimensaoTotal(long dimensaoTotal) {
        this.dimensaoTotal = dimensaoTotal;
    }

    public void setPopulacaoTotal(long populacaoTotal) {
        this.populacaoTotal = populacaoTotal;
    }

    // Método para adicionar país ao continente
    public void adicionarPais(Pais pais) {
        // Atualiza a dimensão total do continente
        this.dimensaoTotal += pais.getDimensao();

        // Atualiza a população total do continente
        this.populacaoTotal += pais.getPopulacao();

        // Atualiza o país com maior população
        if (this.paisComMaiorPopulacao == null || pais.getPopulacao() > this.paisComMaiorPopulacao.getPopulacao()) {
            this.paisComMaiorPopulacao = pais;
        }

        // Atualiza o país com menor população
        if (this.paisComMenorPopulacao == null || pais.getPopulacao() < this.paisComMenorPopulacao.getPopulacao()) {
            this.paisComMenorPopulacao = pais;
        }

        // Atualiza o país com maior dimensão
        if (this.paisMaiorDimensao == null || pais.getDimensao() > this.paisMaiorDimensao.getDimensao()) {
            this.paisMaiorDimensao = pais;
        }

        // Atualiza o país com menor dimensão
        if (this.paisMenorDimensao == null || pais.getDimensao() < this.paisMenorDimensao.getDimensao()) {
            this.paisMenorDimensao = pais;
        }
    }

    // Métodos para retornar a dimensão total do continente
    public long getDimensaoTotal() {
        return this.dimensaoTotal;
    }

    // Métodos para retornar a população total do continente
    public long getPopulacaoTotal() {
        return this.populacaoTotal;
    }

    // Métodos para retornar a densidade populacional do continente
    public double getDensidadePopulacional() {
        return (double) this.populacaoTotal / this.dimensaoTotal;
    }

    // Métodos para retornar o país com maior população no continente
    public Pais getPaisComMaiorPopulacao() {
        return this.paisComMaiorPopulacao;
    }

    // Métodos para retornar o país com menor população no continente
    public Pais getPaisComMenorPopulacao() {
        return this.paisComMenorPopulacao;
    }

    // Métodos para retornar o país de maior dimensão territorial no continente
    public Pais getPaisMaiorDimensao() {
        return this.paisMaiorDimensao;
    }

    // Métodos para retornar o país de menor dimensão territorial no continente
    public Pais getPaisMenorDimensao() {
        return this.paisMenorDimensao;
    }

    // Método para retornar a razão territorial do maior país em relação ao menor país
    public double getRazaoTerritorial() {
        return (double) this.paisMaiorDimensao.getDimensao() / this.paisMenorDimensao.getDimensao();
    }
}

