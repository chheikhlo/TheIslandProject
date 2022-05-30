package Vue;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Requin extends Creature{

    public Requin() throws IOException {
        imageCreature = ImageIO.read(getClass().getResourceAsStream("/monstres/requinTuile.png"));
    }

}
