package G_Heranca_Ex02;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String imprimiDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.imprimiDadosJuridico(juridicoDTO);
    }
}
