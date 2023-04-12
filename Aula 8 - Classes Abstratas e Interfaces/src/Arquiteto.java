public class Arquiteto extends Funcionario{

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

}
