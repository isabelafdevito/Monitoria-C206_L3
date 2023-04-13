public class Engenheiro extends Funcionario implements GerenciaProjeto{
    //atributos apenas de engenheiro:
    private String ramo;
    private double bonus;

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
    }

    //dando Override no metodo executaAcao para mudar o que o metodo retorna:
    @Override
    public void executaAcao(){
        System.out.println("O engenheiro " + getNome() + " está trabalhando em um projeto");
    }

    @Override
    public double salarioBonus(){
        return (super.salarioBonus() + bonus);
    }

    @Override
    public void gerenciar() {
        System.out.println("O engenheiro esta gerenciando um projeto");
    }
}
