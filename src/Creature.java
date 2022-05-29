import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class Creature {

    Image imageCreature = null;
    //Tuile créatures rouge
    Image requinTuileR = null,  enleveRequinTuile = null, baleineTuileR = null, bateauDeplaceTuile = null, dauphinAideTuile = null, enleveBaleineTuile = null, serpentDeMerTuile = null;

    //Tuiles créatures vert
    Image baleineTuileV = null, bateauTuile = null, eruptionVolcaniqueTuile = null, requinTuileV = null, tourbillonTuile = null;


    Image map = null;
<<<<<<< HEAD
    int r = 0;
=======
>>>>>>> 85badd8dcb45100f23e26f7e9c77152d7e3b73d9
    int xHega; int yHega;

    Image tuilemap[]  = new Image[50];

    public  Creature() throws IOException {
        try {
            //Tuile créatures rouge
            requinTuileR = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/requinTuile.png"));
            enleveRequinTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/enleveRequinTuile.png"));
            baleineTuileR = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/baleineTuile.png"));
            bateauDeplaceTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/bateauDeplaceTuile.png"));
            dauphinAideTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/dauphinAideTuile.png"));
            enleveBaleineTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/enleveBaleineTuile.png"));
            serpentDeMerTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_rouge/serpentDeMerTuile.png"));
            //Tuiles créatures vert
            baleineTuileV = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_vert/baleineTuile.png"));
            bateauTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_vert/bateauTuile.png"));
            eruptionVolcaniqueTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_vert/eruptionVolcaniqueTuile.png"));
            requinTuileV = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_vert/requinTuile.png"));
            tourbillonTuile = ImageIO.read(getClass().getResourceAsStream("/tuiles/tuiles_vert/tourbillonTuile.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void Maptuile(){
        Image tabmap[] = {requinTuileR,enleveRequinTuile,baleineTuileR,bateauDeplaceTuile,dauphinAideTuile,enleveBaleineTuile,serpentDeMerTuile,baleineTuileV,bateauTuile,eruptionVolcaniqueTuile,requinTuileV,tourbillonTuile};
        int min = 0; int max = 12;
        Random ran = new Random();
        int a = ran.nextInt(max + min) + min;
        map = tabmap[a];

    }

<<<<<<< HEAD
    public void paintCreature(Graphics g2 ){
        xHega = 303;
        yHega = 146;
=======
    public void paintCreature(Graphics g2, Image tuilemap[]){
        xHega = 303;
        yHega = 146;
        int r = 0;
>>>>>>> 85badd8dcb45100f23e26f7e9c77152d7e3b73d9

        for (int i = 0; i < 4; i++) {
            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);
            tuilemap[r] = map ;
<<<<<<< HEAD
            r ++;
=======
            r++;
>>>>>>> 85badd8dcb45100f23e26f7e9c77152d7e3b73d9

        }
        xHega = 272;
        yHega = 195;
        for (int i = 0; i < 5; i++) {

            Maptuile();
            g2.drawImage(map, xHega + 60 * i, yHega, 58, 67, null);
            tuilemap[r] = map ;
            r ++;


        }
        xHega = 181;
        yHega = 245;
        for (int i = 0; i < 8; i++) {

            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuilemap[r] = map ;
            r ++;

        }
        //****************************************************
        // Pour La ligne du milieu
        xHega = 210;
        yHega = 294;
        for (int i = 0; i < 7; i++) {

            Maptuile();
            if (i == 3){
                //Après saut du centre pour le serpent
                map = null ;
            }
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuilemap[r] = map ;
            r ++;
        }


        //***************************************************
        xHega = 181;
        yHega = 343;
        for (int i = 0; i < 8; i++) {

            Maptuile();

            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuilemap[r] = map ;
            r ++;
        }
        xHega = 272;
        yHega = 391;
        for (int i = 0; i < 5; i++) {

            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuilemap[r] = map ;
            r ++;
        }
        xHega = 303;
        yHega = 440;
        for (int i = 0; i < 4; i++) {

            Maptuile();
            g2.drawImage(map, xHega + 60 * i + 1, yHega, 58, 66, null);
            tuilemap[r] = map ;
<<<<<<< HEAD
            r ++;
=======
            r++;
>>>>>>> 85badd8dcb45100f23e26f7e9c77152d7e3b73d9
        }
        g2.drawImage(tuilemap[0], 0,0,58,68,null);
           //
    }




}
