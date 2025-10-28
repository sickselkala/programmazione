package EsercizioEsame9;

public class Main {
    public static void main(String[] args) {
        //TEST DEGLI ESAMI
        Esame e1 = new Esame("Analisi", 12);
        Esame e2 = new Esame("Fisica", 9);
        Esame e3 = new Esame("Informatica", 6);
        Esame e4 = new Esame("Chimica", 9);

        e1.esameSostenuto(30, 20200606);
        e2.esameSostenuto(18, 20200606);
        e3.esameSostenuto(24, 20200606);
        e4.esameSostenuto(30, 20200606);

        //TEST DEGLI STUDENTI
        Studente s1 = new Studente("Mario", "Rossi", 12345);
        Studente s2 = new Studente("Luca", "Bianchi", 54321);

        s1.aggiungiEsame(e1);
        s1.aggiungiEsame(e2);
        s1.aggiungiEsame(e3);
        s1.aggiungiEsame(e4);

        s2.aggiungiEsame(e1);
        s2.aggiungiEsame(e2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
