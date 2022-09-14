import java.util.Scanner;

public class Exercicio_Desafio_Maquina_de_Lavar {

    static Scanner entrada = new Scanner(System.in);

    static String modelo, nome, voltagem;
    static int[] estagio = new int[6];
    static int op, c, peso, t1, t2, t3, t4, t5;
    static double progresso = 20.00;


    public static void menu() {
        System.out.println("======================================");
        System.out.println("          MENU DE SIMULACAO         ");
        System.out.println("======================================");
        System.out.println();
        System.out.println("1 - Configurar a maquina de lavar");
        System.out.println("2 - Simular a maquina de lavar");
        System.out.println("0 - Sair");
        System.out.println("Digite o codigo: ");
        op = entrada.nextInt();
    }

    public static void menuConfiguracao() {
        System.out.println("======================================");
        System.out.println("   CONFIGURACAO DA MAQUINA DE LAVAR   ");
        System.out.println("======================================");
        System.out.println();
        System.out.print("Digite o modelo: ");
        modelo = entrada.next();
        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();
        nome = entrada.nextLine();
        System.out.print("Voltagem (110V ou 220V): ");
        voltagem = entrada.next();
        System.out.print("Quantos kg? ");
        peso = entrada.nextInt();
        System.out.println();
        for (c = 1; c < 6; c++) {
            System.out.print("Duracao do Estagio " + c);
            if (c == 1) {
                System.out.print(" - Lavacao Pesada: ");
                estagio[c] = entrada.nextInt();
                t1 = (estagio[c] * 1000) / 5 ;
            } else if (c == 2) {
                System.out.print(" - Lavacao Normal: ");
                estagio[c] = entrada.nextInt();
                t2= (estagio[c] * 1000) / 5;
            } else if (c == 3) {
                System.out.print(" - Lavacao Rapida: ");
                estagio[c] = entrada.nextInt();
                t3 = (estagio[c] * 1000) / 5;
            } else if (c == 4) {
                System.out.print(" - Enxague: ");
                estagio[c] = entrada.nextInt();
                t4 = (estagio[c] * 1000) / 5;
            } else if (c == 5) {
                System.out.print(" - Centrifuga: ");
                estagio[c] = entrada.nextInt();
                t5 = (estagio[c] * 1000) / 5;
            }
        }
    }

    public static void menuSimulacao() {
        System.out.println("======================================");
        System.out.println("    SIMULACAO DA MAQUINA DE LAVAR     ");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Simulando o Modelo: " + modelo + " - " + nome + " - " + peso + "kg - Voltagem: " + voltagem + "V");
        System.out.println();
    }

    public static void menuSimulacaoInicio() {
        System.out.println("======================================");
        System.out.println(" EM QUAL ESTAGIO VOCE DESEJA COMECAR? ");
        System.out.println("======================================");
        System.out.println("1 - Lavacao Pesada");
        System.out.println("2 - Lavacao Normal");
        System.out.println("3 - Lavacao Leve");
        System.out.println("4 - Enxague");
        System.out.println("5 - Centrifugar");
        System.out.println("Selecione o estagio inicial: ");
        op = entrada.nextInt();
    }

    public static void estagio1() throws InterruptedException {
        for (c = 1; c < 6; c++) {
            System.out.print("Estagio 1 - Em Lavacao Pesada: ");
            System.out.printf("%.2f", progresso);
            System.out.println("%");
            progresso += 20;
            new Thread().sleep(t1);
        }
        System.out.println();
        progresso = 20;
    }

    public static void estagio2() throws InterruptedException {
        for (c = 1; c < 6; c++) {
            System.out.print("Estagio 2 - Em Lavacao Normal: ");
            System.out.printf("%.2f", progresso);
            System.out.println("%");
            progresso += 20;
            new Thread().sleep(t2);
        }
        System.out.println();
        progresso = 20;
    }

    public static void estagio3() throws InterruptedException {
        for (c = 1; c < 6; c++) {
            System.out.print("Estagio 3 - Em Lavacao Leve: ");
            System.out.printf("%.2f", progresso);
            System.out.println("%");
            progresso += 20;
            new Thread().sleep(t3);
        }
        System.out.println();
        progresso = 20;
    }

    public static void estagio4() throws InterruptedException {
        for (c = 1; c < 6; c++) {
            System.out.print("Estagio 4 - Em Enxague: ");
            System.out.printf("%.2f", progresso);
            System.out.println("%");
            progresso += 20;
            new Thread().sleep(t4);
        }
        System.out.println();
        progresso = 20;
    }

    public static void estagio5() throws InterruptedException {
        for (c = 1; c < 6; c++) {
            System.out.print("Estagio 5 - Em Centrifuga: ");
            System.out.printf("%.2f", progresso);
            System.out.println("%");
            progresso += 20;
            new Thread().sleep(t5);
        }
        System.out.println();
        progresso = 20;
    }

    public static void main(String[] args) throws InterruptedException {

        do {
            menu();
            switch (op) {
                case 1:
                    menuConfiguracao();
                    menuSimulacao();
                    menuSimulacaoInicio();
                    if (op == 1) {
                        estagio1();
                        estagio2();
                        estagio3();
                        estagio4();
                        estagio5();
                    } else if (op == 2) {
                        estagio2();
                        estagio3();
                        estagio4();
                        estagio5();
                    } else if (op == 3) {
                        estagio3();
                        estagio4();
                        estagio5();
                    } else if (op == 4) {
                        estagio4();
                        estagio5();
                    } else if (op == 5) {
                        estagio5();
                    }
                    System.out.println("Simulacao Finalizada");
                    op = 0;
                    break;
                case 2: {
                    System.out.println("Voce precisa configurar a maquina primeiro");
                    System .out.println();
                    break;
                }
            }
        } while (op !=0);
        System.out.println("Ate logo...");
    }
}
