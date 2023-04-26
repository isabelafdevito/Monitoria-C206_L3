public class Gato extends Animal implements Alimentacao{

    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Raca: " + raca);
    }
    public void correr(){
        System.out.println("O gato esta correndo");
    }

    @Override
    public String barulho() {
        return null;
    }

    @Override
    public void comendo() {
        System.out.println("O gato esta comendo");
    }
}
