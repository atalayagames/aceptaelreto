package thundercode.entrenament;

//La botella ganadora

import java.util.Scanner;

public class P533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int limitASuperar = 0, numero = 0, contador = 0, index = 0;
        for (int i = 0; i < times; i++) {
            limitASuperar = sc.nextInt() * 8;
            while ((numero = sc.nextInt()) != 0) {
                index++;
                contador += numero;
                if (contador >= limitASuperar) {
                    sc.nextLine();
                    break;
                }
            }
            System.out.println(contador >= limitASuperar ? index : "SIGAMOS RECICLANDO" );
            index = 0;
            contador = 0;
        }
        sc.close();
    }
}