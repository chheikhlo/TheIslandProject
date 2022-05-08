import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Creature {
    private Image baleine = null;
    private Image requin = null;
    private Image serpent = null;


    public  Creature() throws IOException {
        baleine = ImageIO.read(getClass().getResourceAsStream("/monstres/baleineTuile.png"));
        requin = ImageIO.read(getClass().getResourceAsStream("/monstres/requinTuile.png"));
        serpent = ImageIO.read(getClass().getResourceAsStream("/monstres/serpentTuile.png"));
    }

    public Image getBaleine() {
        return baleine;
    }

    public void setBaleine(Image baleine) {
        this.baleine = baleine;
    }

    public Image getRequin() {
        return requin;
    }

    public void setRequin(Image requin) {
        this.requin = requin;
    }

    public Image getSerpent() {return serpent;}

    public void setSerpent(Image serpent) {
        this.serpent = serpent;
    }
}
