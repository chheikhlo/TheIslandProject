import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Partie implements ActionListener, WindowListener{

    private List<Explorateur> pionsExp2 = new ArrayList();
    private HashSet<Bateau> batJoueur = new HashSet();
    private List<Joueur> listJoueurs = new ArrayList();
    private List<String> nomsJoueurs = new ArrayList();


    private String[] tabCouleur = {"Bleu","Vert","Jaune","Rouge"};

    /**
     * Innitialisation des pions explorateurs
     * en remplissant la liste de pions explorateurs
     */
    public void initialiserExplorateurs() {
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
     * en remplissant la liste de bateau
     */
    public void initialiserBateaux() {
        for (int i = 0; i <= 12; i++) {
            //Création des Bateaux
            Bateau newBateau = new Bateau();
            batJoueur.add(newBateau);
        }
    }

    /**
     * recupère un par un les noms enregistré dans un fichier, puis
     * les ajoutes dans une liste de noms
     * @throws FileNotFoundException
     */
    public void remplirListNom() throws FileNotFoundException {
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
     * initialiser les joueurs de la partie en recevant leur effectif en paramètre
     */
    public void initialiserJoueurs(){
        for (int i = 0; i < nomsJoueurs.size(); i++) {
            Joueur newJoueur = new Joueur(nomsJoueurs.get(i),tabCouleur[i],pionsExp2);
            listJoueurs.add(newJoueur);
        }
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
