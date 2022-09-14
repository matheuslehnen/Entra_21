package lista_exercicios.Java_basico.lista_array;
import java.util.Scanner;

public class Exercicio02
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int i;
        int somaElementos = 0;

        System.out.println("Digite 10 valores para preencher o array: ");

        for(i=0;i<10;i++){
            n[i] = entrada.nextInt();
            somaElementos += n[i];
        }
        System.out.println("A soma dos elementos do array e: " + somaElementos);
    }

}
