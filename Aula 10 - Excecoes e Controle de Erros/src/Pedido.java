import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Pedido implements Carrinho{

    private int id;
    private Item[] itens;

    private final int MAXIMO_ITENS;
    private static int qntdeItens;
    public double total = 0;

    public Pedido(int id) {
        MAXIMO_ITENS = 3; //definindo que o numero maximo de itens por carrinho deve ser 3
        qntdeItens = 0; // vai aumentando a quantidade de itens cada vez
        itens = new Item[MAXIMO_ITENS];
    }


    @Override
    public void adicionarItem(Item it) throws ArrayIndexOutOfBoundsException {
        itens[qntdeItens] = it;
        qntdeItens++;

    }

    @Override
    public void listarItens() {
        for(Item it: itens) {
            if (it != null) {
                System.out.println("ID: " + it.getID());
                System.out.println("Descricao: " + it.getDescricao());
                System.out.println("Quantidade: " + it.getQuantidade());
                System.out.println("Valor unitario: " + it.getValorUnitario());

            }
        }

    }

    @Override
    public double calcularValorTotal() {
        total = 0;
        for(Item it : itens){
            if(it != null)
                total += it.getQuantidade()*it.getValorUnitario();
        }
        return total;
    }
}
