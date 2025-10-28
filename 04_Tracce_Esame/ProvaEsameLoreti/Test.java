package it.unicam.cs.prog;

public class Test {
    public static void main(String[] args) {
        // Test Quadrato
        double lato = 10.0;
        it.unicam.cs.prog.Quadrato q = new it.unicam.cs.prog.Quadrato(lato);
        System.out.println("Quadrato:");
        System.out.println("Lato: " + lato);
        System.out.println("Altezza: " + q.getAltezza());
        System.out.println("Base: " + q.getBase());
        System.out.println("Area: " + q.getArea());
        System.out.println("Perimetro: " + q.getPerimetro());
        System.out.println();

        // Test Rettangolo
        double base = 10.0;
        double altezza = 20.0;
        it.unicam.cs.prog.Rettangolo r = new it.unicam.cs.prog.Rettangolo(base, altezza);
        System.out.println("Rettangolo:");
        System.out.println("Base: " + base);
        System.out.println("Altezza: " + altezza);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println();

        // Test Rombo
        double baseRombo = 6.0;
        double altezzaRombo = 8.0;
        it.unicam.cs.prog.Rombo ro = new it.unicam.cs.prog.Rombo(baseRombo, altezzaRombo);
        System.out.println("Rombo:");
        System.out.println("Base: " + baseRombo);
        System.out.println("Altezza: " + altezzaRombo);
        System.out.println("Area: " + ro.getArea());
        System.out.println("Perimetro: " + ro.getPerimetro());
        System.out.println();

        // Test Disegno
        it.unicam.cs.prog.Disegno d = new it.unicam.cs.prog.Disegno();
        d.aggiungiFigura(new it.unicam.cs.prog.Rettangolo(10, 20));
        d.aggiungiFigura(new it.unicam.cs.prog.Rombo(6, 8));
        d.aggiungiFigura(new it.unicam.cs.prog.Quadrato(10));
        System.out.println("Disegno:");
        System.out.println("Perimetro Totale: " + d.getPerimetroTotale());
        System.out.println("Area Totale: " + d.getAreaTotale());
    }
}