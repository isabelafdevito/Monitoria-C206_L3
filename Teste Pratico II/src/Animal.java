public abstract class Animal {

    public static int qntAnimais;
    private String nome;
    private int idade;
    private boolean perigoso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public Animal(){
        qntAnimais++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Perigoso: " + perigoso);
    }

    public abstract String barulho();
}
