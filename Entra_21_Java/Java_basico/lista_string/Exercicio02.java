package lista_exercicios.Java_basico.lista_string;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {

    public static int contaPalavras(String texto, String palavra) {
        int contagem = 0;
        int i;

        String[] palavras = texto.split("\\s+");
        for (i = 0; i < palavras.length; i++){
            if (Objects.equals(palavras[i], palavra)){
                contagem++;
            }
        }
        return contagem;
    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String texto;
        String palavra;
        int resultado;


        System.out.println("Digite uma frase:");
        texto = teclado.nextLine();

        System.out.println("Digite uma palavra:");
        palavra = teclado.nextLine();

        resultado = contaPalavras(texto, palavra);

        System.out.println(texto);
        System.out.println("A palavra '" + palavra + "' aparece " + resultado + " vezes no texto.");
    }

}
