package Vue;



import javax.swing.*;

public class PlacerBateau {
    JButton placer;

    public PlacerBateau() {
        JFrame placer = new JFrame();
        placer.setTitle("Joueur 1 : Placer un bateau ");
        placer.setSize(400, 400);
        placer.setResizable(false);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon(this.getClass().getResource("placerBateau.png"));
        label.setIcon(image);
        label.setVisible(true);
        placer.setVisible(true);
        JButton place = new JButton();
        place.setBounds(125 ,300 ,150, 40 );
        place.setText("Placer bateau");
        place.setVisible(true);
        placer.add(place);
        placer.add(label);
        placer.pack();

    }
}
