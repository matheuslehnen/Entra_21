package lista_exercicios.Java_basico.lista_array;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int i;
        int qtdElementosImpares = 0;
        int somaElementosImpares = 0;
        int mediaElementosImpares = 0;

        System.out.println("Digite 10 valores para preencher o array: ");

        for(i=0;i<10;i++){
            n[i] = entrada.nextInt();
            if(n[i] % 2 == 1){
                somaElementosImpares += n[i];
                qtdElementosImpares = qtdElementosImpares + 1;
            }
        }

        mediaElementosImpares = somaElementosImpares / qtdElementosImpares;
        System.out.println("A soma dos elementos impares do array e: " + somaElementosImpares);
        System.out.println("A quantidade de elementos impares do array e: " + qtdElementosImpares);
        System.out.println("A media dos elementos impares do array e: " + mediaElementosImpares);
    }



}