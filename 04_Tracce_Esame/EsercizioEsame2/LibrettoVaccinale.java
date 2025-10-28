

package EsercizioEsame2;

public class LibrettoVaccinale{
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mario", 30, 0, 0, "");
        Persona persona2 = new Persona("Luisa", 65, 1, 0, "");
        Persona persona3 = new Persona("Giovanni", 25, 0, 0, "");
        Persona persona4 = new Persona("Anna", 18, 1, 0, "");
        Persona persona5 = new Persona("Carlo", 40, 0, 0, "");

        // Creazione dei vaccini
        VaccinoA vaccinoA1 = new VaccinoA(1001, "Azienda1", 30);
        VaccinoB vaccinoB1 = new VaccinoB(2001, "Azienda2", 60, "Orale");

        // Somministrazione delle dosi
        try {
            persona1.eseguiDose(vaccinoA1); // Mario (30) riceve VaccinoA
        } catch (RuntimeException e) {
            StdOut.println("Errore per " + persona1.getNome() + ": " + e.getMessage());
        }

        try {
            persona2.eseguiDose(vaccinoB1); // Luisa (65) riceve VaccinoB
        } catch (RuntimeException e) {
            StdOut.println("Errore per " + persona2.getNome() + ": " + e.getMessage());
        }

        try {
            persona3.eseguiDose(vaccinoA1); // Giovanni (25) riceve VaccinoA
        } catch (RuntimeException e) {
            StdOut.println("Errore per " + persona3.getNome() + ": " + e.getMessage());
        }

        try {
            persona4.eseguiDose(vaccinoA1); // Anna (18) riceve VaccinoB
        } catch (RuntimeException e) {
            StdOut.println("Errore per " + persona4.getNome() + ": " + e.getMessage());
        }

        try {
            persona5.eseguiDose(vaccinoA1); // Carlo (40) riceve VaccinoA
        } catch (RuntimeException e) {
            StdOut.println("Errore per " + persona5.getNome() + ": " + e.getMessage());
        }

        // Stampa degli elenchi delle persone
        StdOut.println("Elenco di persona1:");
        persona1.stampaElenco(persona1);

        StdOut.println("\nElenco di persona2:");
        persona2.stampaElenco(persona2);

        StdOut.println("\nElenco di persona3:");
        persona3.stampaElenco(persona3);

        StdOut.println("\nElenco di persona4:");
        persona4.stampaElenco(persona4);

        StdOut.println("\nElenco di persona5:");
        persona5.stampaElenco(persona5);
    }
}