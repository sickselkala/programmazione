package EsercizioEsame6;
// src/TestZatteraGalleggiante.java
public class TestZatteraGalleggiante {
    public static void main(String[] args) {
        it.unicam.cs.prog.Punto puntoIniziale = new it.unicam.cs.prog.Punto(0, 0);
        ZatteraGalleggiante zattera = new ZatteraGalleggiante(10, 10);

        Pacco pacco1 = new Pacco(5);
        Pacco pacco2 = new Pacco(10);

        it.unicam.cs.prog.Punto posizione1 = new it.unicam.cs.prog.Punto(2, 3);
        it.unicam.cs.prog.Punto posizione2 = new it.unicam.cs.prog.Punto(5, 5);

        zattera.aggiungiPacco(pacco1, posizione1);
        zattera.aggiungiPacco(pacco2, posizione2);

        System.out.println("Peso totale: " + zattera.getPesoTotale());
        System.out.println("Peso medio: " + zattera.getPesoMedio());
        System.out.println("Baricentro: (" + zattera.getBaricentro() + ")");
    }
}

