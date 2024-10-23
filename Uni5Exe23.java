/* Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês,
 que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês,
  vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. 
  O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor.
   Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar
    a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada
     vendedor deve ser informado. */

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do vendedor: ");
            String nomeVendedor = teclado.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int n = teclado.nextInt();

            double totalVendas = 0.0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": ");
                double precoUnitario = teclado.nextDouble();
                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidadeVendida = teclado.nextInt();

                // Calcula o total de vendas para o produto
                totalVendas += precoUnitario * quantidadeVendida;
            }

            // Calcula o salário do vendedor
            double salario = totalVendas * 0.30;

            // Exibe o relatório
            System.out.println("\nRelatório do Vendedor:");
            System.out.println("Nome: " + nomeVendedor);
            System.out.printf("Total de Vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário: R$ %.2f%n", salario);

            // Pergunta se deseja digitar os dados de mais um vendedor
            System.out.print("\nDeseja digitar os dados de mais um vendedor? (s/N): ");
            char resposta = teclado.next().charAt(0);
            teclado.nextLine(); // Limpa o buffer do scanner

            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }

        teclado.close();

    }
}
