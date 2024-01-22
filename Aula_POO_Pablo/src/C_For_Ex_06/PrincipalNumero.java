/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex_06;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalNumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        for(int i=1;i<11;i++){
            numero.verifica(Integer.parseInt(JOptionPane.showInputDialog("Informe o "+i+" número: ")), i);
        }
        JOptionPane.showMessageDialog(null, numero.mostra());
    }
}
