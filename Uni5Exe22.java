import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Definindo o ano inicial e o salário inicial
        
        double salarioInicial = 2000.00;

        // Definindo o primeiro aumento
        double aumento = 1.5; // em %

        // Solicita o ano atual
        System.out.print("Informe o ano atual: ");
        int anoAtual = teclado.nextInt();

        // Inicialmente o salário é o valor de contratação
        double salarioAtual = salarioInicial;

        // O loop começa a contar os aumentos a partir de 1996
        for (int ano = 1996; ano <= anoAtual; ano++) {
            // Aplicar o aumento no salário atual
            salarioAtual += salarioAtual * (aumento / 100);

            // Aumentar o percentual para o próximo ano (dobra a cada ano)
            aumento *= 2;
        }

        // Exibir o salário final
        System.out.printf("O salário atual do funcionário em %d é: R$ %.2f\n", anoAtual, salarioAtual);

        teclado.close();

    }
}
