/* Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos. */

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double somaPositivos = 0;
        int qtdPositivos = 0;
        int menorNegativo = 0;
        boolean temNegativo = false;

        System.out.print("Digite a quantidade de números que deseja inserir (positivos e negativos):");
        int quantN = teclado.nextInt();

        // Leitura do primeiro número
        System.out.print("1° número: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            menorNegativo = numero;
            temNegativo = true; // Marca que há números negativos
        } else if (numero > 0) {
            somaPositivos += numero;
            qtdPositivos++;
        }

        // Laço que lê os outros números
        for (int i = 2; i <= quantN; i++) {
            System.out.print(i + "° número: ");
            numero = teclado.nextInt();

            if (numero < 0) {
                if (!temNegativo || numero < menorNegativo) {
                    menorNegativo = numero;
                    temNegativo = true;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                qtdPositivos++;
            }
        }

        // Cálculo e exibição da média dos números positivos
        if (qtdPositivos > 0) {
            double mediaPositivos = somaPositivos / qtdPositivos;
            System.out.println("Média dos números positivos: " + mediaPositivos);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }

        // Exibição do menor valor negativo
        if (temNegativo) {
            System.out.println("O menor valor negativo: " + menorNegativo);
        } else {
            System.out.println("Nenhum número negativo foi inserido.");
        }

        teclado.close();
    }
}