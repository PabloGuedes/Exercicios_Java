package F_Encapsulamento_Ex05;

public class SoloDAO {
    public String imprimir(SoloDTO soloDTO) {
        if (soloDTO.getSolo() <= 10.0) {
            return "Esse é um solo rochoso.";
        } else {
            if ((soloDTO.getSolo() > 10.0) && (soloDTO.getSolo() < 40.0)) {
                return "Esse é um solo firme.";
            } else {
                if ((soloDTO.getSolo() > 40.0) && (soloDTO.getSolo() < 80.0)) {
                    return "Esse é um solo pantanoso.";
                }
                else{
                    return "Quantidade de água inválida.";
                }
            }
        }
    }
}
