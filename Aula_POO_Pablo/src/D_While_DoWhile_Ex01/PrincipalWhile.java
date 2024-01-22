/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalWhile {
    public static void main(String[] args) {
        int n=1;
        ExemploWhile ex = new ExemploWhile();
        while(n!=0){
            n=Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            ex.somar(n);
        }
        JOptionPane.showMessageDialog(null, "A soma sera: "+ex.mostra());
    }
}
