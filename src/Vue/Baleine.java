package Vue;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Baleine extends Creature {


    public Baleine() throws IOException {
        imageCreature = ImageIO.read(getClass().getResourceAsStream("/monstres/baleineTuile.png"));
    }

}