package lista_exercicios.Java_basico.lista_string;

import java.util.Scanner;

public class Cifra_de_Cesar {


    public static String codificar(int chave, String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();

        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = texto.charAt(c) + chave;
            textoCifrado.append((char) letraCifradaASCII);
        }
        return textoCifrado.toString();
    }


    public static String decodificar(int chave, String textoCifrado) {
        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = textoCifrado.length();

        for (int c = 0; c < tamanhoTexto; c++) {
            int letraDecifradaASCII = textoCifrado.charAt(c) - chave;
            texto.append((char) letraDecifradaASCII);
        }
        return texto.toString();
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o texto que deseja cifrar");
        String texto = teclado.nextLine();
        System.out.println("Digite a chave");
        int chave = teclado.nextInt();

        String textoCriptografado = codificar(chave, texto);
        System.out.println(textoCriptografado);

        String textoDecriptografado = decodificar(chave, textoCriptografado);
        System.out.println(textoDecriptografado);

    }


}
