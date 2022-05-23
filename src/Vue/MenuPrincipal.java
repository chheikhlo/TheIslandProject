package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrincipal implements ActionListener {
    JButton jouer , quitter ;

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

        menu.pack();
        menu.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jouer){
            //Jeu
        }
        if(e.getSource()==quitter){
            System.exit(0);
        }
    }
}
