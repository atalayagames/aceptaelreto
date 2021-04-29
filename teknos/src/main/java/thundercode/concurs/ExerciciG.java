package thundercode.concurs;

import java.util.ArrayList;
import java.util.Scanner;
public class ExerciciG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        ArrayList<Integer> morts = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            int people = sc.nextInt();
            int ironman = sc.nextInt();
            int spiderman = sc.nextInt();
            int thanos = sc.nextInt() + 1;
            int cont = 0;
            while (cont <= people) {
                cont += thanos;
                morts.add(cont);
            }
            if(!morts.contains(ironman) && morts.contains(spiderman)){
                System.out.println("No quiero irme, Sr. Stark!");
            } else if(!morts.contains(spiderman) && morts.contains(ironman)) {
                System.out.println("No quiero irme, Peter!");
            } else {
                System.out.println("No hay abrazo");
            }
            morts.clear();
        }
    }
}
