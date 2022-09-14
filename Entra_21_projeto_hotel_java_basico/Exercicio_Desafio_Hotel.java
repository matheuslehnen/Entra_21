import java.util.Scanner;

public class Exercicio_Desafio_Hotel {

    static Scanner entrada = new Scanner(System.in);
    static int opcaoMenuPrincipal, opcaoCadastroCliente, opcaoCadastroQuarto;
    static int op, opcao, idCheckin, idCheckout;
    static int cCliente = 0;
    static int cQuarto = 0;
    static int posCliente = 1;
    static int lCliente = 1;
    static int posQuarto = 1;
    static int lQuarto = 1;
    static int totQuartos = 0;
    public static String[][] cliente = new String[30][9];
    static String[] idCliente = new String[30];
    static String[] nome = new String[30];
    static String[] nascimento = new String[30];
    static String[] email = new String[30];
    static String[] telefone = new String[30];
    static String[] cidade = new String[30];
    static String[] UF = new String[30];
    static String[] fumante = new String[30];
    static String[][] quartos = new String[30][9];
    static String[] IDQuarto = new String[30];
    static String[] localizacao = new String[30];
    static String[] pfumante = new String[30];
    static String[] diaria = new String[30];
    static String[] pax = new String[30];
    static String[] situacao = new String[30];


    public static void menuPrincipal() {
        System.out.println("*******************************************************");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE HOTEL - MENU PRINCIPAL");
        System.out.println("*******************************************************");
        System.out.println(" 1 - Cadastrar, editar ou excluir clientes");
        System.out.println(" 2 - Cadastrar, editar ou excluir quartos");
        System.out.println(" 3 - Verificar quartos disponiveis");
        System.out.println(" 4 - Realizar check-in");
        System.out.println(" 5 - Realizar check-out");
        System.out.println(" 0 - Sair do sistema");
        System.out.println("Selecione uma opcao acima: ");
        opcaoMenuPrincipal = entrada.nextInt();
    }


    public static void MenuCadastroCliente() {
        System.out.println("*******************************************************");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE HOTEL - CADASTRO CLIENTE ");
        System.out.println("*******************************************************");
        System.out.println("1 - Cadastrar Cliente ");
        System.out.println("2 - Editar Cliente");
        System.out.println("3 - Listar Clientes");
        System.out.println("4 - Excluir Cliente");
        System.out.println("Selecione uma opcao acima: ");
        opcaoCadastroCliente = entrada.nextInt();
    }


    public static void adicionaCliente() {
        System.out.println("*******************************************************");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE HOTEL - CADASTRO CLIENTE ");
        System.out.println("*******************************************************");
        //Incrementa um ID para o cliente.
        cCliente = 0;
        idCliente[lCliente] = String.valueOf(lCliente);
        cliente[lCliente][cCliente] = idCliente[lCliente];
        cCliente++;

        //Define um nome para o cliente.
        System.out.println("Insira um nome e sobrenome para o cliente (Exemplo: 'Joao Silva')");
        nome[lCliente] = "Hospede: " + entrada.nextLine();
        nome[lCliente] = "Hospede: " + entrada.nextLine();
        cliente[lCliente][cCliente] = nome[lCliente];
        cCliente++;

        //Define a data de nascimento do cliente.
        System.out.println("Insira a data de nascimento do cliente: ");
        nascimento[lCliente] = "Nascimento: " + entrada.nextLine();
        cliente[lCliente][cCliente] = nascimento[lCliente];

        cCliente++;
        //Define o email do cliente.
        System.out.println("Insira o email do cliente: ");
        email[lCliente] = "Email: " + entrada.nextLine();
        cliente[lCliente][cCliente] = email[lCliente];
        cCliente++;
        //Define o telefone do cliente.
        System.out.println("Insira o telefone do cliente: ");
        telefone[lCliente] = "Telefone: " + entrada.nextLine();
        cliente[lCliente][cCliente] = telefone[lCliente];
        cCliente++;
        //Define a cidade do cliente.
        System.out.println("Insira a cidade do cliente: ");
        cidade[lCliente] = "Cidade: " + entrada.nextLine();
        cliente[lCliente][cCliente] = cidade[lCliente];
        cCliente++;
        //Define o estado do cliente.
        System.out.println("Insira a UF do cliente: ");
        UF[lCliente] = "UF: " + entrada.nextLine();
        cliente[lCliente][cCliente] = UF[lCliente];
        cCliente++;
        //Define se o cliente é fumante ou não e verifica se a opção inserida está correta.
        do {
            System.out.println("O Cliente e fumante? [0-Nao / 1-Sim]");
            op = entrada.nextInt();
            if (op == 1) {
                fumante[lCliente] = "Fumante";
                cliente[lCliente][cCliente] = fumante[lCliente];
                cCliente++;
            } else if (op == 0) {
                fumante[lCliente] = "Nao-Fumante";
                cliente[lCliente][cCliente] = fumante[lCliente];
                cCliente++;
            } else {
                System.out.println("Erro: Insira valores validos.");
            }
        } while (op != 0 && op != 1);
        lCliente += 1;
        //Guarda a posição da linha dentro da variável "posCliente" para a leitura dos dados posteriormente.
        posCliente = lCliente;
    }


