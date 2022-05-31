package Vue;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;




public class GamePanel extends JPanel implements Runnable, MouseListener , MouseMotionListener {
    // reglage d'ecran
    final int Tules = 20; // chaque tules a 20*20px
    final int scale = 3;

    final int Tulestaill = Tules * scale; // 60px dans le plateau width
    final int TullesLarg = Tulestaill + 10; // 70px height
    final int MaxScreenCol = 14;
    final int MaxScreenRow = 11;
    final int ScreenWidth = Tulestaill * MaxScreenCol; // 960px width
    final int ScreenHeight = Tulestaill * MaxScreenRow; // 660px height
    int count = 0 ;
    Point mouse = new Point();



    TerrainManage terrainManage = new TerrainManage(this);
    Thread gameThread;
    Image Island;
    Hexagon hexagone = new Hexagon(0, 0);


    Image tuilemap[] = new Image[50];
    Image tuileTer[] = new Image[50];

    Terrain terrain = new Terrain();
    Creature creature = new Creature();
    Tuile tuile = new Tuile(terrain, creature);




    int x = 0, y = 0 , i ;
    int xHega, yHega ;



    Boolean Status = false;

    public GamePanel() throws IOException {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        hexagone.Setuphex();


        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Status = true;

                while (Status == true) {
                    System.out.println("True ? Flase : " + Status);

                    terrain.tuileForet();

                    i =+ 1;
                    x = mouse.x; y = mouse.y-20;
                    hexagone.checkxy(x,y);
                    x = hexagone.xdraw;
                    y = hexagone.ydraw - 17;




                    //tuile.getTerrain().tuileForet();
                     e.getComponent().repaint();
                    //i = +1;
                   // x = mouse.x;
                    //y = mouse.y - 20;

                    //hexagone.affichage();



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

    public void update (Graphics2D g){

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
        //hexagone.painthexagon(g2);
        g2.drawString(
                "contains(" + (mouse.x) + ", " + (mouse.y) + ") is "
                        + hexagone.contains(209, 19), 10, 20);


         //   terrain.paintAle(g2);


        terrain.paintg(g2,x,y);
        terrain.paintp(g2,x,y);

        //hexagone.affichage();
        hexagone.drawHexagon(g2);








        //tuile.getTerrain().paintg(g2, x, y);

        //creature.paintCreature(g2,tuilemap);
        //terrain.paintAle(g2,tuileTer);
          hexagone.drawHexagon(g2);

        //Pour les 5 serpents sur le plateau
        try {
            Serpent serpent = new Serpent();
            //haut gauche
            g.drawImage(serpent.imageCreature, 127, 55, 40, 50, null);
            //haut droite
            g.drawImage(serpent.imageCreature, 702, 102, 40, 50, null);
            //centre
            g.drawImage(serpent.imageCreature, 405, 298, 40, 50, null);
            //bas gauche
            g.drawImage(serpent.imageCreature, 98, 496, 40, 50, null);
            //bas droite
            g.drawImage(serpent.imageCreature, 680, 540, 40, 50, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        g2.dispose();


    }

    public void event(int x, int y) {
        if (hexagone.contains(x, y) == false) {
            System.out.println("true");

        } else System.out.println("False");
    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        System.out.println(e.getX() + "  " + e.getY());
        event(e.getX(), e.getY());

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
