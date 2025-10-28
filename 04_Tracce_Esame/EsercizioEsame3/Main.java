package EsercizioEsame3;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di esami con valori validi
            Esame esame1 = new Esame(1672522562, 50, 150, 120); // Esempio di valori validi
            Esame esame2 = new Esame(1672610000, 55, 160, 180);
            Esame esame3 = new Esame(1672690000, 60, 170, 200);
            Esame esame4 = new Esame(1672780000, 45, 145, 160);

            // Creazione dell'oggetto Esami con un massimo di 5 esami
            Esami esami = new Esami(5);

            // Aggiunta degli esami
            System.out.println("Aggiungi esame 1: " + esami.add(esame1)); // True
            System.out.println("Aggiungi esame 2: " + esami.add(esame2)); // True
            System.out.println("Aggiungi esame 3: " + esami.add(esame3)); // True
            System.out.println("Aggiungi esame 4: " + esami.add(esame4)); // True

            // Testa il metodo trigliceridiMassimo()
            System.out.println("Trigliceridi Massimo: " + esami.trigliciridiMassimo()); // Dovrebbe restituire 200

            // Testa il metodo intervallo()
            System.out.println("Intervallo medio tra IDL e HDL: " + esami.intervallo()); // Dovrebbe calcolare la media delle differenze IDL - HDL

        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}