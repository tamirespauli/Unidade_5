/*
Implemente o problema da mochila. Tendo-se uma sequência decrescente 
de números inteiros positivos que inicia em N, com decremento inteiro positivo K,
 deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro
  dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros
   e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila.
 */



import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leitura dos valores de N, K e M
        System.out.print("Digite o valor de N (início da sequência): ");
        int N = teclado.nextInt();
        System.out.print("Digite o valor de K (decremento): ");
        int K = teclado.nextInt();
        System.out.print("Digite o valor de M (capacidade da mochila): ");
        int M = teclado.nextInt();

        // Variáveis para acumular a soma dos elementos
        int somaDentroMochila = 0;
        int somaForaMochila = 0;

        // Strings para armazenar os elementos que entram e ficam fora da mochila
        String elementosDentroMochila = "";
        String elementosForaMochila = "";

        // Exibe todos os elementos da sequência
        System.out.print("Elementos da sequência: ");
        int valorAtual = N;
        while (valorAtual > 0) {
            System.out.print(valorAtual + " ");
            valorAtual -= K;
        }
        System.out.println();

        // Reinicia o valorAtual para N
        valorAtual = N;

        // Laço para empacotar os itens na mochila
        while (valorAtual > 0) {
            if (somaDentroMochila + valorAtual <= M) {
                // Se o valor pode entrar na mochila, adiciona-o
                somaDentroMochila += valorAtual;
                elementosDentroMochila += valorAtual + " ";
            } else {
                // Se não couber na mochila, adiciona aos elementos fora
                somaForaMochila += valorAtual;
                elementosForaMochila += valorAtual + " ";
            }
            // Decrementa o valor atual pela constante K
            valorAtual -= K;
        }

        // Exibe os resultados
        System.out.println("Elementos que entraram na mochila: " + elementosDentroMochila);
        System.out.println("Elementos que ficaram fora da mochila: " + elementosForaMochila);
        System.out.println("Soma dos elementos dentro da mochila: " + somaDentroMochila);
        System.out.println("Soma dos elementos fora da mochila: " + somaForaMochila);

        teclado.close();
    }
}