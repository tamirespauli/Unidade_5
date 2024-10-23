import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int n;
    
            // Lê o valor de n e garante que seja maior que 2
            do {
                System.out.print("Digite um valor para n (maior que 2): ");
                n = teclado.nextInt();
            } while (n <= 2);
    
            // Exibe os n primeiros termos da sequência
            System.out.println("Os " + n + " primeiros termos da sequência são:");
    
            for (int i = 0; i < n; i++) {
                int termo;
                if (i % 2 == 0) {
                    // Posições 0, 2, 4, ...: potências de 2 (8, 16, 32, 64)
                    termo = (int) Math.pow(2, (i / 2 + 3)); // Começa em 2^3 = 8
                } else {
                    // Posições 1, 3, 5, ...: potências de 2 + 2 (10, 18, 34)
                    termo = (int) Math.pow(2, (i / 2 + 3)) + 2;
                }
                System.out.print(termo + " ");
            }
    
            System.out.println(); // Nova linha após exibir todos os termos
    
            teclado.close();
    }
}
