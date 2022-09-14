package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cc;

        float saldo, debito, credito, saldoAtual;

        System.out.println("Informe o numero da sua conta: ");
        cc = entrada.nextInt();
        System.out.println("Informe seu saldo: ");
        saldo = entrada.nextFloat();
        System.out.println("Informe se houve algum debito: ");
        debito = entrada.nextFloat();
        System.out.println("Informe se houve algum credito: ");
        credito = entrada.nextFloat();

        saldoAtual = saldo + credito - debito;
        if (saldoAtual < 0) {
            System.out.printf("Seu saldo e R$ %.2f  ", saldoAtual);
        } else {
            System.out.printf("Seu saldo e R$ %.2f", saldoAtual);
        }
    }

}
