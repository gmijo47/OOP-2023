import java.nio.DoubleBuffer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i =0;
        System.out.println("Unosite realne brojeve sve dok decimali dio ne bude 100 puta veći od cijelog");
        Scanner s = new Scanner(System.in);
        do{
            double d = s.nextDouble();
            a.add((int) d);
            i++;
            if((int) d < (100*(d- (int) d))){
                break;
            }
        }while(true);
        int brp = 0,   br = 0, tmpbrp = 0, tmpbr = 0;
        for(int j = 0; j<10; j++){
            tmpbr = j;
            tmpbrp = 0;
            for(int k = 0; k < i; k++){
                int pom = a.get(k);
                while(pom != 0){
                    if(pom % 10 == tmpbr){
                        tmpbrp++;
                    }
                    pom /=10;
                }
            }
            if(brp < tmpbrp){
                brp = tmpbrp;
                br = tmpbr;
            }
        }
        System.out.println("Znamenka koja se ponavlja najvise puta je " + br + " i to " + brp + " puta");
        for(i = 0; i < brp; i++){
            System.out.println(br);
        }

    }
}