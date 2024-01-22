package H_Polimorfismo_Ex03;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String imprimiDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosCli(fisicoDTO);
    }
}
