package totoprogram;

public class Szelveny {

    private final int SZELVENYSZAM; // az aktuális szelvény példány száma, az első (0.) szelvény példány a megfejtés lesz
    private final char[] TIPPEK = new char[14];  // 13+1 db véletlen tipp

    public Szelveny(int szelvenyszam) {
        this.SZELVENYSZAM = szelvenyszam;
        tippGenerator();
    }

    // feltöltjük tippekkel a szelvényt
    private void tippGenerator() {
        int tipp;
        for (int i = 0; i < 14; i++) {
            tipp = (int) (Math.random() * 3);
            if (tipp == 0) {
                TIPPEK[i] = 'X';
            } else {
                TIPPEK[i] = (char) (tipp + '0');
            }
        }
    }

    public char[] getTIPPEK() {
        return TIPPEK;
    }

    public int getSZELVENYSZAM() {
        return SZELVENYSZAM;
    }

    @Override
    public String toString() {
        return "Szelveny{" + "TIPPEK=" + TIPPEK + ", SZELVENYSZAM=" + SZELVENYSZAM + '}';
    }
}