import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Partie implements ActionListener, WindowListener{


    //private  = {"Bleu","Vert","Jaune","Rouge"};

    /**
     * Innitialisation des pions explorateurs
     *       en remplissant la liste une pions explorateurs
     * @param pionsExp2
     * @param tabCouleur
     */
    public void initialiserExplorateurs(List<Explorateur> pionsExp2, String[] tabCouleur) throws IOException {
        for (int i = 0; i < tabCouleur.length; i++) {
            //Création des Explorateurs
            Explorateur newExp1 = new Explorateur(tabCouleur[i], 1);
            Explorateur newExp2 = new Explorateur(tabCouleur[i], 1);
            Explorateur newExp3 = new Explorateur(tabCouleur[i], 1);
            Explorateur newExp4 = new Explorateur(tabCouleur[i], 2);
            Explorateur newExp5 = new Explorateur(tabCouleur[i], 2);
            Explorateur newExp6 = new Explorateur(tabCouleur[i], 3);
            Explorateur newExp7 = new Explorateur(tabCouleur[i], 3);
            Explorateur newExp8 = new Explorateur(tabCouleur[i], 4);
            Explorateur newExp9 = new Explorateur(tabCouleur[i], 5);
            Explorateur newExp10 = new Explorateur(tabCouleur[i], 6);

            //remplissement de notre liste d'explorateurs
            pionsExp2.add(newExp1);
            pionsExp2.add(newExp2);
            pionsExp2.add(newExp3);
            pionsExp2.add(newExp4);
            pionsExp2.add(newExp5);
            pionsExp2.add(newExp6);
            pionsExp2.add(newExp7);
            pionsExp2.add(newExp8);
            pionsExp2.add(newExp9);
            pionsExp2.add(newExp10);
        }
    }

    /**
     * Innitialisation des 12 bateaux
     *   en remplissant la liste de bateau
     * @param batJoueur
     */
    public void initialiserBateaux(HashSet<Bateau> batJoueur) {
        for (int i = 0; i <= 12; i++) {
            //Création des Bateaux
            Bateau newBateau = new Bateau();
            batJoueur.add(newBateau);
        }
    }

    /**
     * recupère un par un les noms enregistré dans un fichier, puis
     *   les ajoutes dans une liste de noms
     * @param nomsJoueurs
     * @throws FileNotFoundException
     */
    public void remplirListNom(List<String> nomsJoueurs) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\New\\src\\nomFichier.txt"));
        int line=0;
        while (scan.hasNextLine()) {
            String[] noms = scan.nextLine().split(" ");
            for(int i=0;i<noms.length;i++){
                nomsJoueurs.add(noms[i]);
            }
            line++;
        }
        scan.close();
    }

    /**
     * Créer les joeurs avec leurs pions aux couleurs adequats ainsi que leurs noms
     * @param pionsExp2
     * @param listJoueurs
     * @param nomsJoueurs
     * @param tabCouleur
     */
    public void initialiserJoueurs(List<Explorateur> pionsExp2, List<Joueur> listJoueurs, List<String> nomsJoueurs, String[] tabCouleur){
        for (int i = 0; i < nomsJoueurs.size(); i++) {
            Joueur newJoueur = new Joueur(nomsJoueurs.get(i),tabCouleur[i],pionsExp2);
            listJoueurs.add(newJoueur);
        }
    }

    /**
     * Permet de définir le dee avec les creatures a niveau des faces
     * @param deeCreature
     * @return
     * @throws IOException
     */
    public List<Creature> creerDee(List<Creature> deeCreature) throws IOException {
        Baleine baleine = new Baleine();
        Requin requin = new Requin();
        Serpent serpent = new Serpent();
        deeCreature.add(baleine);
        deeCreature.add(requin);
        deeCreature.add(serpent);

        return deeCreature;
    }

    /**
     * Permet de retourner la face jouée du dee
     * @param deeCreature
     * @return
     */
    public Creature jouerDee(List<Creature> deeCreature){
        int nbAleatoire = (int) Math.random() * (3-1) + 1;
        return deeCreature.get(nbAleatoire);
    }

    /**
     * choisir aléatoirement le joueur débutant
     * @param listJoueurs
     * @return
     */
    public Joueur definirJoueurDebutant(List<Joueur> listJoueurs){
        int nbAleatoire = (int) Math.random() * (listJoueurs.size()-1) + 1;
        return listJoueurs.get(nbAleatoire);
    }

    /**
     * Verifier si Aucun explorateur est present sur une tuile ou pas
     * @param tuile
     * @return
     */
    public boolean explorateurEstPresent(Tuile tuile){
        if(tuile.getExplorateur().equals(null)){
            return false;
        }

        return true;
    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
