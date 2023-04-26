import java.math.BigDecimal;

public interface Carrinho {

     void adicionarItem(Item it);
     void listarItens();
    double calcularValorTotal();

}
