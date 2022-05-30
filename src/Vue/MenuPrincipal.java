package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class MenuPrincipal {
    JButton jouer , aide ;
    G

    public MenuPrincipal()  {
        JFrame menu = new JFrame() ;
        menu.setTitle("The Island");
        menu.setSize(600 , 600);
        menu.setResizable(false);
        JLabel label = new JLabel() ;
        ImageIcon image = new ImageIcon(getClass().getResource("theisland.png"));
        ImageIcon imageJouer = new ImageIcon(getClass().getResource("BJouer.png"));
        ImageIcon imageAide = new ImageIcon(getClass().getResource("Baide.png"));
        label.setIcon(image);
        JButton jouer = new JButton("Jouer",imageJouer) ;
        jouer.setBounds(176,400,248,78);
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
        JButton aide = new JButton("aide",imageAide);
        aide.setBounds(176,500,248,78);
        aide.setVisible(true);
        aide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File("regle.pdf");
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {

                    }

                }
            }
        });
        menu.add(aide) ;
        menu.add(label);
        menu.pack();
        menu.setVisible(true);

    }


}

