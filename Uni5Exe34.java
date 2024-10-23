/*
 Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. 
A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a
 ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
 Caso a opção escolhida seja a terceira finalize a execução do algoritmo.
 */

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contasEncerradas = 0;
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    // Encerrar a conta de um hóspede
                    System.out.print("Digite o nome do hóspede: ");
                    teclado.nextLine(); // Limpa o buffer
                    String nomeHóspede = teclado.nextLine();

                    System.out.print("Digite o número de diárias: ");
                    int diarias = teclado.nextInt();

                    double taxaServico;

                    if (diarias < 15) {
                        taxaServico = 7.50;
                    } else if (diarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }

                    double total = (50.00 * diarias) + (taxaServico * diarias);
                    contasEncerradas++;

                    System.out.printf("Nome: %s%n", nomeHóspede);
                    System.out.printf("Total a ser pago: R$ %.2f%n", total);
                    break;

                case 2:
                    // Verificar número de contas encerradas
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrado");
                    break;

                default:
                    System.out.println("Opção incorreta. Tente novamente.");
            }
        } while (opcao != 3);
        teclado.close();
    }
}