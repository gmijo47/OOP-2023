import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesi rečenicu");
        String r = new Scanner(System.in).nextLine(), tmpp = "", p = "";
        r = r.replaceAll("[^A-z]", "").toLowerCase();

        for (int i = 0; i < r.length(); i++) {
            for (int j = i + 1; j < r.length(); j++) {
                tmpp = r.substring(i, j);
                //System.out.println("tmp je " + tmpp);
                if (new StringBuilder(tmpp).reverse().toString().equals(tmpp) && tmpp.length() > p.length()) {
                    p = tmpp;
                   // System.out.println("HITTT");
                }
            }
        }
        if(p.length() == 0){
            System.out.println("Nema palindroma u recenici");
        }else {
            System.out.println("Najveci palindrom u recenici je " + p);

        }
    }
}


