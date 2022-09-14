package lista_exercicios.Java_basico.lista_string;
import java.util.Scanner;

public class Exercicio05
{


    public static String separaVerbo(String verbo){
        String[] verboSeparado = verbo.split("ar");
        String radical = verboSeparado[0];
        return radical;
    }

    public static void conjugaVerbo(String verbo){
        String radical = separaVerbo(verbo);
        String[] pessoa = {"Eu", "Tu", "Ele", "Nos", "Vos", "Eles"};
        String[] conjugacao = {"o", "as", "a", "amos", "ais", "am"};
        String[] verboConjugado = new String[6];

        for(int i = 0; i < 6; i++){
            verboConjugado[i] = radical + conjugacao[i];
        }
        for(int i = 0; i < 6; i++){
            System.out.println(pessoa[i] + " " + verboConjugado[i]);
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um verbo regular terminado em 'ar': ");
        String verbo = teclado.next();
        conjugaVerbo(verbo);

    }

}