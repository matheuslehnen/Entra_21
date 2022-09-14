package lista_exercicios.Java_basico.lista_array;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] origem = new int[10];
        int[] resultado = new int[10];
        int i;


        System.out.println("Digite 10 valores para preencher o array: ");
        for(i=0;i<10;i++){
            origem[i] = entrada.nextInt();
            if (origem[i] % 2 == 0){
                resultado[i] = 1;
            } else if(origem[i] % 2 == 1){
                resultado[i] = 0;
            }
        }
        System.out.print("{ ");
        for(i=0;i<10;i++){
            System.out.print(origem[i] + ", ");
        }
        System.out.println("}");

        System.out.print("{ ");
        for(i=0;i<10;i++){
            System.out.print(resultado[i] + ", ");
        }
        System.out.println("}");

    }

}