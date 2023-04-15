package exercicio1;

import exercicio1.Carro;

public class SUV extends Carro {

    private String tracao;

    public void setTracao(String tracao) {
        this.tracao = tracao;
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
        System.out.println("Tracao: " + tracao);
    }
}
