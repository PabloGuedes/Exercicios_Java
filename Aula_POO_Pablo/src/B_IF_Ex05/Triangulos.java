package B_IF_Ex05;


public class Triangulos {
    private int ladoA, ladoB, ladoC;
    private String resposta;
    
    public String tri(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
        if((this.ladoA + this.ladoB) > (this.ladoC)){
            this.resposta = "Podem formar um triângulo.";
        }
        else{
            if((this.ladoB + this.ladoC) > (this.ladoA)){
                this.resposta = "Podem formar um triângulo.";
            }
            else{
                if((this.ladoA + this.ladoC) > (this.ladoB)){
                    this.resposta = "Podem formar um triângulo.";
                }
                else{
                    this.resposta = "Não podem formar um triângulo.";
                }
            }
        }
        
        if((this.ladoA == this.ladoB) && (this.ladoB == this.ladoC)){
            this.resposta = "Triângulo equilátero.";
        }
        else{
            if((this.ladoA == this.ladoB) || (this.ladoA == this.ladoC) || (this.ladoB == this.ladoC)){
                this.resposta = "Triângulo isósceles.";
            }
            else{
                if((this.ladoA != this.ladoB) && (this.ladoB != this.ladoC)){
                    this.resposta = "Triângulo escaleno.";
                }
            }
        }
        
    return this.resposta;
    }
}
