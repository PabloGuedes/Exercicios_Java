package B_IF_Ex03;

import javax.swing.JOptionPane;

public class PrincipalNumeros {
    public static void main(String[] args){
        Numeros numeros = new Numeros();
        
    JOptionPane.showMessageDialog(null, "A ordem ficará: " + numeros.ordem(
        Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Informe o número 4: "))));
    }
}
