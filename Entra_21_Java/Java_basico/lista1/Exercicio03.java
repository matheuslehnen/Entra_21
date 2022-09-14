package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, dobro, triplo;

        System.out.println("Digite um numero: ");
        n = entrada.nextInt();
        dobro = n * 2;
        triplo = n * 3;
        System.out.println(dobro);
        System.out.println(triplo);
    }



}