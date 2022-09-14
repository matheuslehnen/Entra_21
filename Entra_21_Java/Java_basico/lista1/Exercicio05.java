package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float multa;
        int vel;

        System.out.println("Digite a velocidade do carro em km/h: ");
        vel = entrada.nextInt();

        if (vel > 80) {
            multa = (vel - 80) * 7;
            System.out.println("Voce foi multado e devera pagar " + multa + " reais de multa");
        }
    }

}