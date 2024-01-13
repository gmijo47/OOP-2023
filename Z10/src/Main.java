import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int brbr = 8;
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> plist;
    int br = -1;
    for(int i = 0; i < brbr; i++){
        list.add(new Scanner(System.in).nextInt());
    }
    ;
        for(int i :list) {
            System.out.println(i +  " \n");
        }
        plist = new ArrayList<>(list);
        Collections.sort(plist);
        Collections.reverse(plist);
        for(int i:plist){
            if(i % 2  == 1){
                br = i;
                break;
            }
        }
        if(br != -1) {
           for(int i = 0; i < list.size(); i++){
               if((i+1) % 2 == 0 && (list.get(i) % 2 == 1)){
                   list.set(i, br);
               }
            }
            System.out.println("Zamjenjeno na parnim mjestima neparni brojevi sa najvecim neparmin\n");
           int m = 1;
            for(int i: list){
                if(m++ % 2 == 0 && i % 2 == 1){
                    System.out.println(i + " <--- here\n");

                }else {
                    System.out.println(i + "\n");

                }
            }
        }else {
            System.out.println("Nije unesen niti jedan neparni broj");
        }
    }


}