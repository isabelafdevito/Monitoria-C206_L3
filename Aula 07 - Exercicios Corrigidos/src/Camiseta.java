public class Camiseta extends Produto{

    private String cor;
    private String tamanho;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + " Cor: " + cor + " Tamanho: " + tamanho;
    }
}
