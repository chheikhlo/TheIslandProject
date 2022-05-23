import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Serpent extends Creature{

    private Image serpent = null;
    public Serpent() throws IOException {
        serpent = ImageIO.read(getClass().getResourceAsStream("/monstres/serpentTuile.png"));
    }

    public Image getSerpent() {
        return serpent;
    }

    public void setSerpent(Image serpent) {
        this.serpent = serpent;
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
