package Services;

import beans.Chambre;
import beans.Hotel;

import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Chambre c = new Chambre();

    Hotel h = new Hotel();
    int nbPers;
    int noCh;

    public void entreeClients() {
        System.out.println("Combien de personnes dans la nouvelle chambre ?");
        nbPers = sc.nextInt();
        h.affichCh(nbPers, c.tabPrix, c.tabDescript);
        System.out.println("Quelle chambre souhaitez-vous?");
        noCh = sc.nextInt();
        if (c.tabPrix[nbPers - 1][h.getObject(noCh).getCateg()-1] != 0) {
//            System.out.println(h.getObject(noCh).getNumero());
            System.out.println("Votre chambre est au prix de " + c.tabPrix[nbPers - 1][h.getObject(noCh).getCateg()-1] + "€");
        } else {
            System.out.println("Ce type de chambre n'est pas disponible pour ce nombre de personnes.");
        }

    }
}
