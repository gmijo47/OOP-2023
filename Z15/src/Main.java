import javax.sound.midi.MidiMessage;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i< 6; i++){
            switch (new Random().nextInt(6)){
                case 0:{
                    new Knjiga(new Random().nextInt(1000), "Random knjiga", "Pero Peric");
                    break;
                }
                case 1:{
                    new Udzbenik(new Random().nextInt(1000), "Udzbenik random", "Ivo Maric", "Engleski");
                    break;
                }
                case 2:{
                    new Rijecnik(new Random().nextInt(1000), "Random rijecnik", "Neki lik", "engleski", "njemacki");
                    break;
                }
                case 3:{
                    new Casopois(new Random().nextInt(1000), "Caspois random", new Random().nextInt(1000), "random kategoraija");
                    break;
                }
                case 4:{
                    new E_Dokument(new Random().nextInt(1000), "Random edoc", "RandomTipPodatka");
                    break;
                }
                case 5:{
                    new DigiDokument(new Random().nextInt(1000),"Random digidoc", TipMedija.CD);
                    break;
                }
                case 6:{
                    new DigiDokument(new Random().nextInt(1000),"Random digidoc", TipMedija.VHS);
                    break;
                }
            }
        }
    }
}
interface Dokument{
    int dajPeriodPosudbe();
    boolean jeLiPotrebanPolog();
    int dajIznosPologa();
}
enum TipMedija{
    VHS,
    CD
}
class DokumentKnjiznice implements Dokument{

    private int ID;
    private String nazivDokumenta;
    public DokumentKnjiznice(int id, String naziv){
        this.ID = id;
        this.nazivDokumenta = naziv;
    }
     public int dajPeriodPosudbe(){
         if(this instanceof Udzbenik){
             return 14;
         }else if(this instanceof Knjiga){
             return 120;
         }else if(this instanceof Casopois){
             return 7;
         }else if(this instanceof E_Dokument || this instanceof DigiDokument){
             return 30;
         }
         return -1;
     }

    @Override
    public boolean jeLiPotrebanPolog() {
        return this instanceof Udzbenik || this instanceof E_Dokument || this instanceof DigiDokument;
    }

    @Override
    public int dajIznosPologa() {
        return new Random().nextInt(8, 40);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNazivDokumenta() {
        return nazivDokumenta;
    }

    public void setNazivDokumenta(String nazivDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
    }

    @Override
    public String toString() {
        return "DokumentKnjiznice: " + "\nID dokumenta: " + getID() + "\nNaziv dokumena:" + getNazivDokumenta() +
                "\nPolog:" + (this.jeLiPotrebanPolog() ? "Potreban" : "Nije potreban" ) + "\nIznos pologa: " + (this.jeLiPotrebanPolog() ? this.dajIznosPologa() : "Bez pologa") +
                "\nPeriod posudbe: " + dajPeriodPosudbe() + "\n";
    }
}
class Knjiga extends DokumentKnjiznice{
    private String autor;

    public Knjiga(int id, String naziv, String autor) {
        super(id, naziv);
        this.autor = autor;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Tip dokumetna knjiznice: Knjiga\nAutor: " + getAutor() + "\n\n";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
class Udzbenik extends Knjiga{
   private String predmet;

    public Udzbenik(int id, String naziv, String autor, String predmet) {
        super(id, naziv, autor);
        this.predmet = predmet;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Predment: " + getPredmet() + "\nTip knjige: Udzbenik\n\n\n";
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
class Rijecnik extends Knjiga{
    private String prviJezik;
    private String drugiJezik;

    public Rijecnik(int id, String naziv, String autor, String j1, String j2) {
        super(id, naziv, autor);
        this.drugiJezik = j2;
        this.prviJezik = j1;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Jezici: " + getPrviJezik() + " - " + getDrugiJezik() + "\nTip knjige: Rijecnik\n\n\n";
    }

    public void setDrugiJezik(String drugiJezik) {
        this.drugiJezik = drugiJezik;
    }

    public void setPrviJezik(String prviJezik) {
        this.prviJezik = prviJezik;
    }

    public String getDrugiJezik() {
        return drugiJezik;
    }

    public String getPrviJezik() {
        return prviJezik;
    }
}
class Casopois extends DokumentKnjiznice{
    int broj;
    String kategorijaSadrzaja;

    public Casopois(int id, String naziv, int izdanje, String kat) {
        super(id, naziv);
        this.broj = izdanje;
        this.kategorijaSadrzaja = kat;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Izdanje: " + getBroj() + "\nKategorija sadrzaja: " + getKategorijaSadrzaja() + "\nTip knjige: Casopis\n\n\n";
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getKategorijaSadrzaja() {
        return kategorijaSadrzaja;
    }

    public void setKategorijaSadrzaja(String kategorijaSadrzaja) {
        this.kategorijaSadrzaja = kategorijaSadrzaja;
    }
}
class DigiDokument extends DokumentKnjiznice{
    private TipMedija tip;

    public DigiDokument(int id, String naziv, TipMedija tip) {
        super(id, naziv);
        this.tip = tip;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Tip dokumetna knjiznice: Digitalni dokument\nTipMedija: " + getTip().toString() + "\n\n\n";
    }

    public void setTip(TipMedija tip) {
        this.tip = tip;
    }

    public TipMedija getTip() {
        return tip;
    }
}
class E_Dokument extends DokumentKnjiznice{
   private String tipPodatka;

    public E_Dokument(int id, String naziv, String tipPodatka) {
        super(id, naziv);
        this.tipPodatka = tipPodatka;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Tip dokumetna knjiznice: E dokument\nTip podatka: " + getTipPodatka() + "\n\n";
    }

    public void setTipPodatka(String tipPodatka) {
        this.tipPodatka = tipPodatka;
    }

    public String getTipPodatka() {
        return tipPodatka;
    }
}