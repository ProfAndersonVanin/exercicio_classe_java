package projetobanco;

import javax.swing.JOptionPane;

public class ProjetoBanco {

    public static void main(String[] args) {
        // CLASSE PRINCIPAL DO PROJETO BANCO ETEC MCM
        // AQUI INSTANCIAMOS OS OBJETOS DA CLASSE BANCO
        
        Banco dados = new Banco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua agência: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite o número de sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(),dados.getSenha());
    }
}
