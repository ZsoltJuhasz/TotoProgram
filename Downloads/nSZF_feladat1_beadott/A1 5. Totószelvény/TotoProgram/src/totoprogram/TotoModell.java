package totoprogram;

import java.util.ArrayList;

public class TotoModell {

    // maximálisan mennyi szelvényt generálhat
    private int MAXSZELVENYDB = 100000;
    // mennyi lett generálva
    private int szelvenyDb = 0;
    private ArrayList<Szelveny> szelvenyLista = new ArrayList<>();
    // nyertes szelvények szétválogatva
    private ArrayList<Szelveny> nyertesLista14 = new ArrayList<>();
    private ArrayList<Szelveny> nyertesLista13 = new ArrayList<>();
    private ArrayList<Szelveny> nyertesLista12 = new ArrayList<>();
    private ArrayList<Szelveny> nyertesLista11 = new ArrayList<>();
    private ArrayList<Szelveny> nyertesLista10 = new ArrayList<>();
    
    public TotoModell() {
        adatokGeneral();
    }

    // random mennyiségű szelvény generálása
    private void szelvenyGenerator() {
        szelvenyDb = (int) (Math.random() * MAXSZELVENYDB) + 1;

        for (int i = 0; i < szelvenyDb; i++) {
            szelvenyLista.add(new Szelveny(i));
        }
    }

    // nyertes szelvények megkeresése és szétválogatása találat szerint
    private void kiertekeles() {
        Szelveny nyertesSzelveny = szelvenyLista.get(0);
        Szelveny aktSzelveny;
        int db;
        for (int i = 1; i < szelvenyDb; i++) {
            db = 0;
            aktSzelveny = szelvenyLista.get(i);
            for (int j = 0; j < 14; j++) {
                if (aktSzelveny.getTIPPEK()[j] == nyertesSzelveny.getTIPPEK()[j]) {
                    db++;
                }
            }
            switch (db) {
                case 14:nyertesLista14.add(aktSzelveny);break;
                case 13:nyertesLista13.add(aktSzelveny);break;
                case 12:nyertesLista12.add(aktSzelveny);break;
                case 11:nyertesLista11.add(aktSzelveny);break;
                case 10:nyertesLista10.add(aktSzelveny);break;
            }
        }
    }

    // szelvényszámok kiszedése egy listából Stringbe
    public String getSzelvenyszamok(ArrayList<Szelveny> lista) {
        String eredmeny = "";
        for (Szelveny szelveny : lista) {
            eredmeny += szelveny.getSZELVENYSZAM() + ",";
        }
        if (!eredmeny.isEmpty()) {
            eredmeny = eredmeny.substring(0, eredmeny.length() - 1);
        }
        return eredmeny;
    }

    public void adatokGeneral() {
        szelvenyGenerator();
        kiertekeles();
    }

    public void listakUrit() {
        szelvenyLista.clear();
        nyertesLista14.clear();
        nyertesLista13.clear();
        nyertesLista12.clear();
        nyertesLista11.clear();
        nyertesLista10.clear();
    }

    public ArrayList<Szelveny> getSzelvenyLista() {
        return szelvenyLista;
    }

    public ArrayList<Szelveny> getNyertesLista14() {
        return nyertesLista14;
    }

    public ArrayList<Szelveny> getNyertesLista13() {
        return nyertesLista13;
    }

    public ArrayList<Szelveny> getNyertesLista12() {
        return nyertesLista12;
    }

    public ArrayList<Szelveny> getNyertesLista11() {
        return nyertesLista11;
    }

    public ArrayList<Szelveny> getNyertesLista10() {
        return nyertesLista10;
    }

    public int getMAXSZELVENYDB() {
        return MAXSZELVENYDB;
    }

    public void setMAXSZELVENYDB(int MAXSZELVENYDB) {
        this.MAXSZELVENYDB = MAXSZELVENYDB;
    }
}