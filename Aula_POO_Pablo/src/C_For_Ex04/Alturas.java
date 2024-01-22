/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex04;

/**
 *
 * @author Aluno
 */
public class Alturas {
    private int somaMaiorDois = 0;
    double altura, somaAlt, mediaAlt;
    
    public void verificarAlturas(double altura){
        this.altura = altura;
        this.somaAlt += altura;
        
        if(this.altura >2){
            this.somaMaiorDois++;
        }
    }
    
    public double calcularAlturas(){
        return this.somaAlt / 20;
    }
     
    public double altMaiorDois(){
        return this.somaMaiorDois;
    }
    
}
