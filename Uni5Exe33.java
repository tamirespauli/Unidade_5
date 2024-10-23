/*
 Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.
 */

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        int voto;
        do {
            System.out.print(
                    "Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar): ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Tente novamente.");
            }
        } while (voto != 0);
        System.out.println("\nResultado da Eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Candidato 4: " + votosCandidato4 + " votos");
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBrancos);

        // Cálculo de percentuais
        if (totalVotos > 0) {
            double percentualNulos = (votosNulos * 100.0) / totalVotos;
            double percentualBrancos = (votosBrancos * 100.0) / totalVotos;

            System.out.printf("Percentual de Votos Nulos: %.2f%%%n", percentualNulos);
            System.out.printf("Percentual de Votos em Branco: %.2f%%%n", percentualBrancos);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }
        teclado.close();
    }
}