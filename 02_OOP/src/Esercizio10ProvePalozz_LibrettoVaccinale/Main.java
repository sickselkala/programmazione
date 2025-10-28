package Esercizio10ProvePalozz_LibrettoVaccinale;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni oggetti Vaccino
        VaccinoA vaccinoA1 = new VaccinoA(1, "AziendaA", 15);
        VaccinoB vaccinoB1 = new VaccinoB(2, "AziendaB", "Intramuscolare", 20);

        // Creazione di un oggetto Persona
        Persona persona1 = new Persona("Mario Rossi", 14, 0);

        // Test del metodo eseguiDose con VaccinoA
        try {
            persona1.eseguiDose(vaccinoA1);
            System.out.println("VaccinoA somministrato con successo.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Test del metodo eseguiDose con VaccinoB
        try {
            persona1.eseguiDose(vaccinoB1);
            System.out.println("VaccinoB somministrato con successo.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Test del metodo toString
        System.out.println(persona1.toString());
    }
}