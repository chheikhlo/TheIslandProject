import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;



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
    Point mouse = new Point();





    TerrainManage terrainManage = new TerrainManage(this);
    Thread gameThread;
    Image Island;
    Hexagon hexagone = new Hexagon(0,0);
    Terrain terrain = new Terrain();


    int x = 0, y = 0 , i ;
    int xHega, yHega ;
    Boolean Status = false;

    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Status = true;

                while ( Status == true) {
                    System.out.println("True ? Flase : " + Status);
                    terrain.tuileForet();
                   // e.getComponent().repaint();
                    i =+ 1;
                    x = e.getX(); y = e.getY();
                    hexagone.checkxy(x,y);
                    x = hexagone.xdraw;
                    y = hexagone.ydraw - 17;
                    e.getComponent().repaint();
                    Status = false;
                }
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
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                mouse = e.getPoint();
                //e.getComponent().repaint();

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

        super.paintComponent(g2);
        try {
            Island = ImageIO.read(getClass().getResourceAsStream("/bgisland.jpeg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        g2.setColor(Color.darkGray);


        //int[] xp  = {30,40,50,40,30,20};
        //int[] yp  = {50,50,40,20,20,40};
        g2.setColor(Color.blue);
        //g2.drawPolygon(xp,yp,xp.length);

        g2.drawImage(Island, 0, 0, ScreenWidth, ScreenHeight, null);

        g2.drawString(
                "contains(" + (mouse.x) + ", " + (mouse.y) + ") is "
                        + hexagone.contains(209, 19), 10, 20);

        terrain.paintg(g2,x,y);
        xHega = 303; yHega = 146;
        for(int i = 0;i<4;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i, yHega, 58, 67, null);

        }
        xHega = 272; yHega = 195;
        for(int i = 0 ; i<5;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i, yHega, 58, 67, null);
        }
        xHega = 181;yHega=245;
        for(int i = 0 ; i<8;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i+1, yHega, 58, 66, null);
        }
        xHega = 210;yHega=294;
        for(int i = 0 ; i<7;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i+1, yHega, 58, 66, null);
        }
        xHega = 181;yHega=343;
        for(int i = 0 ; i<8;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i+1, yHega, 58, 66, null);
        }
        xHega = 272;yHega=391;
        for(int i = 0 ; i<5;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i+1, yHega, 58, 66, null);
        }
        xHega = 303;yHega=440;
        for(int i = 0 ; i<4;i++) {
            terrain.Maptuile();
            g2.drawImage(terrain.map, xHega+60*i+1, yHega, 58, 66, null);
        }

        hexagone.drawHexagon(g2);



        g2.dispose();
        hexagone.Setuphex();
        hexagone.affichage();



    }

    public  void event ( int x , int y) {
        if(hexagone.contains(x,y) == false   ){
            System.out.println("true");

        }else System.out.println("False");
    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        System.out.println(e.getX()+"  "+e.getY() );
        event(e.getX(),e.getY());

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
}