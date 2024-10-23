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

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        System.out.println("Número\tDecomposição");

        // variável para o divisor inicial (começando pelo menor número primo 2)
        int divisor = 2;

        // Loop para decomposição
        while (numero > 1) {
            // verificar see o número é divisível pelo divisor atual
            if (numero % divisor == 0) {
                // exibe o número atual e o divisor
                System.out.println(numero + "\t" + divisor);
                // Atualiza o numero dividindo pelo divisor
                numero /= divisor;
            } else {
                // caso não seja divisivel incrementa o divisor (vai para o próximo número)
                divisor++;
            }
        }

        teclado.close();
    }
}

