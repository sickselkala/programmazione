public class Libreria {     //libreria della classe libro
    private Libro[] scaffale;
    private int indice = 0;

    //Viene definito il costruttore della classe libreria richiedendo all'utente il numero di posizioni disponibili
    //per archiviare libri. Math.abs(n) consente di convertire anche il numero negativo inserito a positivo,
    //creando un arrey del numero inserito

    Libreria (int n){
        scaffale = new Libro[Math.abs(n)];
    }

    //metodo archivia. per inserire il libro (oggetto) nello scaffale (array)
    //Se il libro è inserito correttamente produce true, altrimenti false.

    public boolean archivia(Libro l){
        if (l == null) return false;
        if (indice < scaffale.length){
            scaffale[indice++] = l;
        }
        return true;
    }

    //metodo per stampare tutti i libri, void perche deve solo stampare
    //stamperò i libri presenti nello scaffale, quindi basandomi sull'indice a scorrere verranno stampati i titoli (.getTitolo)
    public void stampa(){
        for (int i = 0; i < indice; i++){
            StdOut.println(scaffale[i].getTitolo() +" "+scaffale[i].getAutore()+ " "+scaffale[i].getPagine()+ " ");
        }
    }

    //metodo ricerca
    public Libro trovaLibro(String t){
            for (int i = 0; i < indice; i++)
                if (scaffale[i].getTitolo().equals(t)) {
                    return scaffale[i];
                }
            return null;
    }

    //nel main vengono creati gli oggetti necessari, quindi la libreria e due libri di esempio.
    //tramite la funzione nomelibreria.funzionelibreria(nomelibro)
    //in memoria avremo un contenitore di riferimenti (nello stack) e un contenitore degli oggetti in memoria (nello heap)
    public static void main(String[] args) {
        Libreria cameretta = new Libreria(10);
        Libro x = new Libro ("George Orwell", "1984", 250);
        Libro x1 = new Libro ("TTB", "AAC", 110);
        cameretta.archivia(x);
        cameretta.archivia(x1);
        cameretta.stampa();
        Libro trovato = cameretta.trovaLibro("184");
        if (trovato != null){
            StdOut.println(trovato.getTitolo()+" è presente in libreria");
        }else throw new IllegalArgumentException("NESSUN LIBRO CERCATO è IN LIBRERIA");


    }
}
