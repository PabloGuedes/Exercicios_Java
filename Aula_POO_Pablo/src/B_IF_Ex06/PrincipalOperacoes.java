/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex06;

import javax.swing.JOptionPane;

public class PrincipalOperacoes {
    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        int n1, n2;
        char opcao;

        opcao = JOptionPane.showInputDialog("Informe a operação: ").charAt(0);
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n2: "));

        JOptionPane.showMessageDialog(null, operacoes.calcular(opcao, n1, n2));
    }
}
