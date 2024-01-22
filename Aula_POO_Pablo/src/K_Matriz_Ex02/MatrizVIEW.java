package K_Matriz_Ex02;

import javax.swing.JOptionPane;

public class MatrizVIEW {
    public static void main(String[] args) {
        MatrizDTO matrizDTO = new MatrizDTO();
        MatrizCTR matrizCTR = new MatrizCTR();
        
        int num[][] = new int[3][3];
        
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha: " + linha + " Coluna: " + coluna));
            }
        }
        matrizDTO.setN(num);
        JOptionPane.showMessageDialog(null, matrizCTR.mostrarMatriz(matrizDTO));
        JOptionPane.showMessageDialog(null, matrizCTR.diagonalPrincipal(matrizDTO));
    }
}
