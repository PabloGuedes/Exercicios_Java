package H_Polimorfismo_Ex02;

import javax.swing.JOptionPane;

public class MediaVIEW {
    public static void main(String[] args){
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")));
        mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")));
        mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: ")));
        mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4: ")));
        
        mediaDTO.setTipo(Integer.parseInt(JOptionPane.showInputDialog("1 - Para usar somente as notas N1 e N2"
                + "\n2 - Para usar somente as notas N1, N2 e N3"
                + "\n3 - Para usar as quatro notas."
                + "\n\nInforme o tipo de cálculo: ")));
        
        JOptionPane.showMessageDialog(null, mediaCTR.imprimir(mediaDTO));
    }
}
