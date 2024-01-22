package A_Introducao_Ex02;

import javax.swing.JOptionPane;

public class principalMedia {
    public static void main(String[] args) {
        
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null, "A média será: " + media.calcularMedia(
            Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 3: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso 1: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso 2: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso 3: "))
        ));
    }
}

