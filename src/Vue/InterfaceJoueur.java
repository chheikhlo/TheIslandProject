package Vue;

import javax.swing.*;


public class InterfaceJoueur {
    JButton jouerTuile, retirerTuile , deplacer , lancerDe ;

    public InterfaceJoueur() {
        JFrame inter = new JFrame();
        inter.setTitle("Joueur 1");
        inter.setSize(500, 500);
        inter.setResizable(false);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon(getClass().getResource("interface.png"));
        label.setIcon(image);
        inter.add(label);
        inter.pack();
        inter.setVisible(true);
        JButton jouerTuile = new JButton() ;
        JButton retirerTuile= new JButton() ;
        JButton deplacer= new JButton() ;
        JButton lancerDe= new JButton() ;
        jouerTuile.setBounds(50, 400, 175, 50);
        jouerTuile.setVisible(true);
        jouerTuile.setText("Jouer tuile");
        inter.add(jouerTuile);
        retirerTuile.setBounds(275, 400, 175, 50);
        retirerTuile.setVisible(true);
        retirerTuile.setText("Retirer tuile");
        inter.add(retirerTuile);
        deplacer.setBounds(275, 300, 175 , 50);
        deplacer.setVisible(true);
        deplacer.setText("Déplacer pion/bateau");
        inter.add(deplacer);
        lancerDe.setBounds(50, 300, 175, 50);
        lancerDe.setVisible(true);
        lancerDe.setText("Lancer le dé");
        inter.add(lancerDe);
        inter.add(label);
        inter.pack();
        inter.setVisible(true);

    }
}
