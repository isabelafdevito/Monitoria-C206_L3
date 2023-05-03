import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        int id = 0;
        Pedido po = new Pedido(id);
        Scanner sc = new Scanner(System.in);
        Item it;
        do {
            System.out.println("SISTEMA DE COMPRAS: ");
            System.out.println("Digte a opcao desejada: ");
            System.out.println("1 - Cadastrar um novo item");
            System.out.println("2 - Visualizar os itens do pedido ");
            System.out.println("10 - Para sair");

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        id++;
                        it = new Item(id);
                    /*
                    Quando estamos fazendo entrada de dados, o usuario pode digitar algo que não deveria ser, por exemplo
                    digitar um string para uma entrada nextInt() que irá aceitar apenas inteiros,e ai iriamos nos deparar com
                    o erro: java.util.InputMismatchException
                     */
                        // para evitar esse erro, adicionamos um bloco de código chamado try-catch para tratar a exceção e não "crashar" nosso código

                        System.out.println("Entre com a descricao do item: ");
                        String descricao = sc.nextLine();
                        it.setDescricao(descricao);

                        System.out.println("Entre com a quantidade de itens: ");
                        int quantidade = 0;
                        try {
                            quantidade = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println(e); // mensagem de erro da propria funcao
                            System.out.println("Entrada incorreta. Por favor, insira um número inteiro para a quantidade.");
                            sc.nextLine(); // consumir a entrada inválida
                            quantidade = sc.nextInt();
                            sc.nextLine(); // consumir a entrada
                        }
                        it.setQuantidade(quantidade);

                        System.out.println("Entre com o valor unitario: ");
                        double valorUnitario = 0.0;
                        try {
                            valorUnitario = sc.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println(e); // mensagem de erro da propria funcao
                            System.out.println("Entrada incorreta. Por favor, insira um número decimal para o valor unitário.");
                            sc.nextLine(); // consumir a entrada inválida
                            valorUnitario = sc.nextDouble();
                            sc.nextLine(); // consumir a entrada
                        }
                        it.setValorUnitario(valorUnitario);

                    /*
                    Sem controle de erros, iriamos adicionar itens sem para e iriamos receber o erro: java.lang.ArrayIndexOutofBounds
                    que significa que passamos do limite definido para o array: nesse caso que foi 3
                     */
                        // adicionando um bloco try-catch para adicionar os itens
                        try {
                            po.adicionarItem(it);
                        } catch (ArrayIndexOutOfBoundsException a) {
                            System.out.println(a); // dando sout na mensagem de erro
                            System.out.println("Voce só pode inserir 3 itens!"); // dando uma mensagem de erro própria
                        }

                        break;

                    case 2:
                        if (po != null) {
                            po.listarItens();
                            System.out.println("Valor total: " + po.calcularValorTotal());
                        } else {
                            System.out.println("Sem pedidos");
                        }
                        break;

                    case 10:
                        System.out.println("Compra finalizada. ");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }

        }while(op!=10);


    }
}