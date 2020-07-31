package projetoestacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    protected double preco;
    //R$4,00 por hora cheia
    
    public double calcula_tempo(double hora_entrada,double min_entrada,double hora_saida,double min_saida){
              
        double conv_ent = hora_entrada + min_entrada/60;//1,25
        double conv_saida = hora_saida + min_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);//2,01 ==> 3,00
        
        return tempo;
    }
    
    public void gera_nota(double tempo,double preco){
        double valor_total = tempo * this.getPreco();
        
        JOptionPane.showMessageDialog(null, "ESTACIONAMENTO ETEC MCM\n"
                + "Dados do Veículo:\n"
                + "Placa: " + this.getPlaca()+"\n"
                + "Modelo: " + this.getModelo()+"\n"
                + "Hora de Entrada: " +this.hora_entrada+" h e " + this.min_entrada + "min \n"
                + "Hora de Saída: " + this.hora_saida + " h e " + this.min_saida + " min \n"
                + "Quantidade Horas Cheias: " + tempo + " horas \n"
                + "Valor Total a pagar R$ " + valor_total);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public double getMin_entrada() {
        return min_entrada;
    }

    public void setMin_entrada(double min_entrada) {
        this.min_entrada = min_entrada;
    }

    public double getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(double hora_saida) {
        this.hora_saida = hora_saida;
    }

    public double getMin_saida() {
        return min_saida;
    }

    public void setMin_saida(double min_saida) {
        this.min_saida = min_saida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
