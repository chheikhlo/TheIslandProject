package Vue;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;


public class Explorateur {

    private String couleur;
    private int score;
    private Tuile tuile;

    private Image explorateur;

    private boolean dejaPlacer = false;

    public Explorateur(){}

    public Explorateur(String color, int numberTresor) throws IOException {
        this.couleur = color;
        this.score = numberTresor;
        if(this.couleur.equalsIgnoreCase("Bleu")){
            this.explorateur = ImageIO.read(getClass().getResourceAsStream("/explorateur/ExpBleuTuile.png"));
        }else if(this.couleur.equalsIgnoreCase("Vert")){
            this.explorateur = ImageIO.read(getClass().getResourceAsStream("/explorateur/ExpVertTuile.png"));
        }else if(this.couleur.equalsIgnoreCase("Jaune")){
            this.explorateur = ImageIO.read(getClass().getResourceAsStream("/explorateur/ExpJauneTuile.png"));
        }else
            this.explorateur = ImageIO.read(getClass().getResourceAsStream("/explorateur/ExpRougeTuile.png"));
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNumeroTresor() {
        return score;
    }

    public void setNumeroTresor(int numeroTresor) {
        this.score = numeroTresor;
    }

    public Tuile getTuile() {
        return tuile;
    }

    public void setTuile(Tuile tuile) {
        this.tuile = tuile;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean estDejaPlacer() {
        return dejaPlacer;
    }

    public void setDejaPlacer(boolean dejaPlacer) {
        this.dejaPlacer = dejaPlacer;
    }

    public Image getExplorateur() {
        return explorateur;
    }

    public void setExplorateur(Image explorateur) {
        this.explorateur = explorateur;
    }

    public boolean isDejaPlacer() {
        return dejaPlacer;
    }
}
