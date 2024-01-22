package F_Encapsulamento_Ex06;

public class TrianguloDAO {

    public String verificaTri(TrianguloDTO trianguloDTO) {
        if (((trianguloDTO.getLadoA() + trianguloDTO.getLadoB()) > trianguloDTO.getLadoC())
                && ((trianguloDTO.getLadoB() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoA())
                && ((trianguloDTO.getLadoA() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoB())) {
            return informaTri(trianguloDTO);
        } else {
            return "Não podem formar um triângulo.";
        }
    }

    public String informaTri(TrianguloDTO trianguloDTO) {
        if ((trianguloDTO.getLadoA() == trianguloDTO.getLadoB()) && (trianguloDTO.getLadoB() == trianguloDTO.getLadoC())) {
            return "Triângulo equilátero.";
        } else {
            if ((trianguloDTO.getLadoA() != trianguloDTO.getLadoB()) && (trianguloDTO.getLadoB() != trianguloDTO.getLadoC())) {
                return "Triângulo escaleno.";
            } else {
                return "Triângulo isósceles.";
            }
        }
    }
}
