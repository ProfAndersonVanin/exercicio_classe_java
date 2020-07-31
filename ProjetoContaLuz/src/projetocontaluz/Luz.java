package projetocontaluz;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Luz {
    public int leituraAnterior;
    public int leituraAtual;
    public double tusd = 0.3; //0,30 - fixos
    public double te = 0.29; //0,29 fixos
    public double total;
    public double valorParcial;
    public String corBandeira;
    public int difLeitura;

    public int leitura(int leituraAnterior, int leituraAtual){
        int diferenca = leituraAtual - leituraAnterior;
        this.setDifLeitura(diferenca);
        return diferenca;
    }
    
    public double cobranca(int quantidade,double tusd,double te){
        double parcial = (quantidade*tusd + quantidade*te)*1.25;
        this.setValorParcial(parcial);
        return parcial;
    }
    
    public double verificaBandeira(int quantidade, double parcial){
        double precoTotal=0;
        double acrescimo;
        if(quantidade<=100){
            precoTotal = parcial;
            this.setCorBandeira("VERDE");
            //System.out.println("VERDE");
        }
        else if(quantidade > 100 && quantidade <= 150){
            acrescimo = quantidade*0.01343*1.25;
            precoTotal = parcial + acrescimo;
            this.setCorBandeira("AMARELA");
            //System.out.println("AMARELA");
        }
        else if(quantidade > 150 && quantidade <= 200){
            acrescimo = quantidade*0.04169*1.25;
            precoTotal = parcial + acrescimo;
            this.setCorBandeira("VERMELHA-1");
            //System.out.println("VERMELHA 1");
        }
        else{
            acrescimo = quantidade*0.06243*1.25;
            precoTotal = parcial + acrescimo;
            this.setCorBandeira("VERMELHA-2");
            //System.out.println("VERMELHA 2");
        }
        return precoTotal;
    }
    
    public void imprimeConta(double precoTotal){
        DecimalFormat df = new DecimalFormat("#.00");//152.24
        JOptionPane.showMessageDialog(null, "**Cia Eletrica Etec MCM** \n"
                + "*********************************\n"
                + "Consumo anterior: " + this.getLeituraAnterior() + " Kw\n"
                + "Consumo atual: " + this.getLeituraAtual() + " Kw\n"
                + "Quantidade Consumida: " + this.getDifLeitura() + " Kw\n"
                + "Tarifa Bandeira: " + this.getCorBandeira() + "\n"
                + "Valor Parcial R$ " + df.format(this.getValorParcial()) + "\n"
                + "Valor Total: R$ " + df.format(this.getTotal())
        );
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }
    
    public String getCorBandeira() {
        return corBandeira;
    }

    public void setCorBandeira(String corBandeira) {
        this.corBandeira = corBandeira;
    }
    
    public int getDifLeitura() {
        return difLeitura;
    }

    public void setDifLeitura(int difLeitura) {
        this.difLeitura = difLeitura;
    }
}
