import Gestion_BDD.ConnectPostgreSql;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    ConnectPostgreSql connectPostgreSql = new ConnectPostgreSql();
        connectPostgreSql.connectBDD();
    }
}