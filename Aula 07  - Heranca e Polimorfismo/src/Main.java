public class Main {
    public static void main(String[] args) {


        Gato g = new Gato(2, "miau", "vira-lata");
        g.mostraInfo();
        g.fazSom();
        g.dorme();

        System.out.println();

        Coruja c = new Coruja();
        c.altura = 2;
        c.som = "au";
        c.cor = "branca";
        c.mostraInfo();
        c.fazSom();

        System.out.println();


        Animal[] animais = new Animal[2];
        animais[0] = new Gato(2, "miau", "siames");
        animais[0].mostraInfo();
        animais[0].fazSom();

        System.out.println();

        Cachorro ca = new Cachorro();
        ca.setLatido(2);
        ca.altura = 3;
        ca.som = "au au";
        animais[1] = ca;
        ca.mostraInfo();
        animais[1].mostraInfo();


    }
}