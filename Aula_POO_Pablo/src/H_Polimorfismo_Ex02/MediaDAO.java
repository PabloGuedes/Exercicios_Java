package H_Polimorfismo_Ex02;

public class MediaDAO {
    private double media = 0;
    
    public void calcularMedia(MediaDTO mediaDTO){
        if(mediaDTO.getTipo() == 1){
            calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
        }
        else{
            if(mediaDTO.getTipo() == 2){
                calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
            }
            else{
                if(mediaDTO.getTipo() == 3){
                    calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
                }
            }
        }
    }
    
    private void calcularMedia(double n1, double n2){
        media = (n1 + n2)/2;
    }
    
    private void calcularMedia(double n1, double n2, double n3){
        media = (n1 + n2 + n3)/3;
    }
    
    private void calcularMedia(double n1, double n2, double n3, double n4){
        media = (n1 + n2 + n3 + n4)/4;
    }
    
    public String imprimir(){
        return "A média é: " + media;
    }
}
