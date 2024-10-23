/*
Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

código	  conjunto
1	      Nenhum de Nós
2	      CPM22
3	      Skank
4	      Jota Quest
Descreva um algoritmo que:

informe o total de votos para cada grupo;
informe o percentual dos votos para cada grupo;
informe o grupo vencedor.
O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados. 
 */

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;

        char continuar = 's'; // Controla a repetição da votação
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o código do conjunto (1. Nenhum de Nós, 2. CPM22, 3. Skank, 4. Jota Quest): ");
            int voto = teclado.nextInt();
            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    continue;
            }
            totalVotos++;
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = teclado.next().charAt(0);
        }

        // Verifica se houve votos e exibe os resultados
        if (totalVotos > 0) {
            System.out.println("\nTotal de votos:");
            System.out.println("Nenhum de Nós: " + votosNenhumDeNos);
            System.out.println("CPM22: " + votosCPM22);
            System.out.println("Skank: " + votosSkank);
            System.out.println("Jota Quest: " + votosJotaQuest);

            System.out.printf("Percentual de votos para Nenhum de Nós: %.2f%%%n",
                    (votosNenhumDeNos * 100.0 / totalVotos));
            System.out.printf("Percentual de votos para CPM22: %.2f%%%n", (votosCPM22 * 100.0 / totalVotos));
            System.out.printf("Percentual de votos para Skank: %.2f%%%n", (votosSkank * 100.0 / totalVotos));
            System.out.printf("Percentual de votos para Jota Quest: %.2f%%%n", (votosJotaQuest * 100.0 / totalVotos));

            // grupo vencedor
            int maxVotos = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));
            if (maxVotos == votosNenhumDeNos) {
                System.out.println("O grupo vencedor é: Nenhum de Nós");
            } else if (maxVotos == votosCPM22) {
                System.out.println("O grupo vencedor é: CPM22");
            } else if (maxVotos == votosSkank) {
                System.out.println("O grupo vencedor é: Skank");
            } else {
                System.out.println("O grupo vencedor é: Jota Quest");
            }
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        teclado.close();
    }
}