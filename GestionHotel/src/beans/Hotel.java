package beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hotel {
    private Chambre[] tabCh = new Chambre[31];
    public int getIndex(int noCh) {
        int index = 0;
        int i = 0;
        do {
            i++;
//            System.out.println(tabCh[i].getNumero());
            if (noCh == tabCh[i].getNumero()) {
                index = i;
            }
        } while (noCh != tabCh[i].getNumero() && i < tabCh.length);
        return index;
    }

    public Chambre getObject(int noCh) {
        return tabCh[getIndex(noCh)];
    }
    Statement stmt = null;

    public void afficherChBDD(Connection conn, int nbPers) throws SQLException {
        stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT r.noroom , t2.description, t.prix FROM  rooms r INNER JOIN tabprix t ON  r.nbpeople = t.nopers INNER JOIN tabdescript t2 ON r.nocategory  = t2.indice AND t.nocategorie = t2.indice WHERE r.nbpeople = " + nbPers + ";");
        while (res.next()) {
            int noRoom = res.getInt("noroom");
            String description = res.getString("description");
            int prix = res.getInt("prix");

            System.out.print("N° Chambre: " + noRoom);
            System.out.print(", " + description);
            System.out.println(", Prix: " + prix + "€");
        }
    }

    public int[][] tabPrix = new int[4][6];

    public void getTabPrixBDD(Connection conn) throws SQLException {
        stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM tabprix;");
        while (res.next()) {
            int noPersonnes = res.getInt("nopers");
            int noCategorie = res.getInt("nocategorie");
            int prix = res.getInt("prix");

            tabPrix [noPersonnes - 1][noCategorie - 1] = prix;
        }
    }
    public void getTabRoomsBDD(Connection conn) throws SQLException {
        int i = 0;
        stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM rooms ORDER BY noroom;");
        while (res.next()) {
            int noRoom = res.getInt("noroom");
            int noCategory = res.getInt("nocategory");
            int noPers = res.getInt("nbpeople");

            tabCh [i] = new Chambre(noRoom, noCategory, noPers);
            i++;
        }
    }
}
