import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op;
        int id = 0;
        Pedido po = new Pedido(id);;
        Scanner sc = new Scanner(System.in);
        Item it;
        do{
            System.out.println("SISTEMA DE COMPRAS: ");
            System.out.println("Digte a opcao desejada: ");
            System.out.println("1 - Cadastrar um novo item");
            System.out.println("2 - Visualizar os itens do pedido ");
            System.out.println("10 - Para sair");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    id++;
                    it = new Item(id);
                    /*
                    Quando estamos fazendo entrada de dados, o usuario pode digitar algo que não deveria ser, por exemplo
                    digitar um string para uma entrada nextInt() que irá aceitar apenas inteiros,e ai iriamos nos deparar com
                    o erro: java.util.InputMismatchException
                     */
                    System.out.println("Entre com a descricao do item: ");
                    it.setDescricao(sc.nextLine());
                    System.out.println("Entre com a quantidade de itens: ");
                    it.setQuantidade(sc.nextInt());
                    System.out.println("Entre com o valor unitario: ");
                    it.setValorUnitario(sc.nextDouble());
                    /*
                    Sem controle de erros, iriamos adicionar itens sem para e iriamos receber o erro: java.lang.ArrayIndexOutofBounds
                    que significa que passamos do limite definido para o array: nesse caso que foi 3
                     */
                    po.adicionarItem(it);

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
        } while(op!=10);

    }
}