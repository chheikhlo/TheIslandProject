import java.util.ArrayList;
import java.util.List;

public class Bateau {
    private List<Explorateur> nbExpPresent = new ArrayList();
    private boolean peutSupporter = true;

    private boolean peutControler = true;

    private boolean EtrePlacer = false;


    public Bateau(){};

    public Bateau(List<Explorateur> nbExpDansBateau){
        this.nbExpPresent = nbExpDansBateau;
    }

    /**
     * prends en paramètre une liste contenant des explorateurs afin de vérifier
     * si oui ou non elle contienne au maximum 3 explorateurs à transporter afin
     * de décider si oui ou non le bateau peut transporter un autre explorateur
     * @param nbExpDansBateau
     * @return
     */
    public boolean peutTransorter(List<Explorateur> nbExpDansBateau){
        if(nbExpDansBateau.size() < 3){
            return this.peutSupporter;
        }
        return false;
    }

    /**
     *permets de retourner la liste de joueurs pouvant controler le bateau
     * et donc le seulement le joueur avec le couleur pion explorateur dominant
     * ou bien tous les joueurs ayant leurs couleurs present dans le bateau
     * @param joueur
     * @param nbExpDansBateau
     * @return
     */
    public List<Joueur> joueursPouvantControler(List<Joueur> joueur, List<Explorateur> nbExpDansBateau){
        int nbFoisCouleur;
        List<Joueur> listControleur = new ArrayList();
        for(int i=0;i<joueur.size();i++) {
            nbFoisCouleur = 0;
            for (int j = 0; j < nbExpDansBateau.size(); i++) {
                if (joueur.get(i).getCouleur().equals(nbExpDansBateau.get(j))){
                    nbFoisCouleur++;

                    if (listControleur.get(1) != null && nbFoisCouleur == 2){
                        listControleur.remove(1);
                        listControleur.add(joueur.get(i));
                        return listControleur;
                    }
                }
            }
            listControleur.add(joueur.get(i));
        }
        return listControleur;
    }


    /**
     * afin de définir comment controler un bateau
     * @return
     */
    //public void controler(){}

    public List<Explorateur> getNbExpPresent() {
        return nbExpPresent;
    }

    public void setNbExpPresent(List<Explorateur> nbExpPresent) {
        this.nbExpPresent = nbExpPresent;
    }

    public boolean isPeutSupporter() {
        return peutSupporter;
    }

    public void setPeutSupporter(boolean peutSupporter) {
        this.peutSupporter = peutSupporter;
    }

    public boolean isPeutControler() {
        return peutControler;
    }

    public void setPeutControler(boolean peutControler) {
        this.peutControler = peutControler;
    }

    public boolean peutEtrePlacer() {
        return EtrePlacer;
    }

    public void setEtrePlacer(boolean EtrePlacer) {
        this.EtrePlacer = EtrePlacer;
    }
}
