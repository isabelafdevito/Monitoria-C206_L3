public interface GerenciaProjeto {

   // metodo já é abstrato por padrão, portanto não possui corpo: 
    public void gerenciar();


    /*
    classe abstrata:
    - voce nao precisa fazer override de todos os metodos,
    apenas do que voce deseja mudar o corpo do metodo
    e dos metodos que forem abstract
    - possui construtores
    - cada classe só pode extender uma classe abstrata (heranca simples) - cada filha só
    pode ter uma mãe
    - uma classe que não pode ser instanciada
    - pode ter atributos
    - usada para prover herança e polimorfismo
    - mesmo que a classe filha esteja vazia, a filha ainda tem implementações, pois tem as implementações da mãe

    Interfaces:
    - as classes que implementam uma interface obrigatoriamente tem que
    fazer Override de todos os métodos da interface
    - não possui construtores
    - uma classe pode ter mais de uma interface
    - não pode ter atributos, só cabeçalhos de métodos (por isso os metodos são todos abstratos)
    - suporta apenas constantes
    - TODOS OS METODOS DE UMA INTERFACE SAO PUBLIC ABSTRACT por padrão

     */

}
