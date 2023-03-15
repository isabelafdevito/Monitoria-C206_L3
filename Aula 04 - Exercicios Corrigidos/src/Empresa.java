public class Empresa {

    String cnpj;
    String endereco;

    //criando uma array de contatos:
    Contato[] contatos = new Contato[5];


    //implementando o método da classe:
    void exibirInfos() {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        for(int i=0;i<contatos.length;i++) {
            if(contatos[i] != null) {
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Email: " + contatos[i].email);
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Data de nascimento: " + contatos[i].dataNascimento);
            }
        }
    }
}
