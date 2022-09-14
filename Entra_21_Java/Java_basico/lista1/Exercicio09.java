package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int t, c, r;

        System.out.println("Digite um valor para saber sua tabuada: ");
        t = entrada.nextInt();
        for (c = 1; c < 11; c++) {
            r = t * c;
            System.out.println(t + " x " + c + " = " + r);
        }
    }
}