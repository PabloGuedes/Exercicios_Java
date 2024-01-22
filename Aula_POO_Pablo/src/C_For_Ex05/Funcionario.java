package c_For_Ex05;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private double salario, aumento;
    public double calculaIdade(int ano){
        this.aumento = 1.5/100;
        this.salario =1000+ 1000*this.aumento;
        
        for(int i=1997;i<=ano;i++){
            this.aumento = this.aumento*2;
            this.salario = this.salario + this.salario*this.aumento;
        }
        return this.salario;
    }
}
