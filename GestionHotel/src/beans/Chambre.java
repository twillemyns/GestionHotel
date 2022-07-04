package beans;

import csv.GestionCsv;

import java.io.File;
import java.util.Scanner;

public class Chambre {
    private int numero, categorie, nbPersonnes;


    public Chambre(int numero, int categorie, int nbPersonnes) {
        this.numero = numero;
        this.categorie = categorie;
        this.nbPersonnes = nbPersonnes;
    }

    GestionCsv gCsv = new GestionCsv();

    public Chambre() {
    }
    public String[] tabDescript = {"Lavabo", "WC, Télévision", "Cabine Douche, Télévision", "WC, Cabine Douche, Télévision", "WC, Salle de bain + Douche, Télévision", "2 pièces, Salle de bain + Douche,WC, Télevision"};
    public int[][] tabPrix = {{100, 120, 130, 150, 0, 0},
            {130, 160, 170, 190, 0, 0},
            {170, 200, 210, 230, 270, 350},
            {200, 230, 240, 260, 300, 400}};


    public int getNumero() {
        return numero;
    }

    public int getCateg() {
        return categorie;
    }

    public int getNbPers() {
        return nbPersonnes;
    }

    public int donnerPrix(int[][] PtabPrix) {
        return PtabPrix[nbPersonnes - 1][categorie - 1];
    }

    public void AffichDescript() {
        System.out.println(tabDescript[categorie]);
    }
}
