package Services;

import Gestion_BDD.InsertData;
import beans.Chambre;
import beans.Hotel;
import csv.GestionCsv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Chambre c = new Chambre();
    GestionCsv gCsv = new GestionCsv();
    InsertData insertData = new InsertData();
    Hotel h = new Hotel();
    int nbPers;
    int noCh;
    int noNuits;

    public void entreeClients(Connection connection) throws IOException, SQLException {
        System.out.println("Combien de personnes dans la nouvelle chambre ?");
        nbPers = sc.nextInt();
        h.affichCh(nbPers, c.tabPrix, c.tabDescript);
        System.out.println("Quelle chambre souhaitez-vous?");
        noCh = sc.nextInt();
        if (c.tabPrix[nbPers - 1][h.getObject(noCh).getCateg()-1] != 0) {
//            System.out.println(h.getObject(noCh).getNumero());
            System.out.println("Pour combien de nuits souhaitez-vous réserver la chambre ?");
            noNuits = sc.nextInt();
            System.out.println("Votre chambre est au prix de " + c.tabPrix[nbPers - 1][h.getObject(noCh).getCateg()-1] + "€ la nuit soit "+ c.tabPrix[nbPers - 1][h.getObject(noCh).getCateg()-1]*noNuits +"€ .");
            insertData.insererDonnees(connection, noCh, noNuits, nbPers);
        } else {
            System.out.println("Ce type de chambre n'est pas disponible pour ce nombre de personnes.");
        }

    }
}
