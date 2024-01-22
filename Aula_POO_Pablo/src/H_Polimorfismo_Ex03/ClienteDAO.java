package H_Polimorfismo_Ex03;

public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() +
                "\nO endereço é: " + clienteDTO.getEndereco() +
                "\nO número é: " + clienteDTO.getNumero() +
                "\nA cidade é: " + clienteDTO.getCidade() +
                "\nO estado é: " + clienteDTO.getEstado();
    }
}
