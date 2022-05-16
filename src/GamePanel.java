import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// add mouse motion listener
public class GamePanel extends JPanel implements  Runnable, MouseListener , MouseMotionListener {
    // reglage d'ecran
    final int Tules = 20; // chaque tules a 20*20px
    final int scale = 3;

    final int Tulestaill = Tules * scale; // 60px dans le plateau width
    final int TullesLarg = Tulestaill + 10; // 70px height
    final int MaxScreenCol = 14;
    final int MaxScreenRow = 11;
    final int ScreenWidth = Tulestaill * MaxScreenCol; // 960px width
    final int ScreenHeight = Tulestaill * MaxScreenRow; // 660px height

    TerrainManage terrainManage = new TerrainManage(this);
    Thread gameThread;
    Image Island;
    Hexagone hexagone = new Hexagone(0,0);


    int x, y;
    Boolean Status = false;

    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addMouseMotionListener(this);

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Status = true;
                terrainManage.x = e.getX();
                terrainManage.y = e.getY();
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

    }

    public void startGameThread() {
        gameThread = new Thread();
        gameThread.start();

    }




    @Override
    public void run() {

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //int xi = 118;
        //int yi = 261;

       //Hexagone hexagone = new Hexagone(xi, yi);
        super.paintComponent(g2);
        try {
            Island = ImageIO.read(getClass().getResourceAsStream("/bgisland.jpeg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //int[] xp  = {30,40,50,40,30,20};
        //int[] yp  = {50,50,40,20,20,40};
        g2.setColor(Color.RED);
        //g2.drawPolygon(xp,yp,xp.length);
        g2.drawImage(Island, 0, 0, ScreenWidth, ScreenHeight, null);
        hexagone.painthexagon(g2);


        //g2.drawPolygon(hexagone);
        //hexagone.painthexagon(g2,x,y);
        //terrainManage.draw(g2);
        //hexagone.drawHexagon(g2, 118, 261);

        g2.dispose();





    }

    public  void event ( int x , int y) {
        if(hexagone.contains(x,y) == false   ){
            System.out.println("true");

        }else System.out.println("False");
    }


    @Override
    public void mouseClicked(MouseEvent e) {

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

    @Override
    public void mouseDragged(MouseEvent e) {
           x = e.getX();
          y = e.getY();
          System.out.println("YESSS");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        System.out.println(e.getX()+"  "+e.getY() );
        event(e.getX(),e.getY());

    }
}


