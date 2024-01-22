package A_Introducao_Ex01;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome, rg;
    
    public void Mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome + "\nO RG informado foi: " + this.rg);
    }
    
    public void mostrarNome(String nome){
        this.nome = nome;
        System.out.println("O nome informado foi: " + this.nome);
    }  
} 
