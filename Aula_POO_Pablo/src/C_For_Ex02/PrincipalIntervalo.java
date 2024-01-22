/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;

import javax.swing.JOptionPane;

public class PrincipalIntervalo {
    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo();
        
        int n1, n2;
        JOptionPane.showMessageDialog(null, intervalo.calcIntervalo(
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº 1: ")),
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe 0 nº 2: "))));
    }
}
