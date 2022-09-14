package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] n = new float[5];
        float media;
        float soma = 0;
        int c;

        for (c = 1; c < 5; c++) {
            System.out.println("Insira a " + c + ".a nota: ");
            n[c] = entrada.nextFloat();
            soma = soma + n[c];
        }
        media = soma / 4;

        if (media < 6) {
            System.out.println("A media do estudante e " + media + " e o aluno esta reprovado");
        } else if (media >= 6 && media < 7) {
            System.out.println("A media do estudante e " + media + " e o aluno esta de prova final");
        } else {
            System.out.println("A media do estudante e " + media + " e o aluno esta aprovado");
        }
    }

}
