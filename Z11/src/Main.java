class Kugla extends GeometriskoTijelo{

    double poluprecnik;
    public Kugla(double poluprecnik) {

        super(((4.0/3)*Math.pow(poluprecnik, 3) * Math.PI), (4*Math.pow(poluprecnik, 2) * Math.PI));
        this.poluprecnik = poluprecnik;

    }
}
class Kvadar extends GeometriskoTijelo{
    double a;
    double b;
    double c;
    public Kvadar(double a, double b, double c) {
        super(a*b*c, 2*((a*b)+(a*c)+(b*c)));
        this.a = a;
        this.b = b;
        this.c = c;
    }

}

class Kocka extends Kvadar{

    double a;
    public Kocka(double a){
        super(a, a, a);
        this.a = a;

    }
}
public class Main {
    public static void main(String[] args) {
       Kugla kugla = new Kugla(10);
       Kvadar kvadar = new Kvadar(5, 3, 4);
       Kocka kocka = new Kocka(5);

    }
}
class GeometriskoTijelo{
    static int brojacTijela = 0;
    double volumen;
    double oplosje;

    public GeometriskoTijelo(double volumen, double oplosje){
        this.oplosje = oplosje;
        this.volumen = volumen;
        brojacTijela++;
        System.out.printf(this.toString());
    }

    @Override
    public String toString() {
        return "Tjelo površine " + this.oplosje + " i volumena " + this.volumen + "\n";
    }
}
