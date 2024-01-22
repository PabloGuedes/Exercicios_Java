package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class principalCliente1 {
    public static void main(String[] args) {
    
    Cliente1 cliente1 = new Cliente1();   

    JOptionPane.showMessageDialog(null, "A idade em anos é: " + cliente1.calcularIdade(
        Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "))
    ));
    }
}

