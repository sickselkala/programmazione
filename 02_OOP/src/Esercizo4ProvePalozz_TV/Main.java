package Esercizo4ProvePalozz_TV;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di un oggetto Panasonic
            Panasonic tv = new Panasonic(15, "Full-HD", 32, "Panasonic TX-32");

            // Stampa delle informazioni iniziali del TV
            System.out.println(tv);

            // Impostazione dei canali
            tv.setCanale(1, 560);
            tv.setCanale(2, 570);
            tv.setCanale(3, 580);
            tv.setCanale(4, 590);
            tv.setCanale(5, 600);
            tv.setCanale(6, 610);
            tv.setCanale(7, 620);
            tv.setCanale(8, 630);
            tv.setCanale(9, 640);
            tv.setCanale(10, 650);
            tv.setCanale(11, 660);
            tv.setCanale(12, 670);
            tv.setCanale(13, 680);
            tv.setCanale(14, 690);
            tv.setCanale(15, 700);
            //tv.setCanale(16, 710); // Questo dovrebbe lanciare un'eccezione

            // Stampa delle informazioni del TV dopo l'impostazione dei canali
            System.out.println(tv);

            // Test per verificare l'eccezione CanaliSovrapposti
            try {
                tv.setCanale(4, 570); // Questa dovrebbe lanciare un'eccezione
            } catch (CanaliSovrapposti e) {
                System.out.println("Eccezione catturata: " + e.getMessage());
            }

            // Test per verificare l'eccezione IllegalArgumentException
            try {
                tv.setCanale(5, 800); // Questa dovrebbe lanciare un'eccezione
            } catch (IllegalArgumentException e) {
                System.out.println("Eccezione catturata: " + e.getMessage());
            }

            // Test per verificare l'eccezione IllegalStateException
            try {
                tv.setCanale(16, 710); // Questa dovrebbe lanciare un'eccezione
            } catch (IllegalStateException e) {
                System.out.println("Eccezione catturata: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Errore durante la creazione del TV: " + e.getMessage());
        }
    }
}