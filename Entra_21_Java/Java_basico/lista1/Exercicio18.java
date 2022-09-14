package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] salario = new float[5];
        int[] filhos = new int[5];
        float somaSalario = 0;
        float mediaSalario;
        float maiorSalario = 0;
        int somaFilho = 0;
        int mediaFilho;
        int qtdSalarioMin = 0;
        int c;

        for (c = 1; c < 5; c++) {
            System.out.println("Informe o salario do " + c + ".o habitante: ");
            salario[c] = entrada.nextFloat();
            somaSalario = somaSalario + salario[c];
            maiorSalario = salario[1];
            System.out.println("Informe quantos filhos o " + c + ".o habitante tem: ");
            filhos[c] = entrada.nextInt();
            somaFilho = somaFilho + filhos[c];

            //Salva o maior salario digitado.
            if (salario[c] > salario[1]) {
                maiorSalario = salario[c];
            }
            if (salario[c] < 150) {
                qtdSalarioMin = qtdSalarioMin + 1;
            }
        }
        mediaSalario = somaSalario / 4;
        mediaFilho = somaFilho / 4;
        System.out.println("A media de salario da populacao e " + mediaSalario);
        System.out.println("O media de filhos da populacao e " + mediaFilho);
        System.out.println("O maior salario e " + maiorSalario);
        System.out.println("Existem " + qtdSalarioMin + " pessoas com salario inferior a R$ 150,00");
    }
}
