package thundercode;
//https://github.com/MiYazJE/Acepta-el-reto/blob/master/p471.java

import java.util.Scanner;

public class SP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int i1, i2;
        for (int i = 0; i < casos; i++) {
            i1 = sc.nextInt();
            i2 = sc.nextInt();
            int dif1 = Math.abs(i1 - i2) + (360 - i2);
            int dif2 = (360 - i2) + i1;
            if (dif1 == dif2) {
                System.out.println("DA IGUAL");
            }
            if (dif1 < dif2) {
                System.out.println("ASCENDENTE");
            } else {
                System.out.println("DESCENDENTE");
            }
        }
        sc.close();
    }
}