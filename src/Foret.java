import javax.imageio.ImageIO;
import java.io.IOException;

public class Foret extends Terrain{

    public Foret() throws IOException {
        imageTerrain = ImageIO.read(getClass().getResourceAsStream("/terrains/foret.png"));
    }
}
