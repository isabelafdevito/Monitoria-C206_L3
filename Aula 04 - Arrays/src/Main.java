import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // criando um objeto do tipo carrinho:
        Carrinho c = new Carrinho();

        //instanciando cada posição do meu array de produtos que esta dentro de carrinho:
        c.produtos[0] = new Produto("Blusa", 20);

        Produto p1 = new Produto("Garrafa", 30);
        c.produtos[1] = p1;


        //varrendo as informações dos meus produtos que estão dentro do meu carrinho:
        for (int i = 0; i < c.produtos.length; i++) {
            //fazendo o tratamento:
            if (c.produtos[i] != null) {
                System.out.println("Nome do produto: " + c.produtos[i].nome);
                System.out.println("Quantidade: " + c.produtos[i].quantidade);
            }
        }

        for (Produto produtos : c.produtos) {
            if (produtos != null) {
                System.out.println("Nome do produto: " + produtos.nome);
                System.out.println("Quantidade: " + produtos.quantidade);

            }
        }

        // usando a biblioteca Arrays:
        String[] nomes = new String[3];
        nomes[0] = "Isabela";
        nomes[1] = "Bruna";
        nomes[2] = "Ana";

        for(int i=0;i<nomes.length;i++) {
            if(nomes[i] !=null) {
                System.out.println(nomes[i]);
            }
        }

        Arrays.sort(nomes);

        for(int i=0;i<nomes.length;i++) {
            if(nomes[i] !=null) {
                System.out.println(nomes[i]);
            }
        }


        }
    }

