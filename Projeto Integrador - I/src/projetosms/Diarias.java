package projetosms;
import java.text.NumberFormat;
public class Diarias {
    
    public static void conferirDiarias() {
        
        float verificaSeVazio = Vetores.diariaServico[0];

        if (verificaSeVazio == 0) {
            System.out.println("No momento nao ha registro de vagas disponiveis. Cadastre vagas.");
        } else {
            for (int i = 0; i < Util.i; i++) {
                
                System.out.println("Opcao [" + (i + 1) + "] - Diaria de " + NumberFormat.getCurrencyInstance().format(Vetores.diariaServico[i]));
                System.out.println("----------------------------------------");
            }
            Util.validarVagas();
        }
    }    
}
