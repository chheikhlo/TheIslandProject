import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GamePanel extends JPanel implements  Runnable  {
     // reglage d'ecran
     final int  Tules =  20; // chaque tules a 20*20px
     final int scale = 3;
     final int Tulestaill = Tules*scale; // 60px dans le plateau width
     final int TullesLarg = Tulestaill +10; // 70px height
     final int MaxScreenCol = 14;
     final int MaxScreenRow = 11;
     final int ScreenWidth = Tulestaill*MaxScreenCol; // 960px width
     final int ScreenHeight = Tulestaill*MaxScreenRow; // 660px height


     Thread gameThread;
     Image img = null;
     int x,y;
     TerrainManage terrainManage = new TerrainManage(this);


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

        Graphics2D g2 = (Graphics2D) g;
        terrainManage.draw(g2);
        g2.dispose();

    }
}
