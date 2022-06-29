package Services;

import beans.Tableaux;

import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Tableaux t = new Tableaux();
    int nbPers;
    int noCat;
    public void entreeClients (){
        System.out.println("Combien de personnes dans la nouvelle chambre ?");
        nbPers = sc.nextInt();
        System.out.println("Quelle catégorie de chambre souhaitez-vous?");
        noCat = sc.nextInt();
        if (t.tabPrix[nbPers-1][noCat-1] != 0){
            System.out.println("Votre chambre est au prix de "+ t.tabPrix[nbPers-1][noCat-1] +"€");
        }else {
            System.out.println("Ce type de chambre n'est pas disponible pour ce nombre de personnes.");
        }

    }
}
