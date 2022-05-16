import javax.swing.*;
import java.awt.*;

public class GamePanel2  extends JPanel {
    TerrainManage terrainManage;
    public GamePanel2()   {
        this.setPreferredSize(new Dimension(60,70));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);


    }


    public  void drawTuile ( Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        terrainManage.draw(g2);
        g2.dispose();


    }
}
