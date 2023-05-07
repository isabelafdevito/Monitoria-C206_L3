package view;

import controller.Arquivo;
import model.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Funcionario f = new Funcionario();
        boolean flag =  true;

        while (flag)
        {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Ler Arquivo");
            System.out.println("3 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("Digite o nome do funcionario");
                    f.nome = sc.nextLine();
                    System.out.println("Digite a idade do funcionario: ");
                    f.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite seu CPF: ");
                    f.cpf = sc.nextLine();
                    arq.escrever(f);
                    System.out.println("model.Funcionario adicionado!");
                    break;

                case 2:
                    ArrayList<Funcionario> funcs = arq.ler();
                    for (int i=0; i< funcs.size(); i++)
                    {
                        System.out.println("Nome: " + funcs.get(i).nome);
                        System.out.println("Idade: " + funcs.get(i).idade);
                        System.out.println("CPF: " + funcs.get(i).cpf);
                    }
                    break;

                case 3:
                    flag = false;
                    System.out.println("Você saiu!");
                    break;

                default:
                    System.out.println("opção inválida!");
                    break;
            }
        }


    }

}

