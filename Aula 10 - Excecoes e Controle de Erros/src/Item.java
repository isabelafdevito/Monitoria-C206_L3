import java.math.BigDecimal;

public class Item {

    private final int ID; // final pois voce nao pode mudar o id
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public Item(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


}
