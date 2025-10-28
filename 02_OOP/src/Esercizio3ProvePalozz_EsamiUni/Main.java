package Esercizio3ProvePalozz_EsamiUni;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
    }

    public static void test1() {
        try {
            Studente s = new Studente(null, "Rossi", 123456);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test2() {
        try {
            Studente s = new Studente("Mario", "R", 123456);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test3() {
        try {
            Studente s = new Studente("Mario", "Rossi", -1);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test4() {
        try {
            Esame e = new Esame(null, 6);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test5() {
        try {
            Esame e = new Esame("P", 6);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test6() {
        try {
            Esame e = new Esame("Programmazione", 0);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test7() {
        try {
            Esame e = new Esame("Programmazione", 12);
            e.esameSostenuto(17, 20210913);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test8() {
        try {
            Esame e = new Esame("Programmazione", 12);
            e.esameSostenuto(30, 20190913);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test9() {
        try {
            Studente s = new Studente("Mario", "Rossi", 123456);
            s.aggiungiEsame(null);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }

    public static void test10() {
        try {
            Studente s = new Studente("Mario", "Rossi", 123456);
            Esame e = new Esame("Programmazione", 12);
            s.aggiungiEsame(e);
            e.esameSostenuto(30, 20210913);
            s.aggiungiEsame(e);
            System.out.println("no");
        } catch (IllegalArgumentException e) {
            System.out.println("ok");
        }
    }
}