// Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0; // acumular a soma das alturas
        int totalPessoas = 20;
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Altura da pessoa " + i + ": ");
            double altura = teclado.nextDouble();
            soma += altura; // Acumula as alturas
        }
        double media = soma / totalPessoas;
        System.out.println("Média de altura: " + media);
        teclado.close();
    }
}