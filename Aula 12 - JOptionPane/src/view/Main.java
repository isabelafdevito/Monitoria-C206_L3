package view;

import view.InterfaceGrafica;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
            InterfaceGrafica interfaceGrafica = new InterfaceGrafica();
            interfaceGrafica.setVisible(true);


            
        });
    }
}