package G_Heranca_Ex01;

public class MotoCTR {
    MotoDAO motoDAO = new MotoDAO();
    
    public String imprimiDadosMoto(MotoDTO motoDTO){
        return motoDAO.imprimiDadosMoto(motoDTO);
    } 
}
