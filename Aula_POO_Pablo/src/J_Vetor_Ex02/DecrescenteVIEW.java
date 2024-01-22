package J_Vetor_Ex02;

import javax.swing.JOptionPane;

public class DecrescenteVIEW {
    public static void main(String[] args) {
        DecrescenteDTO decrescenteDTO = new DecrescenteDTO();
        DecrescenteCTR decrescenteCTR = new DecrescenteCTR();
        
        int num[] = new int[20];
        
        for (int cont = 0; cont < 20; cont++) {
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição: " + cont));
        }
        
        decrescenteDTO.setNum(num);
        JOptionPane.showMessageDialog(null, decrescenteCTR.ordemInversa(decrescenteDTO));
    }
}
