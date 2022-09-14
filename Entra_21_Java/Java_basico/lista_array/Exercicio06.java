package lista_exercicios.Java_basico.lista_array;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] n = new int[3];
        int i, c;


        System.out.println("Digite 3 valores entre 1 e 9 para preencher o array: ");
        for(i=0;i<3;i++){
            do {
                n[i] = entrada.nextInt();
                if (n[i]<=0 || n[i] > 9) {
                    System.out.println("Insira valores validos: ");
                }
            } while(n[i]<=0 || n[i] > 9);
        }

        for(i=0;i<3;i++) {
            for (c = 1; c <= 10; c++) {
                System.out.print(n[i] + " x " + c + " = " + n[i] * c);
                System.out.println();
            }
            System.out.println();
        }
    }
}
