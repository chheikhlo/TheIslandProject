import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {


    public static void main (String args[]){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The island");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        window.addMouseListener(new MouseListener() {



            @Override
            public void mouseClicked(MouseEvent e) {
                int x,y;
                x = MouseInfo.getPointerInfo().getLocation().x -  window.getX();
                y = MouseInfo.getPointerInfo().getLocation().y - window.getY();
                System.out.print("X =  "+x+"    Y = " +y+ "   \r");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        window.setLocationRelativeTo(null);
        window.setVisible(true);



    }


}
