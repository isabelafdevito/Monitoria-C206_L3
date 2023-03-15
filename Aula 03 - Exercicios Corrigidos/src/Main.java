public class Main {
    public static void main(String[] args) {

        // EXERCICIO 1:
        //Criando os objetos da minha classe produtos:
        //colocando os atributos por construtor:
        Produto p1 = new Produto(123,"40", "Camisa polo", "Blusa", 20);
        Produto p2 = new Produto(421, "10", "Garrafa de agua", "Utensilios", 30);
        //chamando os metodos para cada produto:
        p1.mostraInfo();
        p2.mostraInfo();

        //EXERCICIO 2:
        //colocando os atributos um a um do carro c1:
        Carro c1 = new Carro();
        c1.marca = "BMW";
        c1.modelo = "X1";
        c1.cor = "preto";
        c1.velocidadeMax = 300;
        c1.velocidadeAtual = 120;
        //preenchendo os atributos do motor do carro c1:
        c1.m.tipo = "motor";
        c1.m.potencia = 90;

        //chamando os metodos para o carro c1:
        c1.mostraInfo();

        //colocando os atributos um a um do carro c2:
        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "CMA";
        c2.cor = "azul";
        c2.velocidadeMax = 200;
        c2.velocidadeAtual = 80;
        //preenchendo os atributos do motor do carro c1:
        c2.m.tipo = "motor 2";
        c2.m.potencia = 70;

        //chamando os metodos para o carro c1:
        c2.mostraInfo();






    }
}