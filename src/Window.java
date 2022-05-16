import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Window implements MouseMotionListener {
    JFrame window = new JFrame();


    GamePanel gamePanel = new GamePanel();
    TerrainManage terrainManage ;
    int x,y;
    Boolean Status = false;
    public Window() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The island");


        addPanel();
    }
     public void addPanel() {
         window.add(gamePanel);



         window.pack();
         window.setLocationRelativeTo(null);
         window.setVisible(true);
         while (true) {
             x = MouseInfo.getPointerInfo().getLocation().x - window.getX() - 20;
             y = MouseInfo.getPointerInfo().getLocation().y - window.getY() - 30;
         }
         }






     public int returnX()
     {
         return x;
     }
     public int returnY(){
        return y;
     }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getX()+"    "+e.getY());
         }
}
