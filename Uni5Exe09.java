/*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos. */

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = teclado.nextInt();
        teclado.nextLine(); // Consumir o \n após a leitur a do número de alunos

        int quantidadeAcimaDeVinte = 0;
        String alunosCom18 = "";

        // ler nome e idade de cada aluno
        for (int i = 1; i <= n; i++) {
            System.out.print("Nome do " + i + "º aluno: ");
            String nome = teclado.nextLine();

            System.out.print("Idade do " + i + "º aluno: ");
            int idade = teclado.nextInt();
            teclado.nextLine(); // Consumir o \n após a leitura da idade

            // Verifica se o aluno tem 18 anos e armazena o nome
            if (idade == 18) {
                alunosCom18 += nome + "\n";
            }

            // alunos com idade acima de 20 anos
            if (idade > 20) {
                quantidadeAcimaDeVinte++;
            }
        }
        // alunos que têm 18 anos
        if (!alunosCom18.isEmpty()) {
            System.out.println("Alunos que têm 18 anos:");
            System.out.print(alunosCom18);
        } else {
            System.out.println("Nenhum aluno tem 18 anos.");
        }
        // quantidade de alunos com idade acima de 20 anos
        System.out.println("Quantidade de alunos com mais de 20 anos: " + quantidadeAcimaDeVinte);

        teclado.close();
    }
}