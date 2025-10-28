package EsercizioEsame4;

public class TestGioiello {
    public static void main(String[] args) {
        try {
            Pietra pietra1 = new Pietra(10, 5);
            Pietra pietra2 = new Pietra(20, 10);
            Oro oro1 = new Oro(15, 10);

            Gioiello gioiello = new Gioiello(3);
            System.out.println(gioiello.add(pietra1)); // true
            System.out.println(gioiello.add(pietra2)); // true
            System.out.println(gioiello.add(oro1)); // true
            System.out.println(gioiello.add(new Pietra(5, 2))); // false

            System.out.println(gioiello.CaratiPietre()); // 15
            System.out.println(gioiello.check()); // false

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
