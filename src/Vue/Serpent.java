package Vue;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Serpent extends Creature{


    public Serpent() throws IOException {
        imageCreature = ImageIO.read(getClass().getResourceAsStream("/monstres/serpentTuile.png"));
    }


    /*
    public void detruire(Joueur joueur, Set<Bateau> listBateau, Bateau bateau){
        listBateau.remove(bateau);

        for(int i=0;i<listBateau.size();i++){
            if(joueur.getPionsExp().equals(bateau)){

            }
        }

    }
    */

}
