package A_Introducao_Ex04;

import javax.swing.JOptionPane;

public class PrincipalSalario_Vendas {
    public static void main(String[] args){
        Salario_Vendas salario_vendas = new Salario_Vendas();
        double salario, vendas;

        salario = Double.parseDouble(
                JOptionPane.showInputDialog(
                "Informe o salário do funcionário: "));
        
        vendas = Double.parseDouble(
                JOptionPane.showInputDialog(
                "Informe o valor das vendas do do funcionário: "));

        JOptionPane.showMessageDialog(null, salario_vendas.calcularSalvendas(salario, vendas));
    }
}
