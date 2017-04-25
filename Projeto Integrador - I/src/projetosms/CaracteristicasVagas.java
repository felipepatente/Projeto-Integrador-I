package projetosms;
public class CaracteristicasVagas {

    public static void verCaracteristicas(String definicaoVaga, String atributo[]) {

        String verificaSeVazio = atributo[0];
        
        if (verificaSeVazio == null) {
            System.out.println("No momento nao ha registro de vagas disponiveis. Cadastre vagas.");
        } else {
            for (int i = 0; i < Util.i; i++) {

                System.out.println("Opcao [" + ( i + 1) + "] - " + definicaoVaga + ": " + atributo[i]);
                System.out.println("--------------------------------");
            }
            
            Util.validarVagas();
        }
    }
}
