package B_IF_Ex04;

public class Altura_Peso {
    private double altura, peso;
    private String resposta;
    
    public String classificacao(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        
        if(this.altura <= 1.20){
            if(this.peso <= 60){
                this.resposta = "A";
            }
            else{
                if((this.peso > 60) && (this.peso < 90)){
                    this.resposta = "D";
                }
                else{
                    this.resposta = "G";
                }
            }
        }
        
        if((this.altura > 1.20) && (this.altura <= 1.70)){
            if(this.peso <= 60){
                this.resposta = "B";
            }
            else{
                if((this.peso > 60) && (this.peso < 90)){
                    this.resposta = "E";
                }
                else{
                    this.resposta = "H";
                }
            }
        }
        
        if(this.altura > 1.70){
            if(this.peso <= 60){
                this.resposta = "C";
            }
            else{
                if((this.peso > 60) && (this.peso < 90)){
                    this.resposta = "F";
                }
                else{
                    this.resposta = "I";
                }
            }
        }
        return this.resposta;
    }
}
