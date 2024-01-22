package A_Introducao_Ex03;

import javax.swing.JOptionPane;

public class principalSalario {
    public static void main(String[] args) {
        
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "O salário final será: " + salario.calcularSalario(
            Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe a Porcentagem de Aumento: "))
        ));                        
    }
}
