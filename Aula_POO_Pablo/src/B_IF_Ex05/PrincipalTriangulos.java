package B_IF_Ex05;

import javax.swing.JOptionPane;

public class PrincipalTriangulos {
    public static void main(String[] args){
        Triangulos triangulos = new Triangulos();
        
        JOptionPane.showMessageDialog(null, triangulos.tri(
            Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado 1: ")),
            Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado 2: ")),
            Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado 3: "))));
    }
}
