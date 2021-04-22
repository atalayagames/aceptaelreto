package thundercode;

//Cucharadas de sopa

import java.util.Scanner;

public class P577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt(), primer, segon, tercer;
        for (int i = 0; i < times; i++) {
            primer = sc.nextInt();
            segon = sc.nextInt();
            tercer = sc.nextInt();
            System.out.println(Math.min(segon + 1, tercer - primer + 1));
        }
        sc.close();
    }
}