import java.util.Arrays;

abstract class Racunalo{
    private String model;
    private String proizvodac;
    private String os;
    public Racunalo(String model, String proizvodac, String os){
        this.os = os;
        this.model = model;
        this.proizvodac = proizvodac;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    @Override
    public String toString() {
        return "\nModel " + model + "\nProizvodac " + proizvodac +  "\nOS " + os ;
    }

    abstract String dohvatiTipRacunala();
    abstract int izracunajPrenosivost();
}
class StonoRacunalo extends Racunalo{
   private int[] dimenzije;

    public StonoRacunalo(String model, String proizvodac, String os, int dimenzije[]) {
        super(model, proizvodac, os);
        this.dimenzije = dimenzije;
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getProizvodac() {
        return super.getProizvodac();
    }

    @Override
    public String getOs() {
        return super.getOs();
    }

    public int[] getDimenzije() {
        return dimenzije;
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setProizvodac(String proizvodac) {
        super.setProizvodac(proizvodac);
    }

    @Override
    public void setOs(String os) {
        super.setOs(os);
    }

    public void setDimenzije(int[] dimenzije) {
        this.dimenzije = dimenzije;
    }

    @Override
    public String toString() {
        return "Dimenzije " + Arrays.toString(dimenzije) + super.toString();
    }

    String dohvatiTipRacunala() {
        return "StonoRacunalo";
    }

    int izracunajPrenosivost() {
        return (5+((dimenzije[0]*dimenzije[1]*dimenzije[2])/30));
    }

}

class PrijenosnoRacunalo extends Racunalo{
    private int kapacitetBat;
    private double tezina;

    public PrijenosnoRacunalo(String model, String proizvodac, String os, double tezina, int kapacitetBat) {
        super(model, proizvodac, os);
        this.tezina = tezina;
        this.kapacitetBat = kapacitetBat;
    }

    @Override
    public String getProizvodac() {
        return super.getProizvodac();
    }

    @Override
    public void setProizvodac(String proizvodac) {
        super.setProizvodac(proizvodac);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getOs() {
        return super.getOs();
    }

    @Override
    public void setOs(String os) {
        super.setOs(os);
    }

    public void setKapacitetBat(int kapacitetBat) {
        this.kapacitetBat = kapacitetBat;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public int getKapacitetBat() {
        return kapacitetBat;
    }

    @Override
    public String toString() {
        return "Težina "+ tezina + "\nKapacitet baterija " + kapacitetBat +"mAh" + super.toString();
    }

    String dohvatiTipRacunala() {
        return "PrijenosnoRacunalo";
    }
    int izracunajPrenosivost() {
        return (int) tezina;
    }
}
final class Netbook extends PrijenosnoRacunalo{

    public Netbook(String model, String proizvodac, String os, double tezina, int kapacitetBat) {
        super(model, proizvodac, os, tezina, kapacitetBat);
    }

    @Override
    public String getProizvodac() {
        return super.getProizvodac();
    }

    @Override
    public String getOs() {
        return super.getOs();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setProizvodac(String proizvodac) {
        super.setProizvodac(proizvodac);
    }

    @Override
    public void setOs(String os) {
        super.setOs(os);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    int izracunajPrenosivost() {
        return 1;
    }
    @Override
    public String toString() {
        return  super.toString();
    }

    @Override
    String dohvatiTipRacunala() {
        return "Netbook";
    }
}

public class Main {
    public static void main(String[] args) {
       StonoRacunalo stonoRacunalo = new StonoRacunalo("Optixel", "Dell", "Windows 95", new int[]{20, 30, 60});
       System.out.println(stonoRacunalo.dohvatiTipRacunala() +"\nPrenosivost:" + stonoRacunalo.izracunajPrenosivost()+ " \n" + stonoRacunalo.toString() +"\n\n");
       PrijenosnoRacunalo prijenosnoRacunalo = new PrijenosnoRacunalo("ROG", "Asus", "Parrot OS", 3.3, 32700);
       System.out.println(prijenosnoRacunalo.dohvatiTipRacunala() +"\nPrenosivost:" + prijenosnoRacunalo.izracunajPrenosivost()+ " \n" + prijenosnoRacunalo.toString() +"\n\n");
       Netbook netbook = new Netbook("Netbx1", "GBRD", "VMware", 0.3, 12000);
       System.out.println(netbook.dohvatiTipRacunala() +"\nPrenosivost:" + netbook.izracunajPrenosivost()+ " \n" + netbook.toString() +"\n\n");

    }
}