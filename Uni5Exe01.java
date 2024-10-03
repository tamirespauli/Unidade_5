/*
 Descreva um algoritmo que leia 20 números inteiros
  e escreva, para cada número lido, se o mesmo é par ou ímpar.
 */

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <20; i++){
        System.out.println("Escreva um valor maior que 0 e inteiro: ");
        int valor = teclado.nextInt();
        if (valor > 0) {
            if (valor % 2 == 0) {
                System.out.println("Valor é par");
            } else {
                System.out.println("O valor é impar");
            }
        } 
    }
        teclado.close();
    }
}
