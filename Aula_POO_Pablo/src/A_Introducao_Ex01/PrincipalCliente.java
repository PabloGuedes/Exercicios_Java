package A_Introducao_Ex01;

public class PrincipalCliente {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        String nome, rg;
        
        nome = "Pablo Guedes";
        rg = "53.083.069-3";
        
        cliente.Mostrar(nome, rg);
    }
    
}
