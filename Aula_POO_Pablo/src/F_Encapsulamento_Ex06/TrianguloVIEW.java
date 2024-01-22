package F_Encapsulamento_Ex06;

import javax.swing.JOptionPane;

public class TrianguloVIEW {
    public static void main(String args[]){
        try{
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            
            trianguloDTO.setLadoA(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A: ")));
            trianguloDTO.setLadoB(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B: ")));
            trianguloDTO.setLadoC(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C: ")));
            
            JOptionPane.showMessageDialog(null, trianguloCTR.verificaTri(trianguloDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
