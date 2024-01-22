package B_IF_Ex04;

import javax.swing.JOptionPane;

public class PrincipalAltura_Peso {
    public static void main(String[] args){
        Altura_Peso altura_peso = new Altura_Peso();
    
    JOptionPane.showMessageDialog(null, "A classificação é: " + altura_peso.classificacao(
        Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")),
        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: : "))));
    }
}
