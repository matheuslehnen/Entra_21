package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[2];
        int c;
        int soma = 0;

        for (c = 0; c < 2; c++) {
            System.out.println("Digite o " + c + ".o numero");
            n[c] = entrada.nextInt();
        }
        for (c = 0; c < 2; c++) {
            soma = soma + n[c];
            System.out.println("A soma entre os 2 valores do array e " + soma);
        }
    }
}
