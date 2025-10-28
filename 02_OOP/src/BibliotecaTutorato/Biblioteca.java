package BibliotecaTutorato;

public class Biblioteca {
    private Libro[] libri;
    private int numeroLibri;
    private int capacitaBiblioteca;

    public Biblioteca(int capacitaBiblioteca) {
        if (capacitaBiblioteca < 1)
            throw new IllegalArgumentException("La capacita' della biblioteca non può essere minore di 1");
        this.capacitaBiblioteca = capacitaBiblioteca;
        this.numeroLibri = 0;
        libri = new Libro[capacitaBiblioteca];
    }

    public boolean aggiungiLibro(Libro libro) {
        for (int i = 0; i < capacitaBiblioteca; i++) {
            if (libri[i] == null) {
                libri[i] = libro;
                numeroLibri++;
                return true;
            }
        }
        return false;
    }

    public boolean prestaLibro(String titolo) {
        for (int i = 0; i < capacitaBiblioteca; i++) {
            if (this.libri[i] == null) {
                return false;
            }
            if (this.libri[i].getTitolo().equals(titolo)) {
                if (this.libri[i].isPrestato()) {
                    return false;
                } else {
                    this.libri[i].presta();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean restituisciLibro(String titolo) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null) {
                return false;
            }
            if (libri[i].getTitolo().equals(titolo)) {
                libri[i].restituisci();
                return true;
            }
        }
        return false;
    }

}