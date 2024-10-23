/*
 Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. 
 Faça um programa que leia um valor e informe a quantidade mínima de
  cédulas que ele precisará combinar para entregar o valor solicitado. 
  Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. 
  Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.


 */

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor a ser sacado: ");
        int valor = teclado.nextInt();
        int cedulas20 = 0;
        int cedulas10 = 0;
        int cedulas5 = 0;
        int cedulas2 = 0;
        int cedulas1 = 0;

        // cedulas de 20
        while (valor >= 20) {
            cedulas20++;
            valor -= 20;
        }

        // cedulas de 10
        while (valor >= 10) {
            cedulas10++;
            valor -= 10;
        }

        // cedulas de 5
        while (valor >= 5) {
            cedulas5++;
            valor -= 5;
        }

        // cedulas de 2
        while (valor >= 2) {
            cedulas2++;
            valor -= 2;
        }

        // cedulas de 1
        while (valor >= 1) {
            cedulas1++;
            valor -= 1;
        }

        System.out.println("Quantidade de cédulas:");
        if (cedulas20 > 0) {
            System.out.println("Cédulas de 20: " + cedulas20);
        }
        if (cedulas10 > 0) {
            System.out.println("Cédulas de 10: " + cedulas10);
        }
        if (cedulas5 > 0) {
            System.out.println("Cédulas de 5: " + cedulas5);
        }
        if (cedulas2 > 0) {
            System.out.println("Cédulas de 2: " + cedulas2);
        }
        if (cedulas1 > 0) {
            System.out.println("Cédulas de 1: " + cedulas1);
        }

        teclado.close();
    }
}