import exercicio1.Calculadora;
import exercicio2.Cliente;
import exercicio2.Conta;

public class Main {
    public static void main(String[] args) {

        // main exercicio 1:
        Calculadora c = new Calculadora();
        c.circunferencia(3);
        c.volume(3);

        //main exercicio 2:
        Conta conta = new Conta();
        Cliente c1 = new Cliente();

        conta.setSaldo(1500);
        System.out.println(conta.getSaldo());

        conta.deposita(200);
        System.out.println(conta.getSaldo());

        conta.saca(1000);
        System.out.println(conta.getSaldo());

        c1.setNome("Isabela");
        c1.setCpf(12345679);

        conta.addCliente(c1);

        conta.extrato();


    }
}