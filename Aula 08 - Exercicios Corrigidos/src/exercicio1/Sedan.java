package exercicio1;

import exercicio1.Carro;

public class Sedan extends Carro {

    private int portaMalas;

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        System.out.println("Taxa: " + getValor());
    }

    @Override
    public void mostraInfo() {
        System.out.println("Valor: " + getValor());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Porta Malas: " + portaMalas);
    }
}
