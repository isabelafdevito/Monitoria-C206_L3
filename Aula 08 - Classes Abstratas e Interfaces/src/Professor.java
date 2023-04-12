public class Professor extends Funcionario{

    private String materia;

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void executaAcao(){
        System.out.println("O professor esta dando aula de " + materia);
    }


    public void corrigirProvas(){
        System.out.println("O professor está corrigindo as provas");
    }


}
