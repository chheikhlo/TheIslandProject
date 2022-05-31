package Vue;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Plage extends Terrain {

    public Plage() throws IOException {
        imageTerrain = ImageIO.read(getClass().getResourceAsStream("/terrains/plage.png"));
    }

}
