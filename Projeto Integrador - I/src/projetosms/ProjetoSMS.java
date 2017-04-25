package projetosms;

import java.util.Scanner;

public class ProjetoSMS {

    public static void main(String[] args) {

        VagasCadastradas.cadastrar();
        String ops = "", opPesquisas = "";
        Scanner sc = new Scanner(System.in);

        while (!ops.equals("5")) {

            do {
                System.out.println("\n>>>>> Menu Principal <<<<<");
                System.out.println("[1] Cadastrar Vagas\n[2] Relatorios\n[3] Ler Detalher de Vagas\n[4] Pesquisar Vagas\n[5] Sair");
                System.out.println(">>>>>>>>==========<<<<<<<<");
                System.out.print("Deseja escolher qual opcao: ");
                ops = sc.nextLine();
                System.out.println();
            } while (ValidandoOpcao.validarOpcao(ops, 5));

            // Informando um valor valido ele sai do loop e vai para a opcao desejada
            if (ops.equals("5")) { // Caso seja digitado 5. O programa vai estar sendo encerrado
                break;
            } else {
                // opcoes do menu
                switch (ops) {

                    case "1":
                        CadastrarVagas.cadastramentoDeVagas();
                        break;

                    case "2":
                        Relatorio.imprimirRelatorio();
                        break;

                    case "3":
                        CaracteristicasVagas.verCaracteristicas("Decricao do Servico", Vetores.descricaoServico);
                        break;

                    case "4":
                        if (Vetores.categoria[0] == null) {
                            System.out.println("No momento nao ha registro de vagas disponiveis. Cadastre vagas.");
                        } else {

                            do {

                                System.out.println("................................");
                                System.out.println("[1] Pesquisar Vagas por Categoria\n[2] Pesquisar por Descrisao\n[3] Voltar ao Menu");
                                System.out.print("................................\nOP: ");
                                opPesquisas = sc.nextLine();

                            } while (ValidandoOpcao.validarOpcao(opPesquisas, 3));

                            PesquisarVagas.pesquisar(opPesquisas);
                            break;
                        }
                }
            }
        }
        System.out.println();
        System.out.println("Programa Encerrado");
    }
}
