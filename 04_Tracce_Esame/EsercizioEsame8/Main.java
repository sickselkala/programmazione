package EsercizioEsame8;
public class Main {
    public static void main(String[] args) {
        // Test della classe Pianeta
        Pianeta p1 = new Pianeta("Terra", 100, 1);
        Pianeta p2 = new Pianeta("Marte", 340, 0.5);
        Pianeta p3 = new Pianeta("Giove", 140, 10);
        Pianeta p4 = new Pianeta("Saturno", 200, 8);

        SistemaSolare s = new SistemaSolare(8);

        s.nuovoOrdinato(p1);
        s.stampaPianeti();
      /*  s.nuovoOrdinato(p2);
        s.stampaPianeti();
        s.nuovoOrdinato(p3);
        s.stampaPianeti();
        s.nuovoOrdinato(p4);
        s.stampaPianeti();
*/

        }
    }
