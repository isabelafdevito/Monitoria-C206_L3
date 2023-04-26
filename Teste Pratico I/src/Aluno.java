import java.util.Arrays;

public class Aluno {

    //atributos da classe:
    String nome;
    int matricula;
    String curso;

    //array de materias:
    Materia[] materias = new Materia[4];


    //metodo para exibir informações:
    void exibirInfo() {
        System.out.println("Informacoes do aluno: ");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Materias que o aluno esta fazendo: ");
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                System.out.println("Nome: " + materias[i].nome);
                System.out.println("Sigla: " + materias[i].sigla);
                System.out.println("Quantidade de creditos: " + materias[i].creditos);
            }
        }
    }

    // metodo total de creditos:
    int totalCreditos() {
        int total = 0;
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                total += materias[i].creditos;
            }
        }
        return total;
    }

}
