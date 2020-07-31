package projetocontaluz;

import javax.swing.JOptionPane;

public class ProjetoContaLuz {

    public static void main(String[] args) {
        Luz leitura = new Luz();
        
        leitura.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura anterior: ")));
        leitura.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura atual: ")));
        
        int quantidade = leitura.leitura(leitura.getLeituraAnterior(), leitura.getLeituraAtual());
        
        double parcial = leitura.cobranca(quantidade, leitura.getTusd(), leitura.getTe());
        
        leitura.setTotal(leitura.verificaBandeira(quantidade, parcial));
        
        leitura.imprimeConta(leitura.getTotal());
        
    }
    
}
