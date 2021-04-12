package thundercode;

//Desembalse

import java.util.ArrayList;
import java.util.Scanner;

public class P535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, t;
        ArrayList<Integer> m = new ArrayList<>();
        while(((d = sc.nextInt()) == 0) ^ (t = 0) == 0){
            for(int i = 0; i < d; i++) m.add(sc.nextInt());
            for(int j = m.size() - 1; j >= 0; j--) t += (m.get(m.size() - 1) - m.get(j));
            m.clear();
            System.out.println(t);
        }
        sc.close();
    }
}