public class Leao extends Animal{

    private float tamanhoJuba;

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tamanho juba: " + tamanhoJuba);
    }

    public void dormir(){
        System.out.println("O leao esta dormindo");
    }

    @Override
    public String barulho() {
        return "uououo";
    }
}
