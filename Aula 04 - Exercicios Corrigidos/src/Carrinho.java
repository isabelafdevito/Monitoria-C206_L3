public class Carrinho {

    double total;

    //criando uma array do tipo produtos
    Produto[] produtos = new Produto[5];

    //varrendo as informações de cada produto a partir do método da classe:
    void exibirInfos() {
        for(int i=0;i<produtos.length;i++) {
            if(produtos[i] != null) {
                System.out.println("Informações do produto " + i + ": ");
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Descricao: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preco: " + produtos[i].preco);
            }
        }
    }

    //calculando o valor total da compra somando o valor de cada produto:
    double calculaTotal() {
        for(int i=0;i<produtos.length;i++) {
            if (produtos[i] != null) {
                total += produtos[i].preco;
            }
        }
        return total;
    }

}
