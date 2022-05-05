import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GamePanel extends JPanel implements  Runnable  {
     // reglage d'ecran
     final int  Tules =  20; // chaque tules a 20*20px
     final int scale = 3;

     final int Tulestaill = Tules*scale; // 60*60px dans le plateau
     final int MaxScreenCol = 14;
     final int MaxScreenRow = 11;
     final int ScreenWidth = Tulestaill*MaxScreenCol; // 960px width
     final int ScreenHeight = Tulestaill*MaxScreenRow; // 660px height

     Thread gameThread;
     Image img = null;
     Image img2 = null;
    public GamePanel() {
         this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
         this.setBackground(Color.black);
         this.setDoubleBuffered(true);


    }
    public void startGameThread() {
        gameThread = new Thread();
        gameThread.start();
    }
    @Override
    public void run() {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            img  = ImageIO.read(getClass().getResourceAsStream("bgisland.jpeg"));
            img2 = ImageIO.read(getClass().getResourceAsStream("terrains/foretTuile.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        g.drawImage(img,0,0,null);

        g.drawImage(img2,121,55,58,69,null);
        g.dispose();
    }
}
