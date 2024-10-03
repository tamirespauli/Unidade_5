import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaSerie = 0.0;
        for (int i = 1 ; i <= 20; i++){
            int numerador = 2 * i  + 1; 
            int denominador = i * (i + 1); 
            somaSerie += (double)  numerador/denominador;
        }
        System.out.println("A soma da série é: "+ somaSerie);
        teclado.close();
    }
}