package TerceiroDesafio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TerceiroDesafio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o tamanho do array e o valor alvo (separados por espaço): ");
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.print("Digite os elementos do array (separados por espaço): ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = countPairs(arr, k);
        System.out.println("Número de pares: " + count);

        in.close();
    }

    public static int countPairs(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            // verifica se o elemento atual - k ou o elemento atual + k estão no conjunto
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }

            // adiciona o elemento atual ao conjunto
            set.add(num);
        }

        return count;
    }
}

