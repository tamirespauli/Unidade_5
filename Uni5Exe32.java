
/*
 Escreva um programa que imprime um calendário para um determinado mês.
  O calendário deve conter cada dia do mês e o dia da semana correspondente. 
  A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia 
  do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31

D	S	T	Q	Q	S	S
1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31		
 */


import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leitura do dia da semana em que o mês começa (1=Domingo, 2=Segunda,...,7=Sábado)
        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDia = teclado.nextInt();

        // Leitura do número de dias no mês
        System.out.print("Digite o número de dias no mês: ");
        int numeroDias = teclado.nextInt();

        // Impressão do cabeçalho do calendário
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        // Inicializa a contagem de dias
        int diaAtual = 1;

        // Contador para o dia da semana
        int diaDaSemana = primeiroDia;

        // Loop para imprimir os dias do mês
        while (diaAtual <= numeroDias) {
            // Imprime o dia atual
            System.out.print(diaAtual + "\t");

            // Incrementa o dia atual
            diaAtual++;

            // Verifica se é o final da semana
            if (diaDaSemana % 7 == 0) {
                System.out.println(); // Pula para a próxima linha ao final da semana
            }

            // Incrementa o dia da semana e reseta se passar de 7
            diaDaSemana++;
            if (diaDaSemana > 7) {
                diaDaSemana = 1; // Reseta para Domingo
            }
        }

        teclado.close();
    }
}
