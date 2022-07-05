package beans;

public class Chambre {
    private int numero, categorie, nbPersonnes;

    public Chambre(int numero, int categorie, int nbPersonnes) {
        this.numero = numero;
        this.categorie = categorie;
        this.nbPersonnes = nbPersonnes;
    }

    public Chambre() {
    }

    public int getNumero() {
        return numero;
    }

    public int getCateg() {
        return categorie;
    }

    public int donnerPrix(int[][] PtabPrix) {
        return PtabPrix[nbPersonnes - 1][categorie - 1];
    }
}

