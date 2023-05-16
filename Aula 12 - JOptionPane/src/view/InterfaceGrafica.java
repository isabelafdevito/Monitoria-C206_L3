package view;

import javax.swing.*;
import java.awt.*;

/*
O JOptionPane é uma classe da biblioteca Swing do Java que fornece caixas de diálogo (dialogs) pré-construídas
para exibir mensagens, solicitar entrada do usuário e exibir opções de seleção. Essa classe facilita a interação
com o usuário por meio de uma interface gráfica.
 */

/*
A classe JFrame é uma classe da biblioteca Swing do Java que representa uma janela (window) em uma interface gráfica.
Ela fornece os recursos básicos necessários para criar uma janela em um aplicativo desktop.
O JFrame é uma subclasse da classe java.awt.Frame e fornece funcionalidades adicionais específicas do Swing,
como suporte a componentes gráficos (botões, campos de texto, etc.) e recursos avançados de gerenciamento de layout.
 */

public class InterfaceGrafica extends JFrame {
    private JTextField campoNome; // cria um text field para inserir os dados de nome
    private JTextField campoSalario; // cria um text field para inserir os dados de salário
    private JTextField campoCPF; // cria um text field para inserir os dados de CPF

    // chama o construtor da classe, para a interface ser gerada toda vez que a gente roda o código
    public InterfaceGrafica() {
        // Configurações da janela do frame
        setTitle("Exemplo de Interface Gráfica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seta que fechara quando apertamos o botao de close
        setSize(300, 200); // setando a altura e a largura da janela
        setLocationRelativeTo(null); // se quiser colocar a janela em um local especifico da tela

        // Criação dos componentes

        // cria um componente do tipo label chamado nome
        JLabel labelNome = new JLabel("Nome:");
        // a variavel campoNome recebe o valor colocado no campo de texto de tamanho 20
        campoNome = new JTextField(20);

        JLabel labelSalario = new JLabel("Salário:");
        campoSalario = new JTextField(20);

        JLabel labelCPF = new JLabel("CPF:");
        campoCPF = new JTextField(14);

        // cria um componente do tipo botão
        JButton buttonEnviar = new JButton("Enviar");

        // ao realizar a ação de clicar nele, ele pega os valores das variaveis
        // em cada campo de texto e retorna no pop up "show message dialog"
        buttonEnviar.addActionListener(e -> {
            String nome = campoNome.getText();
            String salario = campoSalario.getText();
            String cpf = campoCPF.getText();

            // Realizar ações com os dados inseridos nos campos
            // Por exemplo, exibir em um JOptionPane
            String mensagem = "Nome: " + nome + "\nSalário: " + salario + "\nCPF: " + cpf;
            JOptionPane.showMessageDialog(this, mensagem);
        });

        // Configuração do layout
        setLayout(new FlowLayout());
        // adicionando os componentes criados na janela:
        add(labelNome);
        add(campoNome);
        add(labelSalario);
        add(campoSalario);
        add(labelCPF);
        add(campoCPF);
        add(buttonEnviar);
    }

}








