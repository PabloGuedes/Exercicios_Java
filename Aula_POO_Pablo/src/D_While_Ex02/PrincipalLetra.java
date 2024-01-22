/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalLetra {
    public static void main(String[] args) {
        Letras le = new Letras();
        String l= "";
        do{
            l = JOptionPane.showInputDialog("Informe a letra");
            le.comapara(l);
        }while(!l.equals("0"));
        JOptionPane.showMessageDialog(null, le.mostra());
    }
}
