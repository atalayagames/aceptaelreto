package thundercode;

import java.util.Scanner;
import java.util.Vector;

public class SP62 {
    public static Vector<Integer> R = new Vector<>();
    public static Vector<Integer> L = new Vector<>();
    public static Vector<Integer> reverse(int i1, int i2, Vector<Integer> Txd){
        int temp = Txd.get(i1);
        Txd.set(i1, Txd.get(i2));
        Txd.set(i2, temp);
        return Txd;
    }
    public static char flip(char side){
        return side == 'L' ? 'R' : 'L';
    }
    public static void split(int target, char side){
        int power3 = 1;
        while (power3 < target) power3 *= 3;
        if (target == power3) {
            if(side == 'L') L.add(target); 
            else R.add(target); 
            return;
        }
        if (target <= power3 / 2) {
            if(side=='L') L.add(power3/3); 
            else R.add(power3/3); 
            split(target - power3 / 3, side);
        }
        else {
            if(side=='L') L.add(power3); 
            else R.add(power3); 
            split(power3 - target, flip(side)); 
        }
    }
    public static void main(String[] args) {
        int target;
        Scanner sc = new Scanner(System.in);
        while((target = sc.nextInt()) != 0)
        {
            split(target, 'L');
            L = reverse(0, L.size() - 1, L);
            R = reverse(0, R.size() - 1, R);
            for(int a: L) {
                System.out.print(a + " ");
            }
            System.out.print("==X== ");
            for(int b: R) {
                System.out.print(b + " ");
            }
            System.out.println("patatas");
            R.clear();
            L.clear();
        }
    }
}