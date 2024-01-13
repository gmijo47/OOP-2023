import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
     static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static void main(String[] args) {
        String ime, dat;
        Long days;
        LocalDate bday, now;
        System.out.println("Unesite ime i prezime:");
        ime = new Scanner(System.in).nextLine();
        System.out.println("Unesite datum rođenja u formatu dd.mm.yyyy");
        do{
            try{
                dat = new Scanner(System.in).nextLine();
                 bday = LocalDate.parse(dat, dft);
                break;
            }catch (Exception e){
                System.out.println("Neispravan format, ponovo unesi!");
            }
        }while(true);
        now = LocalDate.now();
        System.out.println("Pozdrav " + ime);
        if(now.isBefore(bday.withYear(now.getYear()))){
            days = Duration.between(now.atStartOfDay(), bday.withYear(now.getYear()).atStartOfDay()).toDays();
        }else{
            days = Duration.between(now.atStartOfDay(), bday.withYear(now.getYear()+1).atStartOfDay()).toDays();
        }
        System.out.println("Do rođendana je ostalo " + days + " dana!");

    }

}