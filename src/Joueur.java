import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Joueur {
    private String nom;
    private String Couleur;
    private List<Explorateur> pionsExp = new ArrayList();
    private HashSet<Bateau> pionBat = new HashSet();

    public Joueur(){}

    public Joueur(String name, String color, List<Explorateur> listExp, Set<Bateau> listBat){
        this.nom = name;
        this.Couleur = color;

        for(int i=0;i<pionsExp.size();i++){
            if (pionsExp.get(i).equals(color)) {
                listExp.add(pionsExp.get(i));
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public List<Explorateur> getPionsExp() {
        return pionsExp;
    }

    public void setPionsExp(List<Explorateur> pionsExp) {
        this.pionsExp = pionsExp;
    }

    public HashSet<Bateau> getPionBat() {
        return pionBat;
    }

    public void setPionBat(HashSet<Bateau> pionBat) {
        this.pionBat = pionBat;
    }
}
