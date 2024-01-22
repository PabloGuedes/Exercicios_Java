/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_For_Ex05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class principalFuncionario {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("##,###.00");
        Funcionario funcionario = new Funcionario();
        JOptionPane.showMessageDialog(null, "O salário será: R$"+format.format(funcionario.calculaIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: ")))));
    }
}
