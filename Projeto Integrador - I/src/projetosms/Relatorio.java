package projetosms;
import java.text.NumberFormat;
public class Relatorio {
    
    public static void imprimirRelatorio() {
        
        String verificaSeVazio = Vetores.zona[0];

        if (verificaSeVazio == null) {
            System.out.println("No momento nao ha registro de vagas disponiveis. Cadastre vagas.");
        } else{
            
            System.out.println("-------------------------");
            for (int i = 0; i < Util.i; i++) {
             
                System.out.println("Opcao - [" + (i + 1)+ "]");
                System.out.println("Regiao: " + Vetores.zona[i]);
                System.out.println("Diaria de " + NumberFormat.getCurrencyInstance().format(Vetores.diariaServico[i]));
                System.out.println("-------------------------");
            }
            Util.validarVagas();
        }
    }
}
