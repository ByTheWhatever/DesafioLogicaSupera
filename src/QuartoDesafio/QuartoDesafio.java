package QuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println();
            System.out.println(linhaDecifrada);
        }

        scanner.close();
    }

    public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder frase1 = new StringBuilder(linha.substring(0, tamanho / 2));
        StringBuilder frase2 = new StringBuilder(linha.substring(tamanho / 2));
        frase1.reverse();
        frase2.reverse();
        return frase1.toString() + frase2.toString();
    }
}

