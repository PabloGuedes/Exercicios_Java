package K_Matriz_Ex02;

public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        return matrizDAO.mostrarMatriz(matrizDTO);
    }
    
    public String diagonalPrincipal(MatrizDTO matrizDTO){
        return matrizDAO.diagonalPrincipal(matrizDTO);
    }
}
