import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Baleine extends Creature{

    private Image baleine = null;

    public Baleine() throws IOException {
        baleine = ImageIO.read(getClass().getResourceAsStream("/monstres/baleineTuile.png"));
    }

    public Image getBaleine() {
        return baleine;
    }

    public void setBaleine(Image baleine) {
        this.baleine = baleine;
    }
}
