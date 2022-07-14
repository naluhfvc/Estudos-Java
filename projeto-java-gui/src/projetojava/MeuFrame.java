package projetojava;

import javax.swing.JFrame;
import javax.swing.JButton;


public class MeuFrame extends JFrame{

    public MeuFrame() { //metodo construtor

        super ("Meu Frame"); //define titulo do frame

        JButton botao = new JButton("Clique");

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

      //  JFrame frame = new JFrame();

        /*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// permite fechar o frame
        frame.setSize(300, 300); //define tamanho do frame
        frame.setVisible(true); // define o frame como visivel */
    }

    public static void main(String[] args) {

        new MeuFrame();
    }
}
