package B_IF_Ex02;

public class Solo {
    private double solo;
    private String resposta;
    
    public String calcular(double solo){
        this.solo = solo;
        
        if(this.solo <= 10){
            this.resposta = "Rochoso!";
        }
        else{
            if((this.solo > 10) && (this.solo <= 30)){
                this.resposta = "Firme!";
            }
            else{
                if((this.solo > 40) && (this.solo <= 80)){
                    this.resposta = "Pantanoso!";
                }
                else{
                    this.resposta = "Quantidade de água inválida!";
                }
            }
        }
        return resposta;
    }
}
