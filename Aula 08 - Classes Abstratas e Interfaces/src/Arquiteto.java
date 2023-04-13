public class Arquiteto extends Funcionario implements GerenciaProjeto{

    private String especialidade;

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executaAcao(){
        System.out.println("O arquiteto " + getNome() + " esta trabalhando com sua especialidade: " + especialidade);
    }

    @Override
    public void gerenciar() {
        System.out.println("O arquiteto esta trabalhando em um projeto");
    }
}
