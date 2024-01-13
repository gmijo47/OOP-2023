import java.util.*;

public class Main {
    static int br = 4;
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>();
        System.out.println("Unos u formatu\nIme prezime\nstudiji\ngodina\nbroj indexa");
        for (int i = 0; i < br; i++) {

            studenti.add(new Student(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
        }

        Collections.sort(studenti, Comparator.comparing(s -> s.god));
        Collections.sort(studenti, Comparator.comparing(s -> s.studij));

        System.out.println("\n\n");
        for (Student s : studenti) {
            System.out.println(s);
        }
    }


    static class Student {
        String ime_prezime;
        String studij;
        int god;
        int bridx;

        Student(String ime_prezime, String studij, int god, int bridx) {
            this.ime_prezime = ime_prezime;
            this.studij = studij;
            this.god = god;
            this.bridx = bridx;
        }

        @Override
        public String toString() {
            return studij + ", " + god + ", " + ime_prezime + ", " + bridx;
        }
    }
}
