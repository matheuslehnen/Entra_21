package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioComAumento;

        System.out.println("Insira o salario do funcionario para calcular o valor final: ");
        salario = entrada.nextDouble();
        salarioComAumento = salario + (salario*0.15);
        System.out.printf("Um funcionario que ganhava R$ %.2f ", salario);
        System.out.println(", com 15% de aumento, passa a receber " + salarioComAumento);
    }
}
