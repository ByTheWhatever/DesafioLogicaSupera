package SegundoDesafio;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // para configurar o separador ponto

        System.out.print("Digite o valor: R$ ");
        double valor = in.nextDouble();

        int reais = (int) valor; // valor inteiro
        int centavos = (int) Math.round((valor - reais) * 100); // valor em double, convertido para centavos

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (
                int nota : notas) {
            int quantidadeNotas = reais / nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            reais %= nota;
        }

        System.out.println("MOEDAS:");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("0.00", decimalFormatSymbols); // formato para exibir as moedas com duas casas decimais e separador decimal ponto
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (centavos / (moeda * 100)); // lógica para cálculo das moedas
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + decimalFormat.format(moeda));
            centavos %= moeda * 100; // resto da conta
        }

        in.close();

    }
}
