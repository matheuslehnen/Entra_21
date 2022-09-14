package lista_exercicios.Java_basico.lista_string;
import java.util.Scanner;

public class Exercicio03 {

    static int a = 0;
    static int e = 0;
    static int i = 0;
    static int o = 0;
    static int u = 0;


    public static void contaVogais(String texto) {
        int tamanhoTexto = texto.length();
        texto.toLowerCase();
        for (int c = 0; c < tamanhoTexto; c++) {
            switch(texto.charAt(c)){
                case 97:
                    a++;
                    break;
                case 101:
                    e++;
                    break;
                case 105:
                    i++;
                    break;
                case 111:
                    o++;
                    break;
                case 117:
                    u++;
                    break;
            }
        }
    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o texto que deseja contar");
        String texto = teclado.nextLine();
        contaVogais(texto);
        System.out.println(texto);
        System.out.println("Letra a = " + a);
        System.out.println("Letra e = " + e);
        System.out.println("Letra i = " + i);
        System.out.println("Letra o = " + o);
        System.out.println("Letra u = " + u);
    }
}
