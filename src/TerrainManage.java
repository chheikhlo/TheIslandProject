import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TerrainManage {
    Polygon p1 = new Polygon();

    Terrain terrain ;
    GamePanel gp ;

    int x,y;

    public TerrainManage(GamePanel gp){
        this.gp = gp;
        terrain = new Terrain();
        getTerrain();
    }

    public void draw(Graphics2D g  ){
       // System.out.print("hello");
        // System.out.print("status is "+gp.Status);
     //  if (gp.Status == true) {
       //     System.out.print("x = " + x);
            g.drawImage(terrain.Plage, 30, 50, 45, 55, null);

        //}

        int[] xp  = {118,148,178,178,148,118};
        int[] yp  = {68,51,67,100,115,97};

         g.drawPolygon(xp,yp,6);



    }
    public void getTerrain(){
        try {

            terrain.Plage = ImageIO.read(getClass().getResourceAsStream("/terrains/foretTuile.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
