/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex02;

/**
 *
 * @author Aluno
 */
public class Intervalo {
    private int n1, n2;
    String imprimir="";
    
    public String calcIntervalo(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        
        for(int cont = this.n1; cont < this.n2; cont++){
            this.imprimir += cont + " ";
        }
        
        return this.imprimir;
    }
}
