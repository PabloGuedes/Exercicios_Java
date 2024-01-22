package B_IF_Ex03;

public class Numeros {
    
    private int n1, n2, n3, n4;
    private String resposta;
    
    public String ordem(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        
        if(this.n4 >= this.n3){
            this.resposta = "A ordem decrescente é: " +
                    this.n4 + " - " + this.n3 + " - " +
                    this.n2 + " - " + this.n1;
        }
        else{
            if((this.n4 >= this.n2) && (this.n4 < this.n3)){
                this.resposta = "A ordem decrescente é: " +
                    this.n3 + " - " + this.n4 + " - " +
                    this.n2 + " - " + this.n1;
            }
            else{
                if((this.n4 >= n1) && (this.n4 < this.n2)){
                    this.resposta = "A ordem decrescente é: " +
                        this.n3 + " - " + this.n2 + " - " +
                        this.n4 + " - " + this.n1;
                }
                else{
                    this.resposta = "A ordem decrescente é: " +
                        this.n3 + " - " + this.n2 + " - " +
                        this.n1 + " - " + this.n4;
                }
            }
        }
        return this.resposta;
    }
}