    public static void editaCliente() {

        espaço();
        //Lista a linha e o nome do cliente.
        for (lCliente = 1; lCliente < posCliente; lCliente++) {
            System.out.println("Cliente " + lCliente);
            System.out.println(cliente[lCliente][1]);
            espaço();
        }
        //Guarda a linha que será editada.
        System.out.println("Qual posicao deseja editar? ");
        lCliente = entrada.nextInt();

        // Impede edicao de cliente inexistente
        if (cliente[lCliente][1] == null) {
            System.out.println("Cliente inexistente. Insira um ID de cliente valido.");
            espaço();
        } else {
            espaço();
            do {
                //Mostra os campos que podem ser editados.
                for (cCliente = 1; cCliente < 8; cCliente++) {
                    System.out.println(cliente[lCliente][cCliente]);
                }
                //Pergunta qual campo deseja editar e guarda a opção na variável "c".
                System.out.println("Qual campo deseja editar? 1-Nome  2-Nascimento  3-Email  4-Telefone  5-Cidade  6-UF  7-Fumante");
                cCliente = entrada.nextInt();
                switch (cCliente) {
                    case 1: //Edita o nome.
                        System.out.println("Insira um novo valor para Nome: ");
                        cliente[lCliente][cCliente] = "Hospede: " + entrada.nextLine();
                        cliente[lCliente][cCliente] = "Hospede: " + entrada.nextLine();
                        break;
                    case 2: //Edita a data de nascimento.
                        System.out.println("Insira um novo valor para Nascimento: ");
                        cliente[lCliente][cCliente] = "Nascimento: " + entrada.nextLine();
                        cliente[lCliente][cCliente] = "Nascimento: " + entrada.nextLine();
                        break;
                    case 3: //Edita o email.
                        System.out.println("Insira um novo valor para Email: ");
                        cliente[lCliente][cCliente] = "Email: " + entrada.nextLine();
                        cliente[lCliente][cCliente] = "Email: " + entrada.nextLine();
                        break;
                    case 4: //Edita o telefone.
                        System.out.println("Insira um novo valor para Telefone: ");
                        cliente[lCliente][cCliente] = "Telefone: " + entrada.nextLine();
                        cliente[lCliente][cCliente] = "Telefone: " + entrada.nextLine();
                        break;
                    case 5: //Edita a cidade.
                        System.out.println("Insira um novo valor para Cidade: ");
                        cliente[lCliente][cCliente] = "Cidade" + entrada.nextLine();
                        cliente[lCliente][cCliente] = "Cidade" + entrada.nextLine();
                        break;
                    case 6: //Edita o Estado.
                        System.out.println("Insira um novo valor para UF: ");
                        cliente[lCliente][cCliente] = "UF: " + entrada.nextLine();
                        cliente[lCliente][cCliente] = "UF: " + entrada.nextLine();
                        break;
                    case 7: //Edita se é fumante ou não.
                        do {
                            System.out.println("Insira um novo valor para Fumante: [0-Nao / 1-Sim]");
                            op = entrada.nextInt();
                            if (op == 1) {
                                fumante[lCliente] = "Fumante";
                                cliente[lCliente][cCliente] = fumante[lCliente];
                            } else if (op == 0) {
                                fumante[lCliente] = "Nao-Fumante";
                                cliente[lCliente][cCliente] = fumante[lCliente];
                            } else {
                                System.out.println("Erro: Insira valores validos.");
                            }
                        } while (op != 0 && op != 1);
                        break;
                }

                System.out.println("Deseja repetir a operacao? [0-Nao / 1-Sim]");
                opcao = entrada.nextInt();
            } while (opcao == 1);
        }
    }


