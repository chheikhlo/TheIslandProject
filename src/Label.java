import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    TerrainManage terrainManage;
    public Label() {
         this.setPreferredSize(new Dimension(60,70));
         this.setBackground(Color.black);
    }

    @Override
    public void paintComponents(Graphics g1) {
        super.paintComponents(g1);
        Graphics2D g2 = (Graphics2D) g1;
        terrainManage.draw(g2);
        System.out.print("ZDHAZDFHZDFHAZDHAZEDH");
        g2.dispose();
    }
}
