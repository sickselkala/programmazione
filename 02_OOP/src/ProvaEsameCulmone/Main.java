package ProvaEsameCulmone;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di due insiemi
            Insieme insieme1 = new Insieme(5);
            Insieme insieme2 = new Insieme(5);

            // Aggiunta di elementi al primo insieme
            System.out.println("Aggiunta 1 a insieme1: " + insieme1.aggiungi(1)); // true
            System.out.println("Aggiunta 2 a insieme1: " + insieme1.aggiungi(2)); // true
            System.out.println("Aggiunta 3 a insieme1: " + insieme1.aggiungi(3)); // true

            // Aggiunta di elementi al secondo insieme
            System.out.println("Aggiunta 2 a insieme2: " + insieme2.aggiungi(2)); // true
            System.out.println("Aggiunta 3 a insieme2: " + insieme2.aggiungi(3)); // true
            System.out.println("Aggiunta 4 a insieme2: " + insieme2.aggiungi(4)); // true

            // Test del metodo contiene
            System.out.println("insieme1 contiene 2: " + insieme1.contiene(2)); // true
            System.out.println("insieme2 contiene 1: " + insieme2.contiene(1)); // false

            // Test del metodo inclusoIn
            System.out.println("insieme1 è incluso in insieme2: " + insieme1.inclusoIn(insieme2)); // false
            System.out.println("insieme2 è incluso in insieme1: " + insieme2.inclusoIn(insieme1)); // false

            // Test del metodo ugualeA
            System.out.println("insieme1 è uguale a insieme2: " + insieme1.ugualeA(insieme2)); // false

            // Test del metodo unione
            Insieme unione = insieme1.unione(insieme2);
            System.out.println("Unione di insieme1 e insieme2 contiene 1: " + unione.contiene(1)); // true
            System.out.println("Unione di insieme1 e insieme2 contiene 4: " + unione.contiene(4)); // true

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}