package exercicio1;

import exercicio1.Carro;

public class Hatch extends Carro {

    private int portas;

    public void setPortas(int portas) {
        this.portas = portas;
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
        System.out.println("Portas: " + portas);
    }

}
