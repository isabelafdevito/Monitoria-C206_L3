import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Carrinho c = new Carrinho();
        Produto p1 = new Produto("Geladeira", 2000);
        Produto p2 = new Produto("Fone de ouvido", 100);
        Produto p3 = new Produto("Celular", 1500);

        c.addProduto(p1);
        c.addProduto(p2);
        c.addProduto(p3);

        for (Produto p : c.produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }

        System.out.println();

        // Exercicio I:

        Collections.sort(c.produtos);

        for (Produto p : c.produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }

        System.out.println();

        //Exercicio II:

        Collections.sort(c.produtos);

        for (Produto p : c.produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }

        System.out.println();

        // Exercicio III:

        Collections.sort(c.produtos);
        Collections.reverse(c.produtos);

        for (Produto p : c.produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }

        System.out.println();

    }
}