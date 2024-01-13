import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite vašu email adresu\n");
        if(new Scanner(System.in).nextLine().matches("^[A-z0-9\\.\\-]+@([A-z0-9]+\\.)+([A-z]{2,})")){
            System.out.println("Email validan!");
        }else{
            System.out.println("Email nije validan!");
        }
    }
}