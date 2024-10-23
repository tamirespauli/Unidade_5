/*
 Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário conforme as regras descritas abaixo. Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. O programa deve validar a leitura do dia deforma a aceitar apenas valores válidos para o mês de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

Regras:

para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.
Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:

qual dia ocorreu a maior produção;
em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).
Exemplo de entrada / saída:
 */

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maiorProducaoDia = -1;
        int maiorProducaoTotal = 0;
        int producaoManhaTotal = 0;
        int producaoTardeTotal = 0;
        int continuar = 1;

        while (continuar == 1) {
            // le e valida o dia do mês de abril
            int dia = -1;
            while (dia < 1 || dia > 30) {
                System.out.print("Digite o dia do mês de Abril (1 a 30): ");
                dia = teclado.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            }
            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            int producaoManha = teclado.nextInt();
            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            int producaoTarde = teclado.nextInt();
            int producaoTotal = producaoManha + producaoTarde;
            double valorRecebido;

            if (dia <= 15) {
                // Primeira quinzena
                if (producaoTotal > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = producaoTotal * 0.80;
                } else {
                    valorRecebido = producaoTotal * 0.50;
                }
            } else {
                // Segunda quinzena
                valorRecebido = (producaoManha * 0.40) + (producaoTarde * 0.30);
            }

            System.out.printf("R$ %.2f (valor recebido)%n", valorRecebido);

            // Atualiza o dia de maior produção
            if (producaoTotal > maiorProducaoTotal) {
                maiorProducaoTotal = producaoTotal;
                maiorProducaoDia = dia;
            }

            // atualiza as produções totais da manhã e tarde
            producaoManhaTotal += producaoManha;
            producaoTardeTotal += producaoTarde;
            System.out.print("Novo funcionário (1.sim 2.não)? ");
            continuar = teclado.nextInt();
        }
        System.out.println("Dia com maior produção: " + maiorProducaoDia + " com " + maiorProducaoTotal + " peças.");
        if (producaoManhaTotal > producaoTardeTotal) {
            System.out.println("Maior produção foi no turno da manhã com " + producaoManhaTotal + " peças.");
        } else {
            System.out.println("Maior produção foi no turno da tarde com " + producaoTardeTotal + " peças.");
        }

        teclado.close();
    }
}
