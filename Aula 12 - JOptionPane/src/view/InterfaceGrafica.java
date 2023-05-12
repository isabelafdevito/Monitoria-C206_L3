package view;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame {
    private JTextField campoNome;
    private JTextField campoSalario;
    private JTextField campoCPF;

    public InterfaceGrafica() {
        // Configurações da janela
        setTitle("Exemplo de Interface Gráfica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

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
        add(labelNome);
        add(campoNome);
        add(labelSalario);
        add(campoSalario);
        add(labelCPF);
        add(campoCPF);
        add(buttonEnviar);
    }

}








