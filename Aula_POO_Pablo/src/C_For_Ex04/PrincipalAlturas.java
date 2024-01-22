/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;

import javax.swing.JOptionPane;

public class PrincipalAlturas {
    public static void main(String[] args) {
        Alturas alturas = new Alturas();
        
        
        for(int cont = 0; cont < 2; cont++){
            alturas.verificarAlturas(Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (cont + 1) + "º altura: ")));
        }
        
        JOptionPane.showMessageDialog(null, "A média das alturas é: " + alturas.calcularAlturas());
        
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas com mais de 2 metros é: " + alturas.altMaiorDois());
        
    }
}
