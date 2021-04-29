package thundercode.entrenament;

//Reduciendo envases

import java.util.Scanner;

public class P532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int e1 = sc.nextInt(), e2 = sc.nextInt();
            System.out.println(e2 - e1);
        }
        sc.close();
    }
}