package Vue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrincipal {
    JButton jouer , aide ;

    public MenuPrincipal()  {
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
                                       System.out.println("ok");
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