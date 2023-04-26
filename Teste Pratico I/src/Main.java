public class Main {
    public static void main(String[] args) {

        //criando o objeto da faculdade:
        Faculdade f = new Faculdade("INATEL", "12345");

        //criando os objetos alunos:
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Isabela";
        aluno1.curso = "Engenharia de Telecomunicacoes";
        aluno1.matricula = 9753;
        aluno1.materias[0] = new Materia("Java", "C206", 6);
        aluno1.materias[1] = new Materia("Calculo 1", "M003", 4);

        f.a1 = aluno1;

        //metodo para exibir as informacoes da faculdade:
        f.exibirInfos();
        f.a1.exibirInfo();
        System.out.println(f.a1.totalCreditos());

    }
}