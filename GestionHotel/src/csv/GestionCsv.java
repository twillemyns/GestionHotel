package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestionCsv {
     static Scanner sc;
    public void CreateTabCatCsv (String[] tabDescript, int taille, File tabDescriptCsv) throws FileNotFoundException {
        int i = 0;
        tabDescriptCsv = new File("U:\\59013-36-14\\MS Java\\GestionHotel\\GestionHotel\\GestionHotel\\src\\csv\\DataChambre.csv");
            sc = new Scanner(tabDescriptCsv);
        tabDescript = new String[taille];
        while (sc.hasNext() && i < tabDescript.length){
            tabDescript[i] = sc.nextLine();
            i++;
        }
        sc.close();
    }

    public void getReservation(int nbCh, int nbNuits, int nbPers) throws IOException {
            FileWriter file = new FileWriter("U:\\59013-36-14\\MS Java\\GestionHotel\\GestionHotel\\GestionHotel\\src\\csv/Reservation.csv");
        try {
            file.append("Réservation de la chambre :"+nbCh+"\n");
            file.append("Nombre de nuits:"+nbNuits+"\n");
            file.append("Nombre de personnes:"+nbPers);
            file.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
