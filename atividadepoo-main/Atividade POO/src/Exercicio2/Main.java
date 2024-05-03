package Exercicio2;

import Exercicio1.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando alguns países
        // Criando um continente
        Continente europa = new Continente("Europa");

        // Adicionando alguns países ao continente
        Pais alemanha = new Pais("Alemanha", 357022, 83783942);
        europa.adicionarPais(alemanha);

        Pais franca = new Pais("França", 551695, 65273511);
        europa.adicionarPais(franca);

        Pais italia = new Pais("Itália", 301340, 60461826);
        europa.adicionarPais(italia);

        // Exibindo informações sobre o continente Europa
        System.out.println("Nome do continente: " + europa.getNome());
        System.out.println("Dimensão total do continente: " + europa.getDimensaoTotal() + " km²");
        System.out.println("População total do continente: " + europa.getPopulacaoTotal());
        System.out.println("Densidade populacional do continente: " + europa.getDensidadePopulacional() + " pessoas/km²");
        System.out.println("País com maior população: " + europa.getPaisComMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + europa.getPaisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão: " + europa.getPaisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão: " + europa.getPaisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + europa.getRazaoTerritorial());
    }
}