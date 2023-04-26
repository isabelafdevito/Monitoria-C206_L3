public class Moeda implements Comparable<Moeda>{

    private float valor;

    //inserindo a moeda por meio de um constructor:
    public Moeda(float v) {
        valor =  v;
    };

    //pegando o valor da moeda:
    public float getValor() {
        return valor;
    }

    //implementando o método compareTo para ordenar as moedas por valor
    @Override
    public int compareTo(Moeda o) {
        if(valor > o.valor) {
            return 1;
        }
        else if (valor < o.valor) {
            return -1;
        }
        return 0;
    }
}