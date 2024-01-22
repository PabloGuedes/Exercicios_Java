package G_Heranca_Ex02;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String imprimiDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.imprimiDadosFisico(fisicoDTO);
    }
}
