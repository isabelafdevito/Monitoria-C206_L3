public class Cachorro extends Animal{

    private int latido;

    public int getLatido() {
        return latido;
    }

    public void setLatido(int latido) {
        this.latido = latido;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Altura: " + altura);
        System.out.println("Som: " + som);
        System.out.println("Latido: " + latido);
    }
}
