package J_Vetor_Ex02;

public class DecrescenteDAO {

    private String resposta = "";

    public String ordemInversa(DecrescenteDTO decrescenteDTO){
        int num[] = decrescenteDTO.getNum();

        for(int i = 19; i >= 0; i--){
            this.resposta += num[i] + "\n";
        }
        
        return this.resposta;

    }
}
