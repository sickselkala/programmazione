package EsercizioEsame7;

public class Main {
    public static void main(String[] args) {
        // Creazione di un treno con 4 vagoni
        Treno treno = new Treno(5);

        // Aggiunta di una locomotiva con 600 cavalli e 2000 kg di peso
        try {
            Locomotiva locomotiva1 = new Locomotiva(5000, 2000);
            if (treno.add(locomotiva1)) {
                System.out.println("Locomotiva 1 aggiunta con successo.");
            } else {
                System.out.println("Aggiunta della locomotiva fallita.");
            }
            Locomotiva locomotiva2 = new Locomotiva(5000, 2000);
            if (treno.add(locomotiva2)) {
                System.out.println("Locomotiva 2 aggiunta con successo.");
            } else {
                System.out.println("Aggiunta della locomotiva fallita.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Aggiunta di tre carrozze
        try {
            Carrozza carrozza1 = new Carrozza(60, 1500);
            if (treno.add(carrozza1)) {
                System.out.println("Carrozza 1 aggiunta con successo.");
            } else {
                System.out.println("Aggiunta della carrozza 1 fallita.");
            }

            Carrozza carrozza2 = new Carrozza(120, 1600);
            if (treno.add(carrozza2)) {
                System.out.println("Carrozza 2 aggiunta con successo.");
            } else {
                System.out.println("Aggiunta della carrozza 2 fallita.");
            }

            Carrozza carrozza3 = new Carrozza(80, 1400);
            if (treno.add(carrozza3)) {
                System.out.println("Carrozza 3 aggiunta con successo.");
            } else {
                System.out.println("Aggiunta della carrozza 3 fallita.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Verifica del peso totale e dei cavalli delle locomotive
        if (treno.check()) {
            System.out.println("I cavalli delle locomotive sono sufficienti per il peso totale del treno.");
        } else {
            System.out.println("I cavalli delle locomotive non sono sufficienti per il peso totale del treno.");
        }

        // Calcolo del numero totale di passeggeri
        int passeggeri = treno.passeggeri();
        System.out.println("Numero totale di passeggeri: " + passeggeri);
    }
}
