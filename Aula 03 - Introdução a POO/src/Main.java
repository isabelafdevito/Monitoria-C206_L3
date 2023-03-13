public class Main {
    public static void main(String[] args) {

        Aviao a1 = new Aviao("Azul", 9000, true);


        //System.out.println(a1.modelo);

        a1.decolar();
        a1.decolar(9);

        Piloto p1 = new Piloto();
        p1.nome = "Isabela";
    // agregacao:
        a1.p = p1;

        //System.out.println(a1.p.nome);

        a1.m.modelo = "modelo de motor";
        //System.out.println(a1.m.modelo);



    }
}
