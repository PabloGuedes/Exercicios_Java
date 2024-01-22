package A_Introducao_Ex04;

public class Salario_Vendas {
    private double comissao, salario, salario_final, vendas;

    public String calcularSalvendas(double salario, double vendas){
        this.salario = salario;
        this.vendas = vendas;
        
        this.comissao = this.vendas * 0.04;
        this.salario_final = this.salario + this.comissao;
        
        return "O valor da comissão é: " + this.comissao +
            "\nO salário final do funcionário é: " + this.salario_final;
    }
}
