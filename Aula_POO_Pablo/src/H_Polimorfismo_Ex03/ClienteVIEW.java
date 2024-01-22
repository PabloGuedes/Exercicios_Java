package H_Polimorfismo_Ex03;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
        G_Heranca_Ex02.FisicoDTO fisicoDTO = new G_Heranca_Ex02.FisicoDTO();
        G_Heranca_Ex02.FisicoCTR fisicoCTR = new G_Heranca_Ex02.FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));        
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));

        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));

        JOptionPane.showMessageDialog(null, fisicoCTR.imprimiDadosFisico(fisicoDTO));
        
        G_Heranca_Ex02.JuridicoDTO juridicoDTO = new G_Heranca_Ex02.JuridicoDTO();
        G_Heranca_Ex02.JuridicoCTR juridicoCTR = new G_Heranca_Ex02.JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));        
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o IE: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.imprimiDadosJuridico(juridicoDTO));
    }
}
