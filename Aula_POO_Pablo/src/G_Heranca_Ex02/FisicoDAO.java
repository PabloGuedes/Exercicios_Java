package G_Heranca_Ex02;

public class FisicoDAO extends ClienteDAO {
    public String imprimiDadosFisico(FisicoDTO fisicoDTO){
        return imprimiDadosCliente(fisicoDTO) +
                "\nO CPF é: " + fisicoDTO.getCpf() +
                "\nO RG é: " + fisicoDTO.getRg();
    }
}
