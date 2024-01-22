package H_Polimorfismo_Ex03;

public class FisicoDAO extends ClienteDAO {
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return super.mostraDadosCli(fisicoDTO) +
                "\nO CPF é: " + fisicoDTO.getCpf() +
                "\nO RG é: " + fisicoDTO.getRg();
    }
}
