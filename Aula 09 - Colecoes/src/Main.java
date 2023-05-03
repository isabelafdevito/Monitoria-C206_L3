import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*
        Quando usamos arrays nos limitamos a criar objetos até o limite pré definido no array
        e se ultrapassarmos esse limite ou se acessarmos uma posicao nao preenchida encontramos
        os erros: NullPointerException ou ArrayIndexOutOfBoundsException

        Para isso, quando queremos criar uma lista que nao tenha tamanho pré definido
        e evitarmos os erros acima, usamos de listas em java, denominadas de Array List
        */

        //Exemplos de Array List:
        ArrayList lista = new ArrayList(); //Array list é uma classe do conjunto de classes collections

        //Conhecendo os métodos de listas:

        //inserindo elementos em uma lista:
        lista.add(1);
        lista.add("Isabela");
        lista.add(true);

        System.out.println(lista); // dando sout nos elementos da lista
        System.out.println(lista.size()); //dando sout no tamanho da lista

        // pegando o elemento de um index na lista:
        System.out.println(lista.get(0));
        System.out.println(lista.get(2));

        // pegando o index de um elemento na lista:
        System.out.println(lista.indexOf("Isabela"));

        //removendo um elemento:
        lista.remove(true);

        System.out.println(lista);

        // apagando toda a lista:
        lista.clear();

        System.out.println(lista);

        System.out.println("--------------------------------------------------");


        //USANDO O MÉTODO COLLECTION PARA STRINGS:
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Isabela");
        nomes.add("Bernardo");
        nomes.add("Carlos");

        System.out.println(nomes);

        Collections.sort(nomes); //usando o metodo sort para ordenar a lista

        System.out.println(nomes);

        System.out.println(Collections.max(nomes));
        System.out.println(Collections.min(nomes));

        //metodo de busca binaria para elementos de uma lista
        // deve estar previamente ordenado:
        if(Collections.binarySearch(nomes, "Carlos") >= 0){
            System.out.println("Achou");
        } else{
            System.out.println("Nao achou");
        }

        System.out.println("--------------------------------------------------");

        //USANDO O MÉTODO COLLECTION PARA NUMEROS:
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(10);
        numeros.add(-2);

        System.out.println(numeros);

        Collections.sort(numeros); //usando o metodo sort para ordenar a lista

        System.out.println(numeros);

        System.out.println(Collections.max(numeros));
        System.out.println(Collections.min(numeros));

        Collections.reverse(numeros); // inverte a ordem de uma lista

        System.out.println(numeros);

        
        Cofrinho c = new Cofrinho();

        Moeda m1 = new Moeda(50);
        Moeda m2 = new Moeda(10);
        Moeda m3 = new Moeda(25);

        c.addMoeda(m1);
        c.addMoeda(m2);
        c.addMoeda(m3);

        System.out.println("Informacoes do cofrinho: ");

        System.out.println("Valor total no cofrinho: " + c.getValorTotal());
        System.out.println("Moeda de maior valor no cofrinho: " + c.getMoedaMaiorValor().getValor());
        System.out.println("Quantidade de moedas no cofrinho: " + c.getQuantMoedas());
        System.out.println("Moedas ordenadas: ");
        c.ordenaMoedas();


    }
}