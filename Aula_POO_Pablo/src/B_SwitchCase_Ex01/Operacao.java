/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_SwitchCase_Ex01;

/**
 *
 * @author Aluno
 */
public class Operacao {
    private int opcao, n1, n2;
    public String calcular(int opcao, int n1, int n2){
        this.opcao = opcao;
        this.n1 = n1;
        this.n2 = n2;
        
        switch(this.opcao){
            case 1:
                return "O resultado é: " + (this.n1 + this.n2);
            
            case 2:
                return "O resultado é: " + (this.n1 - this.n2);
            
            default:
                return "Operação inválida.";
            
        }
    }
    
}
