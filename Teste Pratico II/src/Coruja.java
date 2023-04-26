public class Coruja extends Animal implements Alimentacao{

    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: " + cor);
    }

    public void voar(){
        System.out.println("A coruja esta voando");
    }

    @Override
    public String barulho() {
        return null;
    }

    @Override
    public void comendo() {
        System.out.println("A coruja esta comendo");
    }
}
