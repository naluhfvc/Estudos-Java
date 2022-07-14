package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layouts extends JFrame{
    public Layouts() {
        super("Meu layout");

        getContentPane().add (new JButton("botao centralizado"));
        getContentPane().add (new JButton ("botaao centralizado 2")); //essa linha sai como resultado

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts();
    }
}
