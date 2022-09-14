package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String aluno;
        float[] n = new float[3];
        float freq;
        float soma = 0;
        float media;
        int c;

        System.out.println("Digite o nome do aluno: ");
        aluno = entrada.nextLine();
        for (c = 1; c < 3; c++) {
            System.out.println("Digite a " + c + ".a nota: ");
            n[c] = entrada.nextFloat();
        }
        System.out.println("Digite a frequencia do aluno: ");
        freq = entrada.nextFloat();
        for (c = 1; c < 3; c++) {
            soma = soma + n[c];
        }
        media = soma / 2;

        if (media >= 6 && freq >= 70) {
            System.out.println("O aluno " + aluno + " esta aprovado com media: " + media + " e frequencia " + freq + "%");
        } else {
            System.out.println("O aluno " + aluno + " esta reprovado com media: " + media + " e frequencia " + freq + "%");
        }
    }
}
