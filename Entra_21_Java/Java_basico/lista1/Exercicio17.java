package lista_exercicios.Java_basico.lista1;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ID, nascimento, anoIngresso, anoAtual, tempoServico, idade;

        System.out.println("Digite o codigo de identificacao do empregado: ");
        ID = entrada.nextInt();

        System.out.println("Informe o ano de nascimento do trabalhador: ");
        nascimento = entrada.nextInt();

        System.out.println("Informe o ano em que o trabalhador ingressou na empresa: ");
        anoIngresso = entrada.nextInt();

        System.out.println("Informe o ano atual: ");
        anoAtual = entrada.nextInt();

        tempoServico = anoAtual - anoIngresso;
        idade = anoAtual - nascimento;

        System.out.println(idade);
        System.out.println(tempoServico);
        System.out.println();


        if (idade >= 60 && tempoServico >= 25) {
            System.out.println("O trabalhador tem " + idade + " anos");
            System.out.println("O trabalhador tem " + tempoServico + " anos de servico");
            System.out.println("Requerer aposentadoria");
        } else if (idade > 65 || tempoServico >= 30) {
            System.out.println("O trabalhador tem " + idade + " anos");
            System.out.println("O trabalhador tem " + tempoServico + " anos de servico");
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("O trabalhador tem " + idade + " anos");
            System.out.println("O trabalhador tem " + tempoServico + " anos de servico");
            System.out.println("Nao requerer aposentadoria");
        }
    }
}