    public static void listaCliente() {
        espaço();
        for (lCliente = 1; lCliente < posCliente; lCliente++) {
            System.out.println("Cliente " + lCliente);
            for (cCliente = 1; cCliente < 9; cCliente++) {
                if(cliente[lCliente][cCliente] != null){
                System.out.println(cliente[lCliente][cCliente]);
                }
            }
            espaço();
        }
        espaço();
    }


    public static void excluiCliente() {
        do {
            espaço();
            //Mostra apenas a posicao e o nome de todos os clientes cadastrados.
            for (lCliente = 1; lCliente < posCliente; lCliente++) {
                System.out.println("Cliente " + lCliente);
                System.out.println(cliente[lCliente][1]);
                espaço();
            }
            //Pergunta qual a linha referente ao cliente que deseja excluir.
            System.out.println("Qual posicao deseja excluir? ");
            lCliente = entrada.nextInt();
            if (cliente[lCliente][1] == null) {
                System.out.println("Cliente inexistente. Insira um ID de cliente valido.");
            } else {
                espaço();
                //Atribui null à todos os campos da linha selecionada.
                for (cCliente = 0; cCliente < 8; cCliente++) {
                    cliente[lCliente][cCliente] = null;
                    System.out.println(cliente[lCliente][cCliente]);
                }
                System.out.println("Deseja repetir a operacao? [0-Nao / 1-Sim]");
                opcao = entrada.nextInt();
            }
        } while (opcao == 1);
    }


    public static void MenuCadastroQuartos() {
        espaço();
        System.out.println("*******************************************************");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE HOTEL - CADASTRO QUARTOS ");
        System.out.println("*******************************************************");
        System.out.println("1 - Cadastrar Quarto ");
        System.out.println("2 - Editar Quarto");
        System.out.println("3 - Listar Quartos");
        System.out.println("4 - Excluir Quarto");
        System.out.println("Selecione uma opcao acima: ");
        opcaoCadastroQuarto = entrada.nextInt();
    }


