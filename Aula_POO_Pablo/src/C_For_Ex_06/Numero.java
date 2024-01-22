/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_For_Ex_06;

/**
 *
 * @author Aluno
 */
public class Numero {
    private int maior, menor;
    public void verifica(int n, int rod){
        if(rod==1){
            maior = n;
            menor = n;
        }else{
        if(n>=this.maior){
            this.maior=n;
        }else if(n<=this.menor){
            this.menor=n;
        }
    }
    }
    public String mostra(){
        return "O maior valor é: "+this.maior+"\nO menor valor é: "+this.menor;
    }
}
