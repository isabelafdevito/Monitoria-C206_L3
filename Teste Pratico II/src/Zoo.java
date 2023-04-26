public class Zoo {

    private String nome;
    private String endereco;
    private long cnpj;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    Animal[] animais = new Animal[5];

    public void mostraInfo(){
        System.out.println("Nome do zoo: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("cnpj: " +cnpj);
        System.out.println("Quantidade de animais: " + Animal.qntAnimais);
        System.out.println("Informacoes de animais: ");
        for(int i=0;i<animais.length;i++){
            if(animais[i]!=null){
                if(animais[i] instanceof Gato) {
                    animais[i].mostraInfo();
                    animais[i].barulho();
                    ((Gato) animais[i]).correr();
                    ((Gato) animais[i]).comendo();
                } else if(animais[i] instanceof Coruja) {
                    animais[i].mostraInfo();
                    animais[i].barulho();
                    ((Coruja) animais[i]).voar();
                    ((Coruja) animais[i]).comendo();
                } else if(animais[i] instanceof Leao) {
                    animais[i].mostraInfo();
                    animais[i].barulho();
                    ((Leao) animais[i]).dormir();
                }
            }
        }
    }

}