    public static void adicionaQuarto() {
        cQuarto = 0;
        //Incrementa um ID para o quarto
        IDQuarto[lQuarto] = "Quarto " + lQuarto;
        quartos[lQuarto][cQuarto] = IDQuarto[lQuarto];
        cQuarto++;
        //Insere a localizacao
        System.out.println("Defina a localizacao do quarto: [Norte, Sul, Leste, Oeste] ");
        localizacao[lQuarto] = "Localizacao: " + entrada.nextLine();
        localizacao[lQuarto] = "Localizacao: " + entrada.nextLine();
        quartos[lQuarto][cQuarto] = localizacao[lQuarto];
        cQuarto++;
        //Pergunta se é fumante
        do {
            System.out.println("O quarto aceita fumantes? [0-Nao / 1-Sim]");
            op = entrada.nextInt();
            if (op == 1) {
                pfumante[lQuarto] = "Fumante";
                quartos[lQuarto][cQuarto] = pfumante[lQuarto];
                cQuarto++;
            } else if (op == 0) {
                pfumante[lQuarto] = "Nao-Fumante";
                quartos[lQuarto][cQuarto] = pfumante[lQuarto];
                cQuarto++;
            } else {
                System.out.println("Erro: Insira valores validos.");
            }
        } while (op != 0 && op != 1);
        //Define o valor da diaria
        System.out.println("Defina um valor em reais para uma diaria no quarto:");
        diaria[lQuarto] = "Diaria: R$ " + entrada.nextLine();
        diaria[lQuarto] = "Diaria: R$ " + entrada.nextLine();
        quartos[lQuarto][cQuarto] = diaria[lQuarto];
        cQuarto++;
        //Define quantas pessoas comporta a acomodação
        System.out.println("Quantas pessoas comporta esta acomodacao?");
        pax[lQuarto] = "Capacidade: " + entrada.nextLine();
        quartos[lQuarto][cQuarto] = pax[lQuarto];
        cQuarto++;
        //Incrementa +1 para cada quarto cadastrado
        totQuartos += 1;
        quartos[lQuarto][cQuarto] = String.valueOf("Quantidade de quartos: " + totQuartos);
        cQuarto++;
        //Um quarto é adicionado sempre em estado "vago".
        situacao[lQuarto] = "Situacao: Vago";
        quartos[lQuarto][cQuarto] = situacao[lQuarto];
        cQuarto++;
        quartos[lQuarto][cQuarto] = "Ocupado por ";
        lQuarto += 1;
        posQuarto = lQuarto;
    }

    public static void editaQuarto() {
        espaço();
        //Lista os quartos com filtro de linha e nome.
        for (lQuarto = 1; lQuarto < posQuarto; lQuarto++) {
            for (cQuarto = 0; cQuarto < 8; cQuarto++) {
                System.out.println(quartos[lQuarto][cQuarto]);
            }
            espaço();
        }
        //Define a linha para edição.
        System.out.println("Qual posicao deseja editar? ");
        lQuarto = entrada.nextInt();

        if (quartos[lQuarto][6] == null) {
            System.out.println("Quarto inexistente. Insira um ID de quarto valido.");
            espaço();
        } else {
            do {
                //Mostra os campos da linha referente ao quarto indicado anteriormente.
                for (cQuarto = 0; cQuarto < 8; cQuarto++) {
                    System.out.println(quartos[lQuarto][cQuarto]);
                }
                //Pergunta qual coluna o usuário deseja alterar.
                System.out.println("Qual campo deseja editar? 1-Localizacao  2-Fumante  3-Valor da diaria  4-Capacidade");
                cQuarto = entrada.nextInt();
                switch (cQuarto) {
                    case 1: //Altera localização.
                        System.out.println("Defina a localizacao do quarto: [Norte, Sul, Leste, Oeste] ");
                        localizacao[lQuarto] = "Localizacao: " + entrada.nextLine();
                        localizacao[lQuarto] = "Localizacao: " + entrada.nextLine();
                        quartos[lQuarto][cQuarto] = localizacao[lQuarto];
                        break;
                    case 2: //Altera permissao do quarto.
                        do {
                            System.out.println("Este quarto permite fumantes? [0-Nao / 1-Sim]");
                            op = entrada.nextInt();
                            if (op == 1) {
                                fumante[lQuarto] = "Fumante";
                                quartos[lQuarto][cQuarto] = fumante[lQuarto];
                            } else if (op == 0) {
                                fumante[lQuarto] = "Nao-Fumante";
                                quartos[lQuarto][cQuarto] = fumante[lQuarto];
                            } else {
                                System.out.println("Erro: Insira valores validos.");
                            }
                        } while (op != 0 && op != 1);
                        break;
                    case 3: //Altera o valor da diaria.
                        System.out.println("Defina um novo valor em R$ para uma diaria:");
                        diaria[lQuarto] = "Diaria: R$" + entrada.nextLine();
                        diaria[lQuarto] = "Diaria: R$" + entrada.nextLine();
                        quartos[lQuarto][cQuarto] = diaria[lQuarto];
                        break;
                    case 4: //Altera a quantidade de pessoas na acomodação.
                        System.out.println("Quantas pessoas comporta esta acomodacao?");
                        pax[lQuarto] = "Capacidade: " + entrada.nextLine();
                        pax[lQuarto] = "Capacidade: " + entrada.nextLine();
                        quartos[lQuarto][cQuarto] = pax[lQuarto];
                        break;
                }
                System.out.println("Deseja repetir a operacao? [0-Nao / 1-Sim]");
                opcao = entrada.nextInt();
            } while (opcao == 1);
        }
    }


