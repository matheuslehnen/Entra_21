package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float largura, altura, area, qtdTinta;

        System.out.println("Insira a largura da parede em metros: ");
        largura = entrada.nextFloat();
        System.out.println("Insira a altura da parede em metros: ");
        altura = entrada.nextFloat();

        area = altura * largura;
        System.out.println(area);
        qtdTinta = area / 2;
        System.out.println("A quantidade de tinta necessaria e " + qtdTinta + " litros");
    }
}
