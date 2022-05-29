import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Terrain {

    Image imageTerrain = null;
    Image Foret = null  ;
    Image Montagne = null;
    Image Plage  = null;
    Image Island = null ;
    Image map = null;



    public Terrain() {
        try {
            Montagne = ImageIO.read(getClass().getResourceAsStream("/terrains/montagneTuile.png"));
            Plage = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));
            Foret = ImageIO.read(getClass().getResourceAsStream("/terrains/foretTuile.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void Maptuile(){
        Image tabmap[] = {Montagne,Plage,Foret};
        int min = 0; int max = 3;
        Random ran = new Random();
        int a = ran.nextInt(max + min) + min;
        map = tabmap[a];

    }
    public void tuileForet () {
        try {
            Foret = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void  paintg( Graphics2D g,int x,int y ) {

        g.drawImage(Foret,x,y,59,62,null);
        //g.drawImage(Montagne,x,y,59,62,null);



    }
}
