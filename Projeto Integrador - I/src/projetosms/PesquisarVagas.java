package projetosms;

import java.util.Scanner;

public class PesquisarVagas {

    public static void pesquisar(String opPesquisas) {

        Scanner sc = new Scanner(System.in);

        switch (opPesquisas) {

            case "1":

                do {
                    // Menu de opcoes por categira
                    System.out.println("............");
                    System.out.println("Pesquisar Por\n[1] Pedreiro\n[2] Pintura\n[3] Diarista\n[4] Voltar ao Menu");
                    System.out.print("............\nOP: ");
                    opPesquisas = sc.nextLine();
                } while (ValidandoOpcao.validarOpcao(opPesquisas,4));

                switch (opPesquisas) {

                    /*Os subCases do case "1" seguinte chama um metodo enviando como paramentro a categoria da vaga
                     junto com um digito que bate com que o usuario digitou no momento do cadastro */
                    case "1":
                        CategoriasVagas.veCategoriaDeVagas("Pedreiro", "1");
                        break;
                    case "2":
                        CategoriasVagas.veCategoriaDeVagas("Pintura", "2");
                        break;
                    case "3":
                        CategoriasVagas.veCategoriaDeVagas("Diarista", "3");
                        break;
                }
                break;

            case "2":
                do {
                    System.out.println("......................");
                    System.out.println("Pesquisar vagas por:\n[1] Endereço\n[2] Regiões de São Paulo\n[3] Diarias\n[4] Voltar ao Menu");
                    System.out.print("......................\nOP: ");
                    opPesquisas = sc.nextLine();
                    System.out.println();
                } while (ValidandoOpcao.validarOpcao(opPesquisas, 4));

                switch (opPesquisas) {
                    
                    case "1":
                        CaracteristicasVagas.verCaracteristicas("Endereco do Servico", Vetores.enderecoServico);
                        break;
                    case "2":
                        CaracteristicasVagas.verCaracteristicas("Regiao", Vetores.zona);
                        break;
                    case "3":
                        Diarias.conferirDiarias();
                        break;
                }
                break;
        }
    }
}
