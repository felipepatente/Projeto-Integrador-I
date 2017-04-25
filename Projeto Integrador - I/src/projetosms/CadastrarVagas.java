package projetosms;

import java.util.Scanner;

public class CadastrarVagas {

    public static void cadastramentoDeVagas() {

        String continua = "sim", diaria = "", categoria, zona;
        Scanner sc = new Scanner(System.in);

        if (Util.i < 10) {

            while (continua.equalsIgnoreCase("sim")) {

                if (Util.i < 10) {
                    System.out.println(">>>>>>>>>>><<<<<<<<<<<\nCadastramento de Vagas\n>>>>>>>>>>><<<<<<<<<<<");

                    do {

                        System.out.println("\n...........................");
                        System.out.println("Informe a Categoria da Vaga\n[1] Pedreiro\n[2] Pintura\n[3] Diariasta\n[4] Voltar ao Menu");
                        System.out.print("...........................\nOP: ");
                        categoria = sc.nextLine();

                        // Caso o usuario digite um opcao valida, ela sera jogada no vetor
                        if (categoria.equals("1") || categoria.equals("2") || categoria.equals("3")) {
                            Vetores.categoria[Util.i] = categoria;
                        }
                        // Informa o usuario que ele precisa digitar uma opcao valida
                        if (!categoria.equals("1") && !categoria.equals("2") && !categoria.equals("3") && !categoria.equals("4")) {
                            System.out.println("\n!Digite as opcoes do menu");
                        }
                        // Quando o usuario informar um valor valido ele sai do loop
                    } while (!categoria.equals("1") && !categoria.equals("2") && !categoria.equals("3") && !categoria.equals("4"));

                    if (categoria.equals("4")) {
                        break;
                    }

                    do {

                        System.out.println("\nInforme a descricao do servico a ser contratado: ");
                        Vetores.descricaoServico[Util.i] = sc.nextLine();
                        System.out.println();

                        System.out.println("Informe o endereco para o servico: ");
                        Vetores.enderecoServico[Util.i] = sc.nextLine();
                        System.out.println();

                        if (Vetores.descricaoServico[Util.i].isEmpty() && Vetores.enderecoServico[Util.i].isEmpty()) {

                            System.out.println("!Informe os dados que se pede");
                        }

                    } while (Vetores.descricaoServico[Util.i].isEmpty() && Vetores.enderecoServico[Util.i].isEmpty());

                    do {

                        System.out.println("\nInforme em qual regiao de sao paulo se encontra. Por exemplo: \"Zona Norte\": ");
                        Vetores.zona[Util.i] = sc.nextLine();
                        zona = Vetores.zona[Util.i];
                        System.out.println();

                        if (!zona.equalsIgnoreCase("Zona Norte") && !zona.equalsIgnoreCase("Zona Sul") && !zona.equalsIgnoreCase("Zona Leste") && !zona.equalsIgnoreCase("Zona Oeste")) {
                            System.out.println("!Informe o dado conforme o exemplo dado.");
                        }

                    } while (!zona.equalsIgnoreCase("Zona Norte") && !zona.equalsIgnoreCase("Zona Sul") && !zona.equalsIgnoreCase("Zona Leste") && !zona.equalsIgnoreCase("Zona Oeste"));

                    boolean verificacaoDeDigito;

                    do {

                        do {

                            System.out.println("Informe a diaria a ser paga pelo servico (nao a necessidades de colocar pontos e virgulas): ");
                            diaria = sc.nextLine();
                            System.out.println();

                            // Enquanto a variavel estiver vazia continua dentro do loop
                        } while (diaria.isEmpty());

                        // Chamo o metodo ""verificarDigito" e jogo o resultado na variavel vericacaoDeDigito
                        verificacaoDeDigito = Util.verificarDigito(diaria);

                        // Se houver digito, o metodo retorna FALSE
                        if (!verificacaoDeDigito) {
                            System.out.println("!So e permitida a entrada de numeros.\n");
                        }

                    } while (!verificacaoDeDigito);

                    Vetores.diariaServico[Util.i] = Float.parseFloat(diaria);

                    Util.i++;

                } else {
                    System.out.println("Nao ha espaco diponivel. Apague vagas para poder estar continuando.\n");
                    break;
                }

                do {

                    System.out.println("Deseja continuar cadastrando [Digite \"Sim\" para continuar ou \"Nao\" para voltar ao menu principal]: ");
                    continua = sc.nextLine();
                    System.out.println();

                } while (!continua.equalsIgnoreCase("sim") && !continua.equalsIgnoreCase("nao"));

            }

        } else {
            System.out.println("Nao ha espaco diponivel. Apague vagas para poder estar continuando.\n");
        }
    }
}
