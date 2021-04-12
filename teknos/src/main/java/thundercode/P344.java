package thundercode;

//Conectando cables

import java.util.Scanner;

public class P344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times2, cH, cM, times = sc.nextInt();
        String cas;
        for (int i = 0; i < times; i++) {
            cH = 0;
            cM = 0;
            times2 = sc.nextInt();
            for (int j = 0; j < times2; j++) {
                cas = sc.next();
                cH += cas.split("H", -1).length - 1;
                cM += cas.split("M", -1).length - 1;
            }
            System.out.println(cH == cM ? "POSIBLE" : "IMPOSIBLE");
        }
        sc.close();
    }
}