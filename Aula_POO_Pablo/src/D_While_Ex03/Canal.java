package D_While_Ex03;

public class Canal {
    String resp;
    private int canal, nove, doze, vinTres, quarenta, outros;
    
    public void verifica(int canal){
        this.canal = canal;
        
        switch(canal){
            case 9:
                this.nove++;
            break;
            
            case 12:
                this.doze++;
            break;
            
            case 23:
                this.vinTres++;
            break;
            
            case 40:
                this.quarenta++;
            break;
            
            default:
                if(canal != 0){
                    this.outros++;
                }
        }
    }
    
    public String mostra(){
        this.resp = "Audiência canal nove: " + nove + 
               "\nAudiência canal doze: " + doze + 
               "\nAudiência canal vinte e três: " + vinTres + 
               "\nAudiência canal quarenta: " +  quarenta + 
               "\nAudiência outros canais: " + outros;
        return this.resp;
    }
    
}