    public static void listaQuarto() {
        espaço();
        //Lista os quartos e todos os seus atributos.
        for (lQuarto = 1; lQuarto < posQuarto; lQuarto++) {
            for (cQuarto = 0; cQuarto < 8; cQuarto++) {
                System.out.println(quartos[lQuarto][cQuarto]);
            }
            espaço();
        }
        espaço();
    }

    public static void excluiQuarto() {
        do {
            espaço();
            //Mostra a posição de todos os quartos cadastrados.
            for (lQuarto = 1; lQuarto < posQuarto; lQuarto++) {
                for (cQuarto = 0; cQuarto < 1; cQuarto++) {
                    System.out.println(quartos[lQuarto][cQuarto]);
                }
                espaço();
            }
            //Pergunta a posição que deseja excluir.
            System.out.println("Qual posicao deseja excluir? ");
            lQuarto = entrada.nextInt();
            //Esse 'for' atribui null à todos os campos da posição selecionada.
            for (cQuarto = 0; cQuarto < 8; cQuarto++) {
                quartos[lQuarto][cQuarto] = null;
                System.out.println(quartos[lQuarto][cQuarto]);
            }
            System.out.println("Deseja repetir a operacao? [0-Nao / 1-Sim]");
            opcao = entrada.nextInt();
        } while (opcao == 1);
    }

    public static void ocupacaoQuartos() {
        espaço();
        cQuarto = 6;
        for (lQuarto = 1; lQuarto < posQuarto; lQuarto++) {
            if (quartos[lQuarto][cQuarto] == null) {
                System.out.println("Nao existe quarto cadastrado");
            } else if (quartos[lQuarto][cQuarto] == "Situacao: Vago") {
                System.out.print("[Quarto " + lQuarto + "] ");
            } else if (quartos[lQuarto][cQuarto] == "Situacao: Ocupado") {
                System.out.print("[ --- ]");
            }
        }
        espaço();
    }


