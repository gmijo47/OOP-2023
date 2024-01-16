import java.util.Scanner;

/*Definirajte razred ProgramskiJezik sa sljedećim članovima: podatkovni član tipa double
postotak, metode za dohvaćanje i postavljenje člana postotak. Definirajte razrede
Proceduralni, Objektni i Funkcionalni izvedene od razreda ProgramskiJezik. Definirajte
tri objekta procedura, objekt i funkcija tipova Proceduralni, Objektni i Funkcionalni
redom, te zatražite od korisnika da unese vrijednosti postotka za pojedini objekt. Ako je
zbroj postotaka različit od 100 ispišite poruku o neispravnom unosu podataka i svaki od
unesenih podataka proporcionalno umanjite kako bi njihova zbojr iznosila 100. Nakon
toga odredite koja je vrsta programskih jezika je najzastupljenija.
*/
class ProgramskiJezik{
    double postotak;


    public double getPostotak() {
        return postotak;
    }

    public void setPostotak(double postotak) {
        this.postotak = postotak;
    }
}
class Objektni extends ProgramskiJezik{
}
class Proceduralni extends ProgramskiJezik{

}
class Funkcionalni extends ProgramskiJezik{

}
public class Main {
    public static void main(String[] args) {
        Objektni obj = new Objektni();
        System.out.println("Postotak za objektne\n");
        obj.setPostotak(new Scanner(System.in).nextDouble());
        Proceduralni proc = new Proceduralni();
        System.out.println("Postotak za proceduralne\n");
        proc.setPostotak(new Scanner(System.in).nextDouble());
        Funkcionalni fun = new Funkcionalni();
        System.out.println("Postotak za funkcionalne\n");
        fun.setPostotak(new Scanner(System.in).nextDouble());

        double uk = obj.getPostotak() + fun.getPostotak() + proc.getPostotak();

        if(uk != 100){
            System.out.println("Ukupni unos premašuje  ili je manji od 100%, popravljam automatski");
            obj.setPostotak(obj.getPostotak() * (100/uk));
            fun.setPostotak(fun.getPostotak() * (100/uk));
            proc.setPostotak(proc.getPostotak() * (100/uk));
        }
        if(obj.getPostotak() > fun.getPostotak() && obj.getPostotak() > proc.getPostotak()){
            System.out.println("Objektni wins! " + obj.getPostotak() + "%");
        } else if (fun.getPostotak() > obj.getPostotak() && fun.getPostotak() > proc.getPostotak()) {
            System.out.println("Funkcionalni wins! " + fun.getPostotak() + "%");
        }else {
            System.out.println("Proceduralni wins! " + proc.getPostotak() + "%");
        }

    }
}
