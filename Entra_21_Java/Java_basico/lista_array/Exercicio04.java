package lista_exercicios.Java_basico.lista_array;

import java.util.Scanner;

public class Exercicio04 {



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] situacao = new String[5];
        String[] aluno = new String[5];
        double[][] nota = new double[5][4];
        double[] soma = new double[5];
        double[] media = new double[5];
        int l, c, j;


        for(l=1;l<5;l++){

            System.out.println("Digite o nome do " + l  + " aluno: ");
            aluno[l] = entrada.nextLine();
            if(l >= 2) {
                aluno[l] = entrada.nextLine();
            }

            for (c = 1; c < 3; c++) {
                System.out.println("Digite a " + c + ".a nota: ");
                nota[l][c] = entrada.nextDouble();
                soma[l] = soma[l] + nota[l][c];
            }
            media[l] = soma[l] / 2;
            if (media[l] >= 7) {
                situacao[l] = "Aprovado";
            } else if (media[l] >= 6 && media[l] < 7){
                situacao[l] = "Em recuperacao";
            } else {
                situacao[l] = "Reprovado";
            }
        }

        for(l=1;l<5;l++) {
            System.out.println();
            System.out.println("Aluno: " + aluno[l]);
            for (c = 1; c < 3; c++) {
                System.out.println("Nota " + c + " : " + nota[l][c]);
            }
            System.out.println("Media: " + media[l]);
            System.out.println("Situacao: " + situacao[l]);
            System.out.println();
        }

    }
}
