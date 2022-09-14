package lista_exercicios.Java_basico.lista_array;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int i;
        int qtdPares = 0;

        System.out.println("Digite 10 valores para preencher o array: ");
        for(i=0;i<10;i++){
            n[i] = entrada.nextInt();
            if (n[i] % 2 == 0){
                qtdPares++;
            }
        }
        for(i=0;i<10;i++){
            System.out.println("A quantidade de numeros pares e: " + qtdPares);
            n[i] = entrada.nextInt();
        }
    }
}
