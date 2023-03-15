public class Carro {

    //atributos da classe:
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    //CRIANDO UMA ASSOCIACAO POR COMPOSICAO ENTRE CARRO-MOTOR:
    Motor m = new Motor();

    //metodos da classe:
    void ligar() {
        System.out.println("O carro ligou");
    }
    void acelerar() {
        System.out.println("O carro acelerou");
    }
    void mostraInfo() {
        System.out.println("Informações do carro: ");
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valocidade maxima: " +velocidadeMax);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }



}
