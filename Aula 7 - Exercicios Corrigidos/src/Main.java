public class Main {
    public static void main(String[] args) {

        Camiseta cam = new Camiseta();
        cam.setNome("Camisa polo");
        cam.setTamanho("M");
        cam.setPreco(12.98);
        cam.setCor("Azul");
        System.out.println(cam.etiquetaPreco());

        Notebook nb = new Notebook();
        nb.setNome("Dell");
        nb.setPreco(3000);
        nb.setGpu("RTX 4090");
        nb.setProcessador("I5");
        nb.setArmazenamento(4000);
        System.out.println(nb.etiquetaPreco());

    }
}