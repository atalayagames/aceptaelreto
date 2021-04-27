package thundercode;

import java.util.ArrayList;
import java.util.Scanner;

public class SP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int pes;
        while((pes = sc.nextInt()) != 0){
            if(pes < 4){
                if(pes == 2){
                    System.out.println("1 ==X== 1 patatas");
                } else {
                    System.out.println(pes + " ==X== patatas");
                }
            } else {
                int big = findNearNumber(pes);
                /*int low = (int) Math.pow((big - pes) < 3 ? 3.0 : 1.0, (double)Math.round(Math.cbrt(big - pes)));
                int lowr = (int) Math.pow((big - pes) > 3 ? 3.0 : 1.0, (double)Math.round(Math.cbrt(big - pes)));
                System.out.println(lowr + "-----" + big + "-----" + low + " ==X== ");*/
                for (int i = 0; i < big; i++) {
                    for (int j = 0; j < pes; j++) {
                        if(pes > big){
                            break;
                        }
                    }
                }
            }
        }
    }
    public static int findNearNumber(int num){
        return (int) Math.pow(3.0, (double)Math.round(Math.cbrt(num)));
    }
}
