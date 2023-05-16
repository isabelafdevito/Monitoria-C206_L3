public class Exemplo1 extends Thread{

    public String nome; // nome da Thread de exemplo

    public Exemplo1(String nome) {
        this.nome = nome;
    }

    /*
    Toda thread tem que ter o método run:
     */
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(nome + " - " + i);

            // metodo para dar delay em um thread / necessário usar dentro de um bloco try-catch
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
