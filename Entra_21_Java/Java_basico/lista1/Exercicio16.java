package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoMorango, precoMorango, pesoMaca, precoMaca, Peso, precoTotal;

        System.out.println("Insira a quantidade, em Kg, de morangos que deseja comprar: ");
        pesoMorango = entrada.nextDouble();
        precoMorango = pesoMorango * 2.5;


        System.out.println("Insira a quantidade, em Kg, de Maca que deseja comprar: ");
        pesoMaca = entrada.nextDouble();
        precoMaca = pesoMaca * 1.8;

        Peso = pesoMorango + pesoMaca;
        precoTotal = precoMorango + precoMaca;

        if (Peso > 8 || precoTotal > 25) {
            precoMorango = pesoMorango * 2.20;
            precoMaca = pesoMaca * 1.5;
            precoTotal = precoMorango + precoMaca;
            System.out.printf("O valor a ser pago pelo cliente e: R$ %.2f %n ", precoTotal);
        } else {
            System.out.printf("O valor a ser pago pelo cliente e: R$ %.2f %n ", precoTotal);
        }
    }

}
