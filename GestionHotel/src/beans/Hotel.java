package beans;

public class Hotel {
    private Chambre[] tabCh = new Chambre[31];
    public Chambre[] getTabCh() {
        return tabCh;
    }

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

    public Chambre getObject(int noCh){
        return tabCh[getIndex(noCh)];
    }

    public Hotel() {
        tabCh[0] = new Chambre(1, 1, 1);
        tabCh[1] = new Chambre(2, 2, 1);
        tabCh[2] = new Chambre(3, 3, 1);
        tabCh[3] = new Chambre(4, 4, 1);
        tabCh[4] = new Chambre(5, 1, 2);
        tabCh[5] = new Chambre(6, 2, 2);
        tabCh[6] = new Chambre(7, 3, 2);
        tabCh[7] = new Chambre(8, 4, 2);
        tabCh[8] = new Chambre(9, 1, 3);
        tabCh[9] = new Chambre(10, 2, 3);
        tabCh[10] = new Chambre(11, 3, 3);
        tabCh[11] = new Chambre(12, 4, 3);
        tabCh[12] = new Chambre(13, 5, 3);
        tabCh[13] = new Chambre(14, 6, 3);
        tabCh[14] = new Chambre(15, 1, 4);
        tabCh[15] = new Chambre(16, 2, 4);
        tabCh[16] = new Chambre(17, 3, 4);
        tabCh[17] = new Chambre(18, 4, 4);
        tabCh[18] = new Chambre(19, 5, 4);
        tabCh[19] = new Chambre(20, 6, 4);
        tabCh[20] = new Chambre(21, 1, 1);
        tabCh[21] = new Chambre(22, 2, 2);
        tabCh[22] = new Chambre(23, 1, 2);
        tabCh[23] = new Chambre(24, 3, 1);
        tabCh[24] = new Chambre(25, 3, 2);
        tabCh[25] = new Chambre(26, 4, 4);
        tabCh[26] = new Chambre(27, 5, 4);
        tabCh[27] = new Chambre(28, 2, 2);
        tabCh[28] = new Chambre(29, 4, 3);
        tabCh[29] = new Chambre(30, 3, 2);
        tabCh[30] = new Chambre(31, 4, 2);
    }


    public void affichCh(int PnbPers, int[][] PtabPrix, String[] PtabDescript) {
        for (Chambre ch : tabCh) {
            if (ch.getNbPers() == PnbPers) {
                System.out.println(ch.getNumero() + " " + ch.getCateg() + " " + PtabDescript[ch.getCateg()-1] + " " + PtabPrix[PnbPers - 1][ch.getCateg()-1]+"€");
            }
        }

    }
}
