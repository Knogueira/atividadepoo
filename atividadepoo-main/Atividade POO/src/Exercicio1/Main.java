package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int valor_contador;
        System.out.println("Digite o valor para o contador");
        valor_contador = leitura.nextInt();
        Contador contador = new Contador(valor_contador);
        System.out.println("O valor do contador " + contador.getContador());
        contador.incremento();
        contador.incremento();
        System.out.println("O valor do contador " + contador.getContador());
        contador.zerar();
        System.out.println("0 valor do contador " + contador.getContador());
    }
}