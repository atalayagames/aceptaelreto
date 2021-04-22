package thundercode;

//Cucharadas de sopa

import java.util.Scanner;

public class P577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt(), primer, segon, tercer;
        int[] array = new int[times];
        for (int i = 0; i < times; i++) {
            primer = sc.nextInt();
            segon = sc.nextInt();
            tercer = sc.nextInt();
            array[i] = ((tercer - segon) >= primer ? tercer - segon : tercer - primer + 1);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}