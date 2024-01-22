/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex06;

/**
 *
 * @author Aluno
 */
public class Operacoes {
    private int n1, n2;
    char opcao;
    
    public String calcular(char opcao, int n1, int n2) {
        this.opcao = Character.toUpperCase(opcao);
        this.n1 = n1;
        this.n2 = n2;
        
        switch(this.opcao){
            case 'A':
                return "O resultado é: " + (this.n1 + this.n2);
            case 'S':
                return "O resultado é: " + (this.n1 - this.n2);
            case 'M':
                return "O resultado é: " + (this.n1 * this.n2);
            case 'D':
                return "O resultado é: " + (this.n1 / this.n2);
            default:
                return "Opção inválida!";
        }
    }
}
