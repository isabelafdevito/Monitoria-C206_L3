public class  Funcionario {


    private String nome;
    private int idade;
    private double salario;

    //criando os getters e setters:


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    private static int qntFuncionarios;

    public static int getQntFuncionarios() {
        return qntFuncionarios;
    }




    //exemplo de atributo estático:
    public Funcionario() {
        qntFuncionarios++;
    }

    // criando o metodo mostra Info:
    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
    }

    public void executaAcao(){
        System.out.println("O funcionario esta trabalhando");
    }



    public double salarioBonus(){
        return salario;
    }

    /*
    caracteristicas de uma classe abstrata:
    - não se pode criar objetos de uma classe abstrata (new)
    - nao precisa ter so metodo/atributos abstratos
    - todas as classes que deem extends em uma classe abstrata precisam dar override em TODOS
    os seus metodos abstratos
    - metodos abstratos NAO POSSUEM CORPO, apenas o "cabeçalho"
    - usada principalmente para prover herança e polimorfismo
    - deixa seu sistema mais coerente

    */

}
