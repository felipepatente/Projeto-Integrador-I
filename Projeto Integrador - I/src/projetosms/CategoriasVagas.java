package projetosms;
import java.text.NumberFormat;
public class CategoriasVagas {

    public static void veCategoriaDeVagas(String categoria, String opcao) {

        boolean verificaVaga = false;

        // Esse loop e necessario para verificar se ha realmente vagas
        for (int i = 0; i < Util.i; i++) {
            if (Vetores.categoria[i].equals(opcao)) {
                verificaVaga = true;
            }
        }
        
        // Tendo vagas ele entra nesa condicao, caso ao contrario entra no else
        if (verificaVaga){

            System.out.println("\nCategoria: " + categoria);

            for (int i = 0; i < Util.i; i++) {

                if (Vetores.categoria[i].equals(opcao)) {
                    System.out.println("*****************************************************");
                    System.out.println("Opcao[" + (i + 1) + "]");
                    System.out.println("Descrisao do Servico: " + Vetores.descricaoServico[i]);
                    System.out.println("Endereco do Servico: " + Vetores.enderecoServico[i]);
                    System.out.println("Região: " + Vetores.zona[i]);
                    System.out.println("Diaria: " + NumberFormat.getCurrencyInstance().format(Vetores.diariaServico[i]));
                    System.out.println("******************************************************\n");
                }
            }
            
            Util.validarVagas();
            
        }else{
            System.out.println("\nNo momento nao ha registro de vagas disponiveis. Cadastre vagas.");
        }
    }
}
