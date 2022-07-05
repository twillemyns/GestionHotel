import Gestion_BDD.ConnectPostgreSql;

public class Main {
    public static void main(String[] args) {
        ConnectPostgreSql connectPostgreSql = new ConnectPostgreSql();
        connectPostgreSql.connectBDD();
    }
}