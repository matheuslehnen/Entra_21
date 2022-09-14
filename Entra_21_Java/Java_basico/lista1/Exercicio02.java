package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = entrada.nextInt();
        System.out.println(--n);
        System.out.println(++n);
        System.out.println(++n);

    }

}
