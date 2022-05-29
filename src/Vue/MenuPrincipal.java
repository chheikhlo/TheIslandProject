package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrincipal implements ActionListener {
    JButton jouer , quitter , aide;

    public MenuPrincipal() {
        JFrame menu = new JFrame() ;

        menu.setSize(1000 , 1000);
        menu.setResizable(false);
        JLabel label = new JLabel() ;
        ImageIcon image = new ImageIcon(getClass().getResource("theisland.jpg"));
        label.setIcon(image);
        menu.add(label) ;
        JButton jouer = new JButton() ;
        jouer.setBounds(313,721,350,90);
        jouer.addActionListener(this);
        JButton quitter = new JButton();
        quitter.setBounds(313 ,833 ,350, 90 );
        quitter.addActionListener(this);
        JButton aide = new JButton();
        aide.setBounds(836,915,155,70);

        //aide.addActionListener();

       // aide.addActionListener();


        menu.pack();
        menu.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jouer){
            //accéder à l'écran du Jeu
        }
        if(e.getSource()==quitter){
            System.exit(0);
        }
        if(e.getSource()==aide){
            //ouvrir fichier pdf des régles du jeu

        }
    }
}
