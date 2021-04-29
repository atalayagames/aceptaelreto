package thundercode.entrenament;

//Primo de riesgo
//Inspirat en https://github.com/MiYazJE/Acepta-el-reto/blob/master/p210.java
import java.util.Scanner;

public class P210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, times = sc.nextInt();
        int[] nPrimers = new int[6100];
        nPrimers = calcularPrims(nPrimers);
        String item;
        sc.nextLine();
        for (int i = 0; i < times; i++) {
            item = sc.nextLine();
            total = 0;
            //if(item.length() > 50) break;
            for (int j = 0; j < item.length(); j++) total += item.charAt(j);
            System.out.println(getLower(nPrimers, total));
        }
        sc.close();
    }
    public static int getLower(int[] nPrimers, int index) {
        for (int i = index-1; i >= 0; i--) if (nPrimers[i] != 0) return i;
        return -1;
    }
    public static int[] calcularPrims(int[] nPrimers) {
        boolean esPrimer;
        int temp;
        for (int i = 48; i < 6100; i++) {
            temp = (int) Math.sqrt(i) + 1;
            esPrimer = true;
            while (temp > 1) {
                if (i % temp == 0) {
                    esPrimer = false;
                    break;
                }
                temp--;
            }
            if (esPrimer) nPrimers[i]++;
        }
        return nPrimers;
    }
}