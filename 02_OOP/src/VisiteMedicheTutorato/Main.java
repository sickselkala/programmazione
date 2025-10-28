package VisiteMedicheTutorato;
    public class Main {
        public static void main(String [] args) {
            Coda c = null;
            try { c = new Coda(-2); }
            catch (Exception e) { System.out.println("OK"); }
            try { c = new Coda(3); }
            catch (Exception e) { System.out.println("NO"); }
            try { if (c.inserimento(new Visita("Alessandro","Altobelli")))
                System.out.println("OK"); }
            catch (Exception e) { System.out.println("NO"); }
            try { if (c.inserimento(new Visita("Paolo","Rossi")))
                System.out.println("OK"); }
            catch (Exception e) { System.out.println("NO"); }
            //System.out.println(c.getNumero() == 2 ? "OK" : "NO");
            try { if (c.inserimento(new Visita("P", "R")))
                System.out.println("NO"); }
            catch (Exception e) { System.out.println("OK"); }
            //System.out.println(c.getNumero() == 2 ? "OK" : "NO");
            System.out.println(c.cancellazione("Paolo","Rossi") ? "OK" : "NO");
           // System.out.println(c.getNumero() == 1 ? "OK" : "NO");
        }
    }

