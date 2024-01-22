package H_Polimorfismo_Ex03;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String imprimiDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosCli(juridicoDTO);
    }
}
