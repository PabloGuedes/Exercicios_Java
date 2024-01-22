/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex03;


public class Soma {
    private int soma = 0;
    
    public void calcSoma(int soma){
        this.soma += soma;
    }    
    
    public String mostrarSoma(){
        return "A soma dos números é: " + this.soma;
    } 
    
}
