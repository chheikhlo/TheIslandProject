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


}
