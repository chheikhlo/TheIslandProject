package Vue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Joueur {
    private String nom;
    private String Couleur;
    private List<Explorateur> pionsExp = new ArrayList();
    private HashSet<Bateau> pionBat = new HashSet();

    public Joueur(){}

    public Joueur(String name, String color, List<Explorateur> listExp){
        this.nom = name;
        this.Couleur = color;

        for(int i=0;i<pionsExp.size();i++){
            if (pionsExp.get(i).equals(color)) {
                listExp.add(pionsExp.get(i));
            }
        }
    }

    /**
     * Permet de regarder le score d'un explorateur.
     * On vérifie déjà si l'explorateur n'est pas encore placer sur tuile afin de pouvoir
     * permettre une vue sur son score au joueur
     * @param explorateur
     * @return
     */
    public int regarderScoreExplorateur(Explorateur explorateur){
        if(explorateur.estDejaPlacer() == true){
            return explorateur.getScore();
        }else
            //coté graphic on va effectuer une verification si la fonction retourne 0
            //on affiche pas le score
            return 0;
    }

    /**
     * Permet de vérifier si les joeurs peuvent commencer à placer les bateau
     * Pour cela il faudrait donc que chaque explorateur ait son attribut nommé "dejaPlacer" à true
     * Sinon pas encore de possibilité pour placer un bateau
     * @param listJoueurs
     * @return
     */
    public boolean peutPlacerBateau(List<Joueur> listJoueurs){
        boolean placer = true;
        for(int i=0;i<listJoueurs.size();i++){
            for(int j=0;j<listJoueurs.get(i).getPionsExp().size();j++) {
                if(listJoueurs.get(i).getPionsExp().get(j).estDejaPlacer() == true){
                    placer = true;
                }else
                    return false;
            }
        }
        return placer;
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
