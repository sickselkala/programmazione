package Esercizio9ProvePalozz_Colesterolo;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Esami con capacità di 5 esami
        Esami esami = new Esami(5);

        // Creazione di alcuni oggetti EsameColesterolo
        EsameColesterolo esame1 = new EsameColesterolo(1609459200, 50, 100, 150); // 1 gennaio 2021
        EsameColesterolo esame2 = new EsameColesterolo(1612137600, 60, 110, 200); // 1 febbraio 2021
        EsameColesterolo esame3 = new EsameColesterolo(1614556800, 70, 120, 250); // 1 marzo 2021

        // Aggiunta degli esami all'oggetto Esami
        System.out.println("Aggiunta esame1: " + esami.add(esame1)); // true
        System.out.println("Aggiunta esame2: " + esami.add(esame2)); // true
        System.out.println("Aggiunta esame3: " + esami.add(esame3)); // true

        // Test del metodo trigliceridiMassimo
        System.out.println("Trigliceridi massimo: " + esami.trigliceridiMassimo()); // 600

        // Test del metodo intervallo
        System.out.println("Intervallo medio: " + esami.intervallo()); // 50.0
    }
}