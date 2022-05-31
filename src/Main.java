import Vue.MenuPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Main {


    public static void main (String args[]) throws IOException {


        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The island");

        GamePanel gamePanel = new GamePanel();
        //MenuPrincipal menuPrincipal = new MenuPrincipal();

         window.add(gamePanel);
        window.pack();




        window.setLocationRelativeTo(null);
        window.setVisible(true);



    }


}
