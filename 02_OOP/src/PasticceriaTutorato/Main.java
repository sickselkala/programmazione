package PasticceriaTutorato;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di una pasticceria con capacità di 5 torte
            Pasticceria pasticceria = new Pasticceria(5);
            System.out.println("Test 1: Creazione Pasticceria - OK");

            // Creazione di alcune torte
            Torta tortaCioccolato = new TortaAlCioccolato("Cioccolato", 10, 1000);
            Torta tortaCrema = new TortaAllaCrema("Crema", 12, 800);
            Torta tortaPistacchio = new TortaAlPistacchio("Pistacchio", 15, 600);
            System.out.println("Test 2: Creazione Torte - OK");

            // Aggiunta delle torte alla pasticceria
            pasticceria.aggiungiTorta(tortaCioccolato);
            pasticceria.aggiungiTorta(tortaCrema);
            pasticceria.aggiungiTorta(tortaPistacchio);
            System.out.println("Test 3: Aggiunta Torte - OK");

            // Test vendita torta
            pasticceria.venditaTorta("Cioccolato");
            System.out.println("Test 4: Vendita Torta Cioccolato - OK");
            System.out.println("Quantità restante di Cioccolato: " + tortaCioccolato.getQuantitaRestante());

            // Test vendita torta non esistente
            try {
                pasticceria.venditaTorta("Fragola");
                System.out.println("Test 5: Vendita Torta Fragola - NO");
            } catch (IllegalArgumentException e) {
                System.out.println("Test 5: Vendita Torta Fragola - OK");
            }

            // Test stampa torte disponibili
            pasticceria.stampaTorteDisponibili();
            System.out.println("Test 6: Stampa Torte Disponibili - OK");

            // Test aggiunta torta oltre la capacità
            Torta tortaExtra = new TortaAlCioccolato("Extra", 20, 500);
            pasticceria.aggiungiTorta(tortaExtra);
            System.out.println("Test 7: Aggiunta Torta Extra - OK");

            // Test vendita torta con quantità zero
            for (int i = 0; i < 50; i++) {
                pasticceria.venditaTorta("Pistacchio");
            }
            System.out.println("Test 8: Vendita Torta Pistacchio fino a esaurimento - OK");
            System.out.println("Quantità restante di Pistacchio: " + tortaPistacchio.getQuantitaRestante());

            // Test vendita torta esaurita
            try {
                pasticceria.venditaTorta("Pistacchio");
                System.out.println("Test 9: Vendita Torta Pistacchio Esaurita - NO");
            } catch (IllegalArgumentException e) {
                System.out.println("Test 9: Vendita Torta Pistacchio Esaurita - OK");
            }

            // Test creazione pasticceria con capacità negativa
            try {
                Pasticceria pasticceriaInvalida = new Pasticceria(-1);
                System.out.println("Test 10: Creazione Pasticceria con Capacità Negativa - NO");
            } catch (IllegalArgumentException e) {
                System.out.println("Test 10: Creazione Pasticceria con Capacità Negativa - OK");
            }

        } catch (Exception e) {
            System.out.println("Errore durante l'esecuzione dei test: " + e.getMessage());
        }
    }
}