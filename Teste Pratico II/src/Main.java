public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.setNome("Zoologico");
        zoo.setEndereco("Endereco");
        zoo.setCnpj(123456789);

        Coruja c = new Coruja();
        c.setNome("Coruja");
        c.setIdade(19);
        c.setPerigoso(false);

        c.setCor("Branca");

        zoo.animais[0] = c;

        Gato g = new Gato();
        g.setNome("Gato");
        g.setIdade(5);
        g.setPerigoso(false);

        g.setRaca("Vira lata");

        zoo.animais[1] = g;

        Leao l = new Leao();
        l.setNome("Leao");
        l.setIdade(10);
        l.setPerigoso(true);

        l.setTamanhoJuba(20);

        zoo.animais[2] = l;

        zoo.mostraInfo();
        System.out.println();



    }
}