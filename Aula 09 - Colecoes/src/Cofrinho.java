import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {

    //definindo um array list de moedas:
    ArrayList<Moeda> m = new ArrayList<>();
    double valor;

    // método para adicionar uma nova moeda:
    public void addMoeda(Moeda moeda) {
        m.add(moeda);
    };

    //pegando o valor total presente no cofre;
    public double getValorTotal() {
        for(Moeda m1 : m) {
            valor = valor + m1.getValor();
        }

        return valor;
    }

    //pegando a quantidade de moedas usando um metodo de array list chamado size:
    public int getQuantMoedas() {
        return m.size();
    }

    //pegando a moeda de maior valor usando um metodo de colections de array list chamado.max
    //que devolve o maior valor de uma array
    public Moeda getMoedaMaiorValor() {
        Moeda m1 =  Collections.max(m);
        return m1;
    }


    // ordenando as moedas por meio do metodo sort:
    public void ordenaMoedas() {
        Collections.sort(m);
        for(Moeda m1 : m) {
            System.out.println(m1.getValor());
        }
    }
}
