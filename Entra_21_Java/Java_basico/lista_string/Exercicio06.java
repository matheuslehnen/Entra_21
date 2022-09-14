package lista_exercicios.Java_basico.lista_string;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio06 {

    public static void trocaPalavra(String texto, String palavra1, String palavra2) {
        String[] palavras = texto.split("\\s+");
        int tamanhoTexto = palavras.length;
        for (int i = 0; i < tamanhoTexto; i++) {
            if (Objects.equals(palavras[i], palavra1)) {
                palavras[i] = palavra2;
            }
        }
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um texto");
        String texto = teclado.nextLine();
        System.out.println("Digite a palavra que sera substituida:");
        String palavra1 = teclado.next();

        System.out.println("Digite a palavra que sera inserida:");
        String palavra2 = teclado.next();

        trocaPalavra(texto, palavra1, palavra2);
    }

}