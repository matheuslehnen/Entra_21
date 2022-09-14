package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double reais, cotacao, dolares;

        System.out.println("Diga quantos reais voce tem na carteira: ");
        reais = entrada.nextDouble();
        cotacao = 5.90;
        dolares = reais / cotacao;
        System.out.printf("Com R$ %.2f", reais);
        System.out.printf(" voce consegue comprar USD %.2f %n ", dolares);
    }

}