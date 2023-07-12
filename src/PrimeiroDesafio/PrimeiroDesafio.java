package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: "); // entrada da quantidade de números
        int n = in.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite os valores:"); // entrada dos valores
        for (int i = 0; i < n; i++) {
            int valor = in.nextInt();

            if (valor % 2 == 0) { // adiciona os valores pares na lista, baseado na divisão por 2
                pares.add(valor);
            } else { // adiciona os valores ímpares na lista
                impares.add(valor);
            }
        }

        Collections.sort(pares); // ordena a lista de pares em ordem crescente
        Collections.sort(impares, Collections.reverseOrder()); // ordena a lista de ímpares em ordem decrescente

        for (int valor : pares) {
            System.out.println(valor); // saída dos valores pares em ordem crescente
        }

        for (int valor : impares) {
            System.out.println(valor); // saída dos valores ímpares em ordem decrescente
        }

        in.close();

    }
}
