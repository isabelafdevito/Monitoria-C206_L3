public class Coruja extends Animal{

    public String cor;

    @Override
    public void mostraInfo() {
        System.out.println("Altura: " + altura);
        System.out.println("Som: " + som);
        System.out.println("Cor: " + cor);
    }

}
