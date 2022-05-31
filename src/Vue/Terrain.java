package Vue;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Terrain {

    Image imageTerrain = null;
    Image tabelImag[] = new Image[40];
    Image Foret = null  ;
    Image perso = null;
    Image Montagne = null;
    Image Plage  = null;
    Image Island = null ;
    Image map = null;
    Image bateau = null;
    int count = 0;
    int xHega; int yHega;






    public Terrain() {
        try {
            Montagne = ImageIO.read(getClass().getResourceAsStream("/terrains/montagneTuile.png"));
            Plage = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));
            Foret = ImageIO.read(getClass().getResourceAsStream("/terrains/foretTuile.png"));
            bateau = ImageIO.read(getClass().getResourceAsStream("bateau.png"));
            perso = ImageIO.read(getClass().getResourceAsStream("boy_down_1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


     public void paintAle(Graphics2D g2, Image tuileTer[]){

        xHega = 303;
        yHega = 146;
         int r = 0 ;

        for (int i = 0; i < 4; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);
            tuileTer[r] = map;
            r++;


        }
        xHega = 272;
        yHega = 195;
        for (int i = 0; i < 5; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);
            tuileTer[r] = map;
            r++;
        }
        xHega = 181;
        yHega = 245;
        for (int i = 0; i < 8; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuileTer[r] = map;
            r++;
        }
        xHega = 210;
        yHega = 294;
        for (int i = 0; i < 7; i++) {
            Maptuile();
            if( i == 3){
                map = null;
            }
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuileTer[r] = map;
            r++;
        }
        xHega = 181;
        yHega = 343;
        for (int i = 0; i < 8; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuileTer[r] = map;
            r++;
        }
        xHega = 272;
        yHega = 391;
        for (int i = 0; i < 5; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuileTer[r] = map;
            r++;
        }
        xHega = 303;
        yHega = 440;
        for (int i = 0; i < 4; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuileTer[r] = map;
            r++;
        }
         g2.drawImage(tuileTer[0], 0,60,58,68,null);

     }


    public void Maptuile(){

        Image tabmap[] = {Montagne,Plage,Foret};
        int min = 0; int max = 3;
        Random ran = new Random();
        for(int i = 0;i<40;i++) {
            int a = ran.nextInt(max + min) + min;
            map = tabmap[a];
            tabelImag[i] = tabmap[a];
        }




    }
    public void tuileForet () {
        try {
            Foret = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void  paintg( Graphics2D g,int x,int y ) {

        g.drawImage(bateau,x+10,y+13,39,40,null);
        //g.drawImage(Montagne,x,y,59,62,null);



    }
    public  void paintp(Graphics2D g ,int x ,int y ){
        g.drawImage(perso,x+12,y+12,20,19,null);
        g.drawImage(perso,x+24,y+17,20,19,null);
        g.drawImage(perso,x+36,y+22,20,19,null);
    }
}
