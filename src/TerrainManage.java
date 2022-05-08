import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TerrainManage {
    Tuile tuile ;
    Terrain terrain = new Terrain();
    GamePanel gp;

    public TerrainManage(GamePanel gp){
        this.gp = gp;
        tuile = new Tuile(terrain);
        getTerrain();
    }
    public void getTerrain(){
        try {
            tuile.getTerrain().Island = ImageIO.read(getClass().getResourceAsStream("/bgisland.jpeg"));
            //terrain.Plage = ImageIO.read(getClass().getResourceAsStream("/terrains/foretTuile.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void draw(Graphics2D g){
        g.drawImage(terrain.Island,0,0,gp.ScreenWidth,gp.ScreenHeight,null);
        g.drawImage(terrain.Plage,85,60,45,50,null);


    }
}
