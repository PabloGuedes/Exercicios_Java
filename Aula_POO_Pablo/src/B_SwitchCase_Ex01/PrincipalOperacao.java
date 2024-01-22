/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_SwitchCase_Ex01;

import javax.swing.JOptionPane;

public class PrincipalOperacao {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        
        int op, n1, n2;
        op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a n2: "));
        
        JOptionPane.showMessageDialog(null, operacao.calcular(op, n1, n2));
    }
}
