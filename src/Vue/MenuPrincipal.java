package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class MenuPrincipal {
    JButton jouer , aide ;
    GamePanel G = new GamePanel();

    public MenuPrincipal() throws IOException {
        JFrame menu = new JFrame() ;
        menu.setTitle("The Island");
        menu.setSize(1000 , 1000);
        menu.setResizable(false);
        JLabel label = new JLabel() ;
        ImageIcon image = new ImageIcon(getClass().getResource("theisland.jpg"));
        ImageIcon imageJouer = new ImageIcon(getClass().getResource("BoutonJouer.png"));
        label.setIcon(image);
        JButton jouer = new JButton("Jouer",imageJouer) ;
        jouer.setBounds(313,721,350,90);
        jouer.setVisible(true);
        jouer.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        menu.dispose();
                                        PlacementPions P = new PlacementPions();
                                        PlacerBateau B = new PlacerBateau() ;
                                        InterfaceJoueur I = new InterfaceJoueur() ;

                                        JFrame window = new JFrame();
                                        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        window.setResizable(false);
                                        window.setTitle("The island");
                                        window.add(G);
                                        window.pack();
                                        window.setLocationRelativeTo(null);
                                        window.setVisible(true);

                                        ;
                                    }
                                }
        ) ;

        menu.add(jouer) ;
        JButton aide = new JButton();
        aide.setBounds(313 ,833 ,350, 90 );
        menu.add(label);
        menu.pack();
        menu.setVisible(true);

    }


}