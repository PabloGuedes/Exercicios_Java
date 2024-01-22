/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex01;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private int numero;
    private String imprimir="";
    public String calcTabuada(int numero) {
        this.numero = numero;
        
        for(int cont=1; cont<=10; cont++){
            this.imprimir = this.imprimir + "\n" +
                cont + " x " +
                this.numero + " = " + cont*this.numero;
        }
        return this.imprimir;
    }
}
