package D_While_Ex03;

import javax.swing.JOptionPane;

public class PrincipalCanal {
    public static void main(String[] args) {
        int canal;
        Canal ca = new Canal();
        
        do{
            canal = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal: "));
            ca.verifica(canal);
        }while(canal != 0);
        
        JOptionPane.showMessageDialog(null, ca.mostra());
    }
}
