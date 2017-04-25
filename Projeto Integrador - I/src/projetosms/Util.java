package projetosms;

import java.util.Scanner;

public class Util {

    public static int i = 0;

    public static boolean verificarDigito(String s) {

        boolean digito = false;

        try {
            int i = Integer.parseInt(s);
            digito = true;
        } catch (Exception e) {
        }

        return digito;
    }

    // limpa a vaga que o usuario escolheu
    public static void validarVagas() {

        Scanner sc = new Scanner(System.in);

        int opcao;
        String aceita;

        do {
            System.out.print("\nDigite o numero que esta dentro de colchetes[] para aceitar a vaga."
                    + "Caso nao queira digite \"Nao\": ");
            aceita = sc.nextLine();

            if (aceita.isEmpty() || aceita.length() > 3) {
                System.out.println("\n!Informe um opcao valida");
            }

        } while (aceita.isEmpty() || aceita.length() > 3);

        boolean temDigito = verificarDigito(aceita);

        if (temDigito) {
            opcao = Integer.parseInt(aceita);
            opcao--;
            if (opcao >= 0 && opcao < i) {
                System.out.println("\nVaga escolhida com sucesso!");
                Vetores.descricaoServico = ordenarVetor(Vetores.descricaoServico, opcao);
                Vetores.enderecoServico = ordenarVetor(Vetores.enderecoServico, opcao);
                Vetores.zona = ordenarVetor(Vetores.zona, opcao);
                Vetores.categoria = ordenarVetor(Vetores.categoria, opcao);
                Vetores.diariaServico = ordenarVetor(Vetores.diariaServico, opcao);
                i--;
            }
        }
    }

    public static String[] ordenarVetor(String vetor[], int opcao) {

        for (int j = opcao; j < i; j++) {
            vetor[j] = vetor[j + 1];
        }
        return vetor;
    }

    public static float[] ordenarVetor(float vetor[], int opcao) {
        
        for (int j = opcao; j < i; j++) {
            vetor[j] = vetor[j + 1];
        }
        return vetor;
    }
}
