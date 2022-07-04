package Gestion_BDD;

import Services.Menus;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectPostgreSql {
    Connection c = null;
    Menus menu = new Menus();
    public void connectBDD (){
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hotel",
                    "postgres", "AFPA2022");
            menu.entreeClients(c);
        } catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}

