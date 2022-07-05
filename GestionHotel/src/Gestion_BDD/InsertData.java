package Gestion_BDD;

import Services.Menus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    private static int count = 0;
        Statement stmt = null;
    public void insererDonnees(Connection conn, int noCh, int nbNuits, int nbPersonnes) throws SQLException {
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO reservation VALUES ('"+nbNuits+"', '"+nbPersonnes+"', '"+noCh+"');");
    }
}
