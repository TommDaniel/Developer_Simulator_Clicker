package Gerenciamento;

public class Moeda {
    private double quantiPontos = 0;

    public void addPontos(int quantidade) {
        this.quantiPontos += quantidade;
    }

    public void removerPontos(double quantidade) {
        if (quantidade <= this.quantiPontos) {
            this.quantiPontos -= quantidade;
        } else {
            System.out.println("Não há código suficiente para a compra.");
        }
    }

    public double getPontos() {
        return quantiPontos;
    }
    public void setPontos(double i){
        quantiPontos = i;
    }

}