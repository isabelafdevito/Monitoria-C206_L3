public class Main {
    public static void main(String[] args) {

        /* nao faz sentido a nivel de código criar um objeto do tipo funcionario
        pois é muito genérico e não irá englobar as váriaveis especificas de cada
        tipo de funcionario, porém queremos ter um controle de quantos funcionarios possuem
        criados na nossa aplicacao, entao pra isso podemos usar um array de funcionarios
        mas utilizando do conceito de polimorfismo, e atribuindo esses arrays a cada tipo
        especifico de funcionario:
         */
         //Funcionario func = new Funcionario();

        Funcionario[] func = new Funcionario[5];

        /*criando objetos de cada tipo de funcionario
        e atribuindo um espaço da array pra eles:
         */

        Engenheiro eng = new Engenheiro();
        eng.setNome("Isabela");
        eng.setIdade(19);
        eng.setSalario(2000);
        eng.setRamo("Telecomunicacoes");

        func[0] = eng;

        Professor prof = new Professor();
        prof.setNome("Chris");
        prof.setIdade(30);
        prof.setSalario(5000);
        prof.setMateria("POO");

        func[1] = prof;

        Arquiteto arq = new Arquiteto();
        arq.setNome("Lucas");
        arq.setIdade(25);
        arq.setSalario(3000);
        arq.setEspecialidade("Civil");

        func[2] = arq;

        System.out.println("Quantidade de funcionarios: " + Funcionario.getQntFuncionarios());

        /*
        Dando sout nos atributos de cada um, usando do metodo instanceof para saber o tipo do
        funcionario ao percorrer o array:
         */

        for(int i=0;i< func.length;i++){
            if(func[i] != null){
                if(func[i] instanceof Engenheiro){
                    System.out.println("Informacoes do engenheiro: ");
                    func[i].mostraInfo();
                    func[i].executaAcao();
                    System.out.println("Salario antes do bonus: " + func[i].salarioBonus());
                    ((Engenheiro) func[i]).setBonus(2000);
                    System.out.println("Salario depois do bonus: " + func[i].salarioBonus());
                    System.out.println();
                }
                else if (func[i] instanceof Professor){
                    System.out.println("Informacoes do professor: ");
                    func[i].mostraInfo();
                    func[i].executaAcao();
                    System.out.println("Salario: " + func[i].salarioBonus());
                    ((Professor) func[i]).corrigirProvas();
                    System.out.println();
                }
                else if(func[i] instanceof Arquiteto){
                    System.out.println("Informacoes de arquiteto: ");
                    func[i].mostraInfo();
                    func[i].executaAcao();
                    System.out.println("Salario: " + func[i].salarioBonus());
                    System.out.println();
                }
            }
        }


    }
}