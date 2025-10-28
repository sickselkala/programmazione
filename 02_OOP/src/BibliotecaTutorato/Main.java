package BibliotecaTutorato;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni libri
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", false);
        Libro libro2 = new Libro("1984", "George Orwell", false);
        Libro libro3 = new Libro("Il Grande Gatsby", "F. Scott Fitzgerald", false);
        Libro libro4 = new Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", false);
        Libro libro5 = new Libro("TRUE", "George Orwell", false);
        Libro libro6 = new Libro("FALSE", "George Orwell", false);

        // Creazione di una biblioteca con capacità di 5 libri
        Biblioteca biblioteca = new Biblioteca(5);

        // Aggiunta dei libri alla biblioteca
        System.out.println("Aggiunta libro 1: " + biblioteca.aggiungiLibro(libro1)); // true
        System.out.println("Aggiunta libro 2: " + biblioteca.aggiungiLibro(libro2)); // true
        System.out.println("Aggiunta libro 3: " + biblioteca.aggiungiLibro(libro3)); // true
        System.out.println("Aggiunta libro 4: " + biblioteca.aggiungiLibro(libro4)); // true
        System.out.println("Aggiunta libro 5: " + biblioteca.aggiungiLibro(libro5)); // true
        System.out.println("Aggiunta libro 6: " + biblioteca.aggiungiLibro(libro6)); // false

        // Prestito di un libro
        System.out.println("Prestito libro 1: " + biblioteca.prestaLibro("Il Signore degli Anelli")); // true
        System.out.println("Prestito libro 1 di nuovo: " + biblioteca.prestaLibro("Il Signore degli Anelli")); // false
        System.out.println("Prestito libro 2: " + biblioteca.prestaLibro("1984")); // true

        // Restituzione di un libro
        System.out.println("Restituzione libro 1: " + biblioteca.restituisciLibro("Il Signore degli Anelli")); // true
        System.out.println("Restituzione libro 2: " + biblioteca.restituisciLibro("1984")); // true

        // Tentativo di prestito di un libro non presente
        System.out.println("Prestito libro non presente: " + biblioteca.prestaLibro("Non Esiste")); // false

    }
}