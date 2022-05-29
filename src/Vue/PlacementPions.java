package Vue;

import javax.swing.*;

public class PlacementPions {
    JButton placer , choisir ;
    public PlacementPions() {
        JFrame placer = new JFrame();
        placer.setTitle("Joueur 1 : Placer un pion");
        placer.setSize(400, 400);
        placer.setResizable(false);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon(this.getClass().getResource("placer.png"));
        label.setIcon(image);
        label.setVisible(true);
        label.setBounds(0,0,400,400);
        JButton choisir = new JButton();
        choisir.setBounds(71, 380, 150, 40);
        choisir.setVisible(true);
        choisir.setText("Choisir le pion");
        JButton place= new JButton();
        place.setBounds(300, 380, 150, 40);
        place.setVisible(true);
        place.setText("Placer le pion");
        placer.add(choisir);
        placer.add(place);
        placer.add(label);


        placer.pack();
        placer.setVisible(true);
    }
}

