package J_Vetor_Ex02;

public class DecrescenteCTR {
    DecrescenteDAO decrescenteDAO = new DecrescenteDAO();
    
    public String ordemInversa(DecrescenteDTO decrescenteDTO){
        return decrescenteDAO.ordemInversa(decrescenteDTO);
    }
}
