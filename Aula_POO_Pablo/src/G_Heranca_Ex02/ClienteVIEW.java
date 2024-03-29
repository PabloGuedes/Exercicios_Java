package G_Heranca_Ex02;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));        
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));

        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));

        JOptionPane.showMessageDialog(null, fisicoCTR.imprimiDadosFisico(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
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
