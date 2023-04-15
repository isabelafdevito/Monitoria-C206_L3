import exercicio1.Hatch;
import exercicio1.SUV;
import exercicio1.Sedan;
import exercicio2.Fogao;
import exercicio2.Geladeira;

public class Main {
    public static void main(String[] args) {

        //main exercicio 1:

        Sedan sedan = new Sedan();
        sedan.setAno(2010);
        sedan.setCor("vermelho");
        sedan.setValor(30000);
        sedan.setPortaMalas(2);

        sedan.taxa();
        System.out.println();
        sedan.mostraInfo();
        System.out.println();

        SUV suv = new SUV();
        suv.setAno(2003);
        suv.setCor("branco");
        suv.setValor(15000);
        suv.setTracao("24");

        suv.taxa();
        System.out.println();
        suv.mostraInfo();
        System.out.println();

        Hatch hatch = new Hatch();
        hatch.setAno(2002);
        hatch.setCor("azul");
        hatch.setValor(20000);
        hatch.setPortas(4);

        hatch.taxa();
        System.out.println();
        hatch.mostraInfo();
        System.out.println();

        //main exercicio 2:
        Geladeira g = new Geladeira();
        g.setCodigo(123);
        g.setDescricao("Geladeira");
        g.setTamanho(10);
        g.setQuantidadePortas(2);
        g.setTipo("Eletrica");
        g.setFabricante("Eletrolux");
        g.setValor(2000);

        Fogao f = new Fogao();
        f.setDescricao("Geladeira");
        f.setQuantidadeBocas(2);
        f.setCodigo(321);
        f.setFabricante("Eletrolux");
        f.setValor(2000);
        f.setTipoAcendimento("eletrico");



    }
}