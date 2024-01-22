package K_Matriz_Ex02;

public class MatrizDAO {
    String resposta="";
    String resp="";
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        int n[][] = matrizDTO.getN();
        
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                this.resposta += n[linha][coluna] + " ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    
    public String diagonalPrincipal(MatrizDTO matrizDTO){
        int n[][] = matrizDTO.getN();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if(linha == coluna){
                    this.resp += n[linha][coluna] + " ";
                }
            }
            this.resp += "\n";
        }
        return this.resp;
    }
}
