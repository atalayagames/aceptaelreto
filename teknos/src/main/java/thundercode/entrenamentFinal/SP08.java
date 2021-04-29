package thundercode.entrenamentFinal;
//https://github.com/MiYazJE/Acepta-el-reto/blob/master/p471.java

import java.util.Scanner;

public class SP08 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int casos = s.nextInt();
        int pI, pF;

        for (int i = 0; i < casos; i++) {

            pI = s.nextInt();
            pF = s.nextInt();

            int dif = Math.abs(pI - pF);

            if (dif == 180 || dif == 360 || dif == 0) {
                System.out.println("DA IGUAL");
            } else {
                if (dif < 180) {
                    if (pI < pF)
                        System.out.println("ASCENDENTE");
                    else
                        System.out.println("DESCENDENTE");
                } else {
                    if (pI < pF)
                        System.out.println("DESCENDENTE");
                    else
                        System.out.println("ASCENDENTE");
                }
            }
        }
    }
}
