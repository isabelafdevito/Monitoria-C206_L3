public class Aviao {


    Piloto p;
    Motor m = new Motor();

    Aviao(String modelo1, double velocidadeMaxima1, boolean gasolina1) {
        this.modelo = modelo1;
        this.velocidadeMaxima = velocidadeMaxima1;
        this.gasolina = gasolina1;
    }

    String modelo;
    double velocidadeMaxima;
    boolean gasolina;

    void decolar() {
        System.out.println("O aviao decolou");
    }

    void decolar(int horario) {
        System.out.println("O aviao decolou as: " + horario + " horas");
    }



    int abastecer(int quantidade) {
      return quantidade;
    }



}
