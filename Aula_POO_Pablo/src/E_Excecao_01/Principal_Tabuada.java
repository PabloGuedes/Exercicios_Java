/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Excecao_01;

import javax.swing.JOptionPane;

public class Principal_Tabuada {
    public static void main(String[] args){
        try{
            Tabuada tabuada = new Tabuada();
            JOptionPane.showMessageDialog(null, tabuada.calcular(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "))));    
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro 001");
            System.out.println("Erro: " + erro.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema.");
        }
    }
}
