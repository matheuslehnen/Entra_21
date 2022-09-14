package lista_exercicios.Java_basico.lista1;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] qtdFilhos = new int[6];
        double[] salario = new double[6];
        double somaSalario = 0;
        double mediaSalario = 0;
        int somaFilhos = 0;
        int mediaFilhos = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite a quantidade de filhos do " + i + ".o habitante");
            qtdFilhos[i] = entrada.nextInt();
            System.out.println("Digite o salario do " + i + ".o habitante");
            salario[i] = entrada.nextDouble();
            somaSalario = somaSalario + salario[i];
            somaFilhos = somaFilhos + qtdFilhos[i];
        }
        mediaSalario = somaSalario / 5;
        mediaFilhos = somaFilhos / 5;
        System.out.println("A media do salario dos 5 habitantes e : " + mediaSalario);
        System.out.println("A media de filhos dos 5 habitantes e : " + mediaFilhos);
    }
}



