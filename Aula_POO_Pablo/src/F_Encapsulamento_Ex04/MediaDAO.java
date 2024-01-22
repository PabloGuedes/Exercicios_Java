package F_Encapsulamento_Ex04;

public class MediaDAO {

    public String imprimir(MediaDTO mediaDTO) {

        if (((mediaDTO.getNota_1() + mediaDTO.getNota_2()) / 2) >= 7.0) {
            return "Aluno aprovado.";
        } else {
            if (((mediaDTO.getNota_1() + mediaDTO.getNota_2()) / 2) <= 4.0) {
                return "Aluno reprovado.";
            } else {
                return "Aluno de recuperação.";
            }
        }
    }
}
