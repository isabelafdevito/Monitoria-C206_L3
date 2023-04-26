public class Faculdade {

    //atributos da classe:
    String nome;
    String CNPJ;

    //construtor da classe:
    public Faculdade(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    //associacao por agregacao com aluno:
    Aluno a1;
    

    //metodo para exibir as informacoes da faculdade:
    void exibirInfos() {
        System.out.println("Informacoes da faculdade: ");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + CNPJ);
    }



}
