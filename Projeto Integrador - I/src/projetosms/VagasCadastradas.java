package projetosms;
public class VagasCadastradas {
    
    public static void cadastrar(){
        
        // Vagas cadastradas na categria "Pedreiro".
        Vetores.categoria[0]= "1";
        Vetores.descricaoServico[0] = "Trabalhar em fachada de predio";
        Vetores.diariaServico[0] = 255255;
        Vetores.enderecoServico[0] = "Rua Vila Olimpia, 25";
        Vetores.zona[0] = "Zona Sul";
        
        // Vagas cadastradas na categoria "Pintor"
        Vetores.categoria[1]= "2";
        Vetores.descricaoServico[1] = "Pintor com experiencia em pinturas residencias";
        Vetores.diariaServico[1] = 18885;
        Vetores.enderecoServico[1] = "Rua Pujol, 58";
        Vetores.zona[1] = "Zona Norte";
        
        // Vagas cadastradas na categoria "Diarista"
        Vetores.categoria[2]= "3";
        Vetores.descricaoServico[2] = "Faxina em condomino residencial";
        Vetores.diariaServico[2] = 58585525;
        Vetores.enderecoServico[2] = "Rua Beija Flor, 58";
        Vetores.zona[2] = "Zona Oeste";
        
        Util.i += 3;
    }
}
