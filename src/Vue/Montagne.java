package Vue;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Montagne extends Terrain{

    public Montagne() throws IOException {
        imageTerrain = ImageIO.read(getClass().getResourceAsStream("/terrains/montagneTuile.png"));
    }

}
