package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] m = new float[3];
        float soma = 0;
        float media;
        int c;

        for (c = 1; c < 3; c++) {
            System.out.println("Digite a " + c + ".a media: ");
            m[c] = entrada.nextFloat();
            soma = soma + m[c];
        }
        media = soma / 2;
        System.out.println(soma);
        System.out.println(media);
    }
}