    public static void checkin() {
        cQuarto = 6;
        System.out.println("Informe o ID do cliente que fara o check-in :");
        lCliente = entrada.nextInt();
        if (cliente[lCliente][1] == null) {
            System.out.println("Cliente inexistente. Insira um ID de cliente valido.");
        } else if (cliente[lCliente][8] != null) {
            System.out.println("O cliente " + cliente[lCliente][0] + " ja encontra-se hospedado neste hotel.");
        } else {
            System.out.println("Em qual acomodacao voce deseja realizar o check-in?");
            //Mostra na tela os quartos disponiveis e reservados.
            for (lQuarto = 1; lQuarto < posQuarto; lQuarto++) {
                if (quartos[lQuarto][6] == "Situacao: Vago") {
                    System.out.print("[Quarto " + lQuarto + "] ");
                } else if (quartos[lQuarto][6] == "Situacao: Ocupado") {
                    System.out.print("[ --- ]");
                }
            }
            espaço();
            //Pergunta qual quarto deseja reservar.
            System.out.print("Reservar: Quarto ");
            lQuarto = entrada.nextInt();
            //cquarto = 6
            if (quartos[lQuarto][6] == "Situacao: Ocupado") {
                System.out.println("Este quarto ja esta ocupado");
            } else if (quartos[lQuarto][6] == null) {
                System.out.println("Quarto inexistente. Insira um ID de quarto valido.");
            } else if (quartos[lQuarto][6] == "Situacao: Vago") {
                if (cliente[lCliente][7] == "Fumante" && quartos[lQuarto][2] == "Fumante") {
                    quartos[lQuarto][6] = "Situacao: Ocupado";
                    quartos[lQuarto][7] = cliente[lCliente][0];//ERRO ESTÁ AQUI
                    cliente[lCliente][8] = String.valueOf(lQuarto);
                    System.out.println("Check-in realizado com sucesso");
                } else if (cliente[lCliente][6] == "Fumante" && quartos[lQuarto][2] == "Nao-Fumante") {
                    System.out.println("O cliente e fumante e nao pode ser hospedado neste quarto. Escolha outra acomodacao.");
                } else {
                    quartos[lQuarto][cQuarto] = "Situacao: Ocupado";
                    quartos[lQuarto][7] = cliente[lCliente][0];
                    cliente[lCliente][8] = String.valueOf(lQuarto);
                    System.out.println("Check-in realizado com sucesso");
                }
            }
        }
    }

    public static void checkout() {
        cQuarto = 6;
        System.out.println("Em qual acomodacao deseja realizar o check-out?");
        //Mostra na tela os quartos disponiveis e reservados.
        for (lQuarto = 0; lQuarto < posQuarto; lQuarto++) {
            if (quartos[lQuarto][cQuarto] == "Situacao: Vago") {
                System.out.print("[Quarto " + lQuarto + "] ");
            } else if (quartos[lQuarto][cQuarto] == "Situacao: Ocupado") {
                System.out.print("[ --- ]");
            }
        }
        espaço();
        System.out.print("Quarto ");
        lQuarto = entrada.nextInt();
        if (quartos[lQuarto][1] == null) {
            System.out.println("Quarto inexistente. Insira um ID de quarto valido.");
        } else if (quartos[lQuarto][cQuarto] == "Situacao: Ocupado") { //Testa a vacância do quarto. Se está "ocupado" vira "vago".
            quartos[lQuarto][cQuarto] = "Situacao: Vago";
            lCliente = Integer.parseInt(quartos[lQuarto][7]);
            cliente[lCliente][8] = null;
            quartos[lQuarto][7] = "Ocupado por";
        } else {
            System.out.print("Este quarto ja esta desocupado");
        }
        System.out.println();
    }

    public static void espaço() {
        System.out.println();
    }


    public static void main(String[] args) {

        do {
            menuPrincipal();
            switch (opcaoMenuPrincipal) {
                case 1: //Cadastro de Clientes.
                    espaço();
                    MenuCadastroCliente();
                    switch (opcaoCadastroCliente) {
                        case 1:
                            adicionaCliente();
                            break;
                        case 2:
                            editaCliente();
                            break;
                        case 3:
                            listaCliente();
                            break;
                        case 4:
                            excluiCliente();
                            break;
                    }
                    break;
                case 2: // Cadastro de Quartos.
                    MenuCadastroQuartos();
                    switch (opcaoCadastroQuarto) {
                        case 1:
                            adicionaQuarto();
                            break;
                        case 2:
                            editaQuarto();
                            break;
                        case 3:
                            listaQuarto();
                            break;
                        case 4:
                            excluiQuarto();
                            break;
                    }
                    break;
                case 3: //Verifica os quartos disponíveis para alocação.
                    ocupacaoQuartos();
                    break;
                case 4: //Realiza o check-in.
                    checkin();
                    break;
                case 5: //Realiza o check-out.
                    checkout();
                    break;
            }
        } while (opcaoMenuPrincipal != 0);
    }
}
