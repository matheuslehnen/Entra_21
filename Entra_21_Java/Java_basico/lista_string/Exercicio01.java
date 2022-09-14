package lista_exercicios.Java_basico.lista_string;
import java.util.Scanner;

public class Exercicio01
{

    public static int contaPalavras(String texto) {
        String[] palavras = texto.split("\\s+");
        int contagem = palavras.length;
        return contagem;
    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int resultado;

        System.out.println("Digite o texto que deseja contar");
        String texto = teclado.nextLine();
        resultado = contaPalavras(texto);
        System.out.println("O texto tem " + resultado + " palavras.");
    }
}

