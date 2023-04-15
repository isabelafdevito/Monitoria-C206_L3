package exercicio2;

public class Conta {

    private static int qntClientes;
    private double saldo;

    Cliente c;
    public void addCliente(Cliente cliente){
        this.c = cliente;
        qntClientes++;
    }

    //metodos getters e setters:


    public static int getQntClientes() {
        return qntClientes;
    }

    public static void setQntClientes(int qntClientes) {
        Conta.qntClientes = qntClientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos da classe:
    public void saca(double valor){
        if(valor<=saldo) {
            saldo -= valor;
        } else
            System.out.println("Saldo insuficiente");
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void extrato(){
        System.out.println("Saldo: " +saldo);
    }

}
