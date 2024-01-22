package F_Encapsulamento_Ex06;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String verificaTri(TrianguloDTO trianguloDTO){
        return trianguloDAO.verificaTri(trianguloDTO);
    }
    
    public String informaTri(TrianguloDTO trianguloDTO){
        return trianguloDAO.informaTri(trianguloDTO);
    }
}
