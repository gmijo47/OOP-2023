import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Test
        String imena[] = new String[10];
        String i_imena[] = new String[10];
        String r_imena[] = new String[10];
        for (int i = 0; i < 10; i++) {
            imena[i] = new Scanner(System.in).nextLine();
        }
        int i = 0, j = 0;
        for(String s: imena){
            if(s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length()-1)){
                i_imena[i++] = s;
            }else {
                r_imena[j++] = s;
            }
        }
        for(int ii = 0; ii < i; ii++){
            System.out.println(i_imena[ii]);
        }
        System.out.println("\n\n");
        for(int jj = 0; jj < j; jj++){
            System.out.println(r_imena[jj]);
        }
    }

}