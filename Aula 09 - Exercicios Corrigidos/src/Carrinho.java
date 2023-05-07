import java.util.ArrayList;

public class Carrinho {

    // criando o array list do tipo produtos:
    private ArrayList<Produto> produtos = new ArrayList();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

}
