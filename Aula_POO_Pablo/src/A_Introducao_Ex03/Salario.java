package A_Introducao_Ex03;

public class Salario {
    
    private double salario, porcentagem;
    
    public double calcularSalario(double salario, double porcentagem){
        this.salario = salario;
        this.porcentagem = porcentagem;
        
        this.salario = (this.salario * (this.porcentagem / 100)) + this.salario;
        
        return this.salario;
    }
}