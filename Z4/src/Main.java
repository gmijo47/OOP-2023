import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Unesi cijeli broj");
        System.out.println("U bazi 16 uneseni broj bi bio " + Integer.toHexString(new Scanner(System.in).nextInt()).toUpperCase());
    }
}