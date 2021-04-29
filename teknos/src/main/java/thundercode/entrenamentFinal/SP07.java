package thundercode.entrenamentFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class SP07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        ArrayList<Boolean> r = new ArrayList<>();
        ArrayList<Boolean> a = new ArrayList<>();
        ArrayList<Boolean> v = new ArrayList<>();
        String linia;
        while(sc.hasNext()){
            int ir = 0;
            int ia = 0;
            int iv = 0;
            linia = sc.nextLine();
            count = 0;
            for (int i = 0; i < linia.length(); i++) {
                r.add(false);
                a.add(false);
                v.add(false);
                if(linia.charAt(i) == 'R'){
                    r.set(ir, true);
                    ir++;
                } else if(linia.charAt(i) == 'A'){
                    if(r.get(ia)){
                        a.set(ia, true);
                        ia++;
                    }
                } else if(linia.charAt(i) == 'V'){
                    if(a.get(iv)){        
                        v.set(iv, true);
                        iv++;
                        count++;
                    }
                }
            }
            System.out.println(count);
            r.clear();
            a.clear();
            v.clear();
        }
    }
}