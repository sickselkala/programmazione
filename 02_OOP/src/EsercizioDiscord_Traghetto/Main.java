package EsercizioDiscord_Traghetto;

public class Main {
    public static void main(String[] args) {
        // Test Motorino class
        try {
            Motorino motorino1 = new Motorino(150.0, "AB123C", 125);
            Motorino motorino2 = new Motorino(200.0, "CD456E", 150);
            Motorino motorino3 = new Motorino(180.0, "EF789G", 175);

            // Invalid Motorino
            try {
                Motorino motorinoInvalid = new Motorino(-150.0, "GH012I", 125);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught expected exception for invalid Motorino: " + e.getMessage());
            }

            // Test Traghetto class
            Traghetto traghetto = new Traghetto("Traghetto1", 5000.0, 4);

            // Add Motorino to Traghetto
            System.out.println("Adding motorino1: " + traghetto.aggiungi(motorino1)); // Expected: true
            System.out.println("Adding motorino2: " + traghetto.aggiungi(motorino2)); // Expected: true
            System.out.println("Adding motorino3: " + traghetto.aggiungi(motorino3)); // Expected: false (capacity exceeded)

            // Test adding a duplicate Motorino
            System.out.println("Adding duplicate motorino1: " + traghetto.aggiungi(motorino1)); // Expected: false

            // Test removing Motorino
            System.out.println("Removing motorino1: " + traghetto.rimuovi("AB123C")); // Expected: true
            System.out.println("Removing non-existent motorino: " + traghetto.rimuovi("XYZ123")); // Expected: false

            // Test getPesoTotMotorini method
            System.out.println("Total weight of motorini: " + traghetto.getPesoTotMotorini()); // Expected: weight of motorino2

            // Test toString method
            System.out.println(traghetto.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
