package projetosms;

public class ValidandoOpcao {

    public static boolean validarOpcao(String op, int parametros) {

        switch (parametros) {
            case 3:
                if (!op.equals("1") && !op.equals("2") && !op.equals("3")) {
                    System.out.println("\nDigite apenas as opcoes do menu.");
                    return true;
                }
                break;
            case 4:
                if (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4")) {
                    System.out.println("\nDigite apenas as opcoes do menu.");
                    return true;
                }
                break;
            case 5:
                if (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4") && !op.equals("5")) {
                    System.out.println("Digite apenas as opcoes do menu.");
                    return true;
                }
                break;
        }
        return false;
    }

}
