package lista_exercicios.Java_basico.lista_string;
import java.util.Scanner;

public class Exercicio04 {


    public static int contaPalavras(String palavra) {
        int contagem = palavra.length();
        return contagem;
    }

    public static int contaVogais(String palavra) {
        int qtdVogal = 0;

        palavra.toLowerCase();
        for (int c = 0; c < palavra.length(); c++) {
            if(palavra.charAt(c) == 97 || palavra.charAt(c) == 101 || palavra.charAt(c) == 105 || palavra.charAt(c) == 111 || palavra.charAt(c) == 117){
                qtdVogal++;
            }
        }
        return qtdVogal;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int resultado, qtdVogais;

        System.out.println("Digite a palavra que deseja contar");
        String palavra = teclado.next();
        resultado = contaPalavras(palavra);
        qtdVogais = contaVogais(palavra);

        System.out.println("A palavra tem " + resultado + " letras.");
        System.out.println("Maiusculo: " + palavra.toUpperCase());
        System.out.println("A palavra tem " + qtdVogais + " vogais.");
    }
}
