/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_Ex02;

/**
 *
 * @author Aluno
 */
public class Letras {
    private int a=0, e=0, i=0, con=0, o=0, u=0;
    public void comapara(String l){
        switch(l.toLowerCase()){
            case "a":
                a++;
            case "e":
                e++;
            case "i":
                i++;
            case "o":
                o++;
            case "u":
                u++;
            case "0":
                break;
            default:
                con++;
        }
    }
    public String mostra(){
        return "Vogais A: "+a+"\nVogais E: "+e+"\nVogais I: "+i+"\nVogais O: "+o+"\nVogais U: "+u+"\nConsoantes: "+con;
    }
}
