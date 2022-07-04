import Gestion_BDD.ConnectPostgreSql;
import Services.Menus;
import beans.Hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws IOException {
    ConnectPostgreSql connectPostgreSql = new ConnectPostgreSql();
        connectPostgreSql.connectBDD();

    }
}
