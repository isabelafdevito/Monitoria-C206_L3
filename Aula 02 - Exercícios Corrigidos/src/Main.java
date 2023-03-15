import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //EXERCICIO 1:
        double peso; //var para o peso
        double altura; //var para a altura
        double IMC;

        Scanner sc = new Scanner(System.in); //inicializando a entrada de dados

        // entrando com o peso da pessoa:
        System.out.println("Insira o peso: ");
        peso = sc.nextDouble();

        //entrando com a altura da pessoa:
        System.out.println("Insira a altura: ");
        altura = sc.nextDouble();

        //calculando o IMC:
        IMC = peso/Math.pow(altura,2);

        if(IMC<=18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (IMC>=18.6 && IMC <=24.9){
            System.out.println("Peso ideal (parabéns)");
        }
        else if(IMC>=25.0 && IMC <=29.9) {
            System.out.println("Levemnte acima do peso");
        }
        else if(IMC>=30.0 && IMC<=34.9) {
            System.out.println("Obesidade grau I");
        }
        else if(IMC>=35.0 && IMC<=39.9) {
            System.out.println("Obesidade grau II");
        }
        else{
            System.out.println("Obesidade III(Mórbida)");
        }

        //EXERCICIO 2:
        float num1;
        float num2;
        int var_aux;

        System.out.println("Insira o primeiro numero: ");
        num1 = sc.nextFloat();

        System.out.println("Insira o segundo numero: ");
        num2 = sc.nextFloat();

        System.out.println("MENU:");
        System.out.println("Digite 1 - para realizar uma soma");
        System.out.println("Digite 2 - para realizar uma subtração");
        System.out.println("Digite 3 - para realizar uma multiplicação");
        System.out.println("Digite 4 - para realizar uma divisão");
        System.out.println("Digite 5 - para realizar uma exponencial");
        var_aux= sc.nextInt();


        switch (var_aux) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            case 5:
                System.out.println(Math.pow(num1,num2));
                break;
            default:
                System.out.println("Esse numero não corresponde a nenhuma opção");
                break; 
        }

        //EXERCICIO 3:
        int senha = 2002;
        int tentativa;

        System.out.println("Digite a senha: ");
        tentativa = sc.nextInt();
        while(tentativa!=senha) {

            System.out.println("Senha Inválida");
            tentativa = sc.nextInt();

        }

        System.out.println("Acesso Permitido");
        sc.close();


    }
}