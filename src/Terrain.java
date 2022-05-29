import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Terrain {

    Image Foret = null  ;
    Image Montagne = null;
    Image Plage  = null;
    Image Island = null ;
    Image map = null;
    int count = 0;
    int xHega; int yHega;




    public Terrain() {
        try {
            Montagne = ImageIO.read(getClass().getResourceAsStream("/terrains/montagne.png"));
            Plage = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));
            Foret = ImageIO.read(getClass().getResourceAsStream("/terrains/foret.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void paintAle(Graphics2D g2){

        xHega = 303;
        yHega = 146;
        for (int i = 0; i < 4; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);

        }
        xHega = 272;
        yHega = 195;
        for (int i = 0; i < 5; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);
        }
        xHega = 181;
        yHega = 245;
        for (int i = 0; i < 8; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
        }
        xHega = 210;
        yHega = 294;
        for (int i = 0; i < 7; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
        }
        xHega = 181;
        yHega = 343;
        for (int i = 0; i < 8; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
        }
        xHega = 272;
        yHega = 391;
        for (int i = 0; i < 5; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
        }
        xHega = 303;
        yHega = 440;
        for (int i = 0; i < 4; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
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
