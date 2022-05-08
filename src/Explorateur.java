public class Explorateur {

    private String couleur;
    private int score;

    private Tuile tuile;

    public Explorateur(){}

    public Explorateur(String color, int numberTresor){
        this.couleur = color;
        this.score = numberTresor;
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
}
