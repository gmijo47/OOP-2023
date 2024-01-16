/*
Definirajte razred NebeskoTijelo sa sljedećim članovima: podatkovni članovi tipa double
BrzinaOkoOsi i BrzinaOkoSunca., konstruktor koji podatkovnim članovima daje
proslijeđene vrijednosti i metodu koja nadjačava metodu toString() ispisujući
podatkovne članove. Definirajte razrede Planet i Satelit izvedene iz razreda
NebeskoTijelo koji imaju dodatni podatkovni string član Naziv te im definirajte sljedeće
konstruktore sa jednim string i dva double parametra koji će dodijeliti vrijednosti
proslijeđenih argumenata nazivnu tijela i naslijeđenim podatkovnim članovima.
Definirajte dva objekta Zemlja i Mjesec tipova Planet i Satelit.
 */
public class Main {
    public static void main(String[] args) {
       Planet zemlja = new Planet("Zemlja", 465.1, 29780);
       Satelit mjesec = new Satelit("Mjesec",  0.0012,30000);
    }
}

class NebeskoTijelo{
    double brzinaokoose;
    double brzinaokosunca;

    public NebeskoTijelo(double brzinaokoose, double brzinaokosunca){
        this.brzinaokoose = brzinaokoose;
        this.brzinaokosunca = brzinaokosunca;
        System.out.printf(this.toString());
    }

    @Override
    public String toString() {
        return "NebeskoTijelo " + "brzinaokoose=" + brzinaokoose + ", brzinaokosunca=" + brzinaokosunca +'\n';
    }
}

class Planet extends NebeskoTijelo{
    String naziv;

    public Planet(String naziv, double brzinaokoose, double brzinaokosunca){

        super(brzinaokoose, brzinaokosunca);
        this.naziv = naziv;

    }

}
class Satelit extends NebeskoTijelo{
    String naziv;

    public Satelit(String naziv, double brzinaokoose, double brzinaokosunca){

        super(brzinaokoose, brzinaokosunca);
        this.naziv = naziv;

    }

}