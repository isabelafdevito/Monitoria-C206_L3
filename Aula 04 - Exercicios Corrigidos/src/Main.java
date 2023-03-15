import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //EXERCICIO 1:
        Carrinho c = new Carrinho();

        //criando o objeto do produto[0] do meu carrinho c:
        c.produtos[0] = new Produto();
        c.produtos[0].nome = "Blusa";
        c.produtos[0].preco = 40;
        c.produtos[0].fabricante = "Renner";
        c.produtos[0].descricao = "Blusa de frio branca";

        //criando um objeto do tipo produto e depois apontando o produto[1] do meu carrinho c para ele:
        Produto p = new Produto();
        p.nome = "Armario";
        p.preco = 200;
        p.fabricante = "Armarios Solucoes";
        p.descricao = "Guarda roupa 2 portas";

        c.produtos[1] = p;

        //chamando os métodos da classe carrinho:
        c.exibirInfos();
        System.out.println(c.calculaTotal());

        System.out.println();
        System.out.println("------------");
        System.out.println();


        //EXERCICIO 2:
        Empresa e1 = new Empresa();

        //preenchendo os atributos de empresa:
        e1.cnpj = "12345";
        e1.endereco = "INATEL";

        //criando e preenchendo os objetos de contatos da empresa e1:
        e1.contatos[0] = new Contato("Isabela", "isabela@inatel.br", "98772781", "23/09/2003");
        //ou:
        Contato c1 = new Contato("Bernardo", "bernardo@inatel.br", "83636483", "27/11/02");
        e1.contatos[1] = c1;

        //chamando o método da classe para o objeto de empresa e1:
        e1.exibirInfos();


        System.out.println();
        System.out.println("------------");
        System.out.println();

        //EXERCICIO 3:
        Restaurante r1 = new Restaurante();
        //preenchendo os atrbutos do restaurante:
        r1.nome = "Restaurante";
        r1.endereco = "INATEL";
        r1.cnpj = "4321";

        //criando e preenchendo os objetos de fornecedores do restaurante:
        r1.fornecedores[0] = new Fornecedor("Comida", 20);
        r1.fornecedores[1] = new Fornecedor("Talheres", 100);

        //chamando o metodo da classe para o objeto r1:
        r1.exibirInfos();


        System.out.println();
        System.out.println("------------");
        System.out.println();

        //DESAFIO 1:
        String[] nomes = new String[3];
        nomes[0] = "Isabela";
        nomes[1] = "Bernardo";
        nomes[2] = "Allan";

        System.out.println("Ordem colocada no array:");
        for(int i=0;i<nomes.length;i++) {
            if(nomes[i]!=null) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println();


        System.out.println("Ordem após a ordenação em ordem crescente: ");
        Arrays.sort(nomes);
        for(int i=0;i<nomes.length;i++) {
            if(nomes[i]!=null) {
                System.out.println(nomes[i]);
            }
        }







    }
}