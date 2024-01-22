/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;

import javax.swing.JOptionPane;

public class PrincipalTabuada {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        
        JOptionPane.showMessageDialog(null,
                tabuada.calcTabuada(Integer.parseInt(
                JOptionPane.showInputDialog(
                "Informe o número para calcular a tabuada: "))));
        
    }
}
