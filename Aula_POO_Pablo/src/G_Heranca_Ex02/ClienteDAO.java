package G_Heranca_Ex02;

public class ClienteDAO {
    public String imprimiDadosCliente(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() +
                "\nO endereço é: " + clienteDTO.getEndereco() +
                "\nO número é: " + clienteDTO.getNumero() +
                "\nA cidade é: " + clienteDTO.getCidade() +
                "\nO estado é: " + clienteDTO.getEstado();
    }
}
