package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double produto, produtoComDesconto;

        System.out.println("Insira um valor para o produto: ");
        produto = entrada.nextDouble();
        produtoComDesconto = produto - (produto * 0.05);
        System.out.println(produtoComDesconto);
    }
}