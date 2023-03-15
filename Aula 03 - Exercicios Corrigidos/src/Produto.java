public class Produto {


    //atributos da classe:
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    //construtor da classe:


    public Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    //metodos da classe:
    void mostraInfo() {
        System.out.println("Informações do produto: ");
        System.out.println("Codigo de serie: " + codigoSerie);
        System.out.println("Código do produto: " + codigoProduto);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }

}
