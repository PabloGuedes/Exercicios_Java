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
public class PrincipalDoWhile {
    public static void main(String[] args) {
        int n;
        ExemploWhile ex = new ExemploWhile();
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            ex.somar(n);
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "A soma sera: "+ex.mostra());
    }
}
