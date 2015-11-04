// ukázka 

package objektynakup;

public class ObjektyNakup {

   private static class PolozkaNakupu {
        public String nazev;
        public double cenakus;
        public int kusu;
    }
    
    public static void main(String[] args) {
        PolozkaNakupu polozka;
        polozka = new PolozkaNakupu();
        polozka.nazev = "rohlík";
        polozka.cenakus = 1.50;
        polozka.kusu = 10;
        System.out.println("Název zboží: "+polozka.nazev);
        System.out.println("Cena za kus: "+polozka.cenakus);
        System.out.println("Počet kusů: "+polozka.kusu);
        
        PolozkaNakupu[] pole = new PolozkaNakupu[10];
        pole[0] = new PolozkaNakupu();
        pole[0].nazev = "rohlík";
        pole[0].cenakus = 1.50;
        pole[0].kusu = 10;
        
        pole[1] = new PolozkaNakupu();
        pole[1].nazev = "mlíko";
        pole[1].cenakus = 19.50;
        pole[1].kusu = 12;
        
        for (int i=0; i<=1; i++) {
            System.out.println("Název: "+pole[i].nazev);
            System.out.println("Cena za kus: "+pole[i].cenakus);
            System.out.println("Počet kusů: "+pole[i].kusu);
        }
    }  
}
