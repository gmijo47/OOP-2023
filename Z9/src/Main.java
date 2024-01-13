import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static int br = 3;
    public static void main(String[] args) {
        ArrayList<String> pstud = new ArrayList<>();
        System.out.println("Unosite u formatu \nIme\nocjena");
        for(int i = 0; i < br; i++){
            String ime = new Scanner(System.in).nextLine();
            int ocj = new Scanner(System.in).nextInt();
            if(ocj > 1){
                pstud.add(ime);
            }
        }
        Collections.sort(pstud);
        System.out.println("Polozili su:\n");
        for(String s: pstud){
            System.out.println(s+" \n");
        }
    }
}