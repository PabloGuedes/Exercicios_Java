package G_Heranca_Ex02;

public class JuridicoDAO extends ClienteDAO {
    public String imprimiDadosJuridico(JuridicoDTO juridicoDTO){
        return imprimiDadosCliente(juridicoDTO) +
                "\nO CNPJ é: " + juridicoDTO.getCnpj() +
                "\nO IE é: " + juridicoDTO.getIe();
    }
}
