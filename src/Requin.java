import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Requin extends Creature{

    public Requin() throws IOException {
        imageCreature = ImageIO.read(getClass().getResourceAsStream("/monstres/requinTuile.png"));
    }

}
