package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int m = 0;
        int km = m / 1000;
        int cm = m * 100;
        int mm = m * 1000;

        System.out.println("Digite um valor em metros: ");
        m = entrada.nextInt();
        System.out.println(m + "m em Km e" + km);
        System.out.println(m + "m em cm e" + cm);
        System.out.println(m + "m em mm e" + mm);
    }
}
