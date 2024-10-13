/*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd */

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lê um número inteiro positivo n
        System.out.println("Digite um número inteiro positivo: ");
        int n = teclado.nextInt();

        int cont = 1;
        for (int i = 1; i <= n; i++) { // i representa a linha atual
            for (int jElementos = 1; jElementos <= i; jElementos++) { // número de elementos na linha
                System.out.print(cont + " "); // Imprime o contador
                cont++; // Incrementa o contador para o próximo número
            }
            System.out.println(); // Muda de linha após imprimir os números da linha atual
        }

        teclado.close(); // Fecha o scanner
    }
}
