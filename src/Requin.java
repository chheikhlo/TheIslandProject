import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Requin extends Creature{

    private Image requin = null;
    public Requin() throws IOException {
        requin = ImageIO.read(getClass().getResourceAsStream("/monstres/requinTuile.png"));
    }

    public Image getRequin() {
        return requin;
    }

    public void setRequin(Image requin) {
        this.requin = requin;
    }
}
