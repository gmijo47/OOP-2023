import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Osoba> osobe = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            osobe.add(new Osoba(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));
        }
        Collections.sort(osobe, Comparator.comparing(o -> o.ime_prezime));
        for (Osoba o : osobe) {
            System.out.println(o);
        }
    }

    static class Osoba {
        String ime_prezime;
        String datumRodjenja;
        Osoba(String ime_prezime, String datumRodjenja) {
            this.ime_prezime = ime_prezime;
            this.datumRodjenja = datumRodjenja;
        }

        @Override
        public String toString() {
            return ime_prezime + " " + datumRodjenja;
        }
    }
}