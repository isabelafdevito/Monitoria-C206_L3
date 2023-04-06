public class Gato extends Animal{

    public String raca;

    public Gato(float altura, String som, String raca) {
        this.altura = altura;
        this.som = som;
        this.raca = raca;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Raca: " + raca);
    }

    public void dorme(){
        System.out.println("O gato esta dormindo");
    }

}
