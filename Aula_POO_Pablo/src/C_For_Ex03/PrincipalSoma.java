/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex03;

import javax.swing.JOptionPane;

public class PrincipalSoma {
    public static void main(String[] args) {
        Soma soma = new Soma();
        
        for(int cont = 0; cont < 10; cont++){
            soma.calcSoma(Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (cont + 1) + "º número: ")));
        }
        
        JOptionPane.showMessageDialog(null, soma.mostrarSoma());
        
    }
}
