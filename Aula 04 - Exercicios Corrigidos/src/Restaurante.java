public class Restaurante {

    String cnpj;
    String endereco;
    String nome;

    //criando um array do tipo fornecedores:
    Fornecedor[] fornecedores = new Fornecedor[4];

    void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereco: " + endereco);
        for(int i=0;i<fornecedores.length;i++) {
            if(fornecedores[i] != null) {
                System.out.println("Tipo: " + fornecedores[i].tipo);
                System.out.println("Quantidade: " + fornecedores[i].quantidade);
            }
        }
    }

}
