package osszesprogramozasitetel;

public class OsszesProgramozasiTetel {

    public static void main(String[] args) {

        // összegzés tétele, a párosakat adja össze
        int[] tomb = {3, 8, 2, 4, 1, 5, 6};

        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                //osszeg = osszeg + tomb[i];
                osszeg += tomb[i];
            }
        }

        System.out.println(osszeg);

        //megszámlálás tétele, az 5-nél nagyobbakat számolja meg
        int[] tomb2 = {3, 8, 2, 4, 1, 5, 6};
        int szamlalo = 0;

        for (int i = 0; i < tomb2.length; i++) {
            if (tomb2[i] > 5) {
                szamlalo++;
            }
        }
        System.out.println(szamlalo);
        
        //maximumkiválasztás tétele
        int [] tomb3 = {3, 8, 2, 4, 1, 5, 6};
        int n = tomb3.length;
        
        int max = tomb[0];
        
        for (int i = 0; i < n; i++) {
            if(tomb[i] > max){
                max = tomb[i];
            }
        }
        
        System.out.println("A legnagyobb szám: " + max);
        
        
        
        //minimum kiválasztás tétele
        int [] tomb4 = {3, 8, 2, 4, 1, 5, 6};
        n = tomb4.length;
        
        int min = tomb[0];
        
        for (int i = 0; i < n; i++) {
            if(tomb[i] < min){
                tomb[i] = min;
            }
        }
        
        System.out.println("A legkisebb szám: " + min);
        

        //eldöntés tétele(van-e benne ilyen szám vagy nincs)
        int[] tomb5 = {3, 8, 2, 4, 1, 5, 6};
        n = tomb5.length; // tömb elemeinek száma
        int keresettSzam = 2;

        int i = 0;

        while (i < n && tomb5[i] != keresettSzam) {
            i++;
        }

        if (i < n) {
            System.out.println("Van ilyen szám.");
        } else {
            System.out.println("Nincs ilyen szám.");
        }

        //kiválasztás tétele 
        int[] tomb6 = {3, 8, 2, 4, 1, 5, 6};
        n = tomb6.length;
        keresettSzam = 2; //amiről szeretnénk tudni, hogy hanyadik helyen van 

        i = 0;
        while (tomb6[i] != keresettSzam) {
            i++;
        }
        System.out.printf("A keresett szám ezen a helyen található: %d\n ", i + 1);

        //keresés tétele
        int[] tomb7 = {3, 8, 2, 4, 1, 5, 6};
        n = tomb7.length; // tömb elemeinek száma 
        keresettSzam = 3; // amit keresünk

        i = 0;

        while (i < n && tomb7[i] != keresettSzam) {
            i++;
        }

        if (i < n) {
            //Ha az a kérdés, hogy hanyadik, akkor i + 1 a vége
            //ha a kérdés az, hogy mi az indexe, akkor csak 1 
            System.out.printf("Van ilyen a következő helyen: %d\n", i + 1);
        } else {
            System.out.println("Nincs ilyen elem");
        }

        System.out.println("Kiválogatás tétele" + "\n");
        //kiválogatás tétele, ha nagyobb 5-nél kerüljön át máshova akkor 
        int[] a = {3, 8, 2, 4, 1, 5, 6};
        n = a.length;
        int[] b = new int[n];
        int j = 0;

        for (i = 0; i < n; i++) {
            if (a[i] > 5) {
                b[j++] = a[i];
            }
        }
        int m = j; //A "b" tömb elemeinek a száma

        //Első tömb kiíratva
        System.out.println("Összes szám: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        //Második tömb kiíratva
        System.out.println("5-nél nagyobb számok szám: ");
        for (i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("" + "\n");

        System.out.println("Szétválogatás tétele");

        //szétválogatás tétele,ha nagyobb 4-nél kerüljön át máshova akkor 
        int[] a2 = {3, 8, 2, 4, 1, 5, 6};
        n = a2.length;
        int[] b2 = new int[n];
        int[] c2 = new int[n];

        j = 0;
        int k = 0;

        for (i = 0; i < n; i++) {
            if (a[i] > 4) {
                b2[j++] = a[i];
            } else {
                c2[k++] = a[i];
            }
        }

        m = j;
        int l = k;

        //Első tömb kiíratva
        System.out.println("Összes szám: ");
        for (i = 0; i < n; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println("");

        //Második tömb kiíratva
        System.out.println("4-nél nagyobb számok: ");
        for (i = 0; i < m; i++) {
            System.out.print(b2[i] + " ");
        }
        System.out.println("");

        //Harmadik tömb kiíratva
        System.out.println("4-nél nem nagyobb számok: ");
        for (i = 0; i < l; i++) {
            System.out.print(c2[i] + " ");
        }
        System.out.println("" + "\n");

        //metszet tétele
        System.out.println("A metszet tétele");
        int[] a3 = {3, 8, 2, 4, 1, 5, 6};
        n = a3.length;// az első tömb elemeinek száma
        int[] b3 = {4, 7, 9, 8, 2};
        m = b3.length; // a második tömb elemeinek száma 
        int[] c3 = new int[n + m];

        j = 0;
        k = 0;

        for (i = 0; i < n; i++) {
            j = 0;
            while (j < m && b3[j] != a3[i]) {
                j++;
            }
            if (j < m) {
                c3[k] = a3[i];
                k++;
            }
        }

        l = k; // a "c3" tömb elemeinek száma 

        //Első tömb kiíratva
        System.out.println("Első tömb elemei:");
        for (i = 0; i < n; i++) {
            System.out.print(a3[i] + " ");
        }
        System.out.println("");

        //Második tömb kiíratva
        System.out.println("Második tömb elemei:");
        for (i = 0; i < m; i++) {
            System.out.print(b3[i] + " ");
        }
        System.out.println("");

        //Harmadik tömb kiíratva
        System.out.println("A két tömb metszete:");
        for (i = 0; i < l; i++) {
            System.out.print(c3[i] + " ");
        }
        System.out.println("" + "\n");

        //unió tétele
        System.out.println("Az unió tétele");
        int[] a4 = {3, 8, 2, 4, 1, 5, 6};
        n = a4.length;// az első tömb elemeinek száma
        int[] b4 = {4, 7, 9, 8, 2};
        m = b4.length; // a második tömb elemeinek száma 
        int[] c4 = new int[n + m];

        for (i = 0; i < n; i++) {
            c4[i] = a4[i];
        }

        k = n - 1;

        for (j = 0; j < m; j++) {
            i = 0;
            while (i < n && a4[i] != b4[j]) {
                i++;
            }

            if (i >= n) {
                k++;
                c4[k] = b4[j];
            }

        }

        l = k + 1; // A "c" tömb elemeinek a száma

        //Első tömb kiíratva
        System.out.println("Első tömb elemei:");
        for (i = 0; i < n; i++) {
            System.out.print(a4[i] + " ");
        }
        System.out.println("");

        //Második tömb kiíratva
        System.out.println("Második tömb elemei:");
        for (i = 0; i < m; i++) {
            System.out.print(b4[i] + " ");
        }
        System.out.println("");

        //Harmadik tömb kiíratva
        System.out.println("A két tömb uniója:");
        for (i = 0; i < l; i++) {
            System.out.print(c4[i] + " ");
        }
        System.out.println("");
        
        

    }

}
