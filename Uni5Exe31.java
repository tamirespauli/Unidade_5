/* Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

número	decomposição
180	       2
90	       2
45	       3
15	       3
5	       5
1	
*/


import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leitura do número a ser decomposto
        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        // Exibe o cabeçalho da decomposição
        System.out.println("Número\tDecomposição");

        // Variável para o divisor inicial (começando pelo menor número primo, que é 2)
        int divisor = 2;

        // Loop para decomposição
        while (numero > 1) {
            // Se o número é divisível pelo divisor atual
            if (numero % divisor == 0) {
                // Exibe o número atual e o divisor
                System.out.println(numero + "\t" + divisor);
                // Atualiza o número, dividindo pelo divisor
                numero /= divisor;
            } else {
                // Caso não seja divisível, incrementa o divisor (vai para o próximo número)
                divisor++;
            }
        }

        teclado.close();
    }
}

