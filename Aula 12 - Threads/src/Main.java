public class Main {
    public static void main(String[] args) {

        /*
        Existem duas formas de implementar Threads:
        I) extends Thread
        II) implements runnable
        */

        // METODO 1:
        Exemplo1 e1 = new Exemplo1("Thread 1");
        Exemplo1 e2 = new Exemplo1("Thread 2");


        e1.start();
        e2.start();


        // METODO 2:
        Exemplo2 ex1 = new Exemplo2("Thread runnable 1");
        Exemplo2 ex2 = new Exemplo2("Thread runnable 2");

        Thread t1 = new Thread(ex1);
        Thread t2 = new Thread(ex2);

        t1.start();
        t2.start();


        /*
        Forma de setar a prioridade de uma thread que varia de 1 (minimo) ate 10 (maximo)
        NÃO É UM METODO GARANTIDO, A ESCOLHA FINAL CONTINUA SENDO DO SO
         */
        e1.setPriority(1);
        e2.setPriority(2);
        t1.setPriority(Thread.MIN_PRIORITY);  // Prioridade mínima (1)
        t2.setPriority(Thread.MAX_PRIORITY);  // Prioridade maxima (10)

    }
}