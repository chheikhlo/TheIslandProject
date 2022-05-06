import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Creature {
    Image baleine = null;
    Image requin = null;
    Image serpent = null;


    public  Creature() throws IOException {
        baleine = ImageIO.read(getClass().getResourceAsStream("/monstres/baleineTuile.png"));
        requin = ImageIO.read(getClass().getResourceAsStream("/monstres/requinTuile.png"));
        serpent = ImageIO.read(getClass().getResourceAsStream("/monstres/serpentTuile.png"));
    }
}
