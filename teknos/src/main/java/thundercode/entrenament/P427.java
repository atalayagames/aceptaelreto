package thundercode.entrenament;

//Yo soy tu...

import java.util.Scanner;

public class P427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            String p1 = sc.next(), p2 = sc.next();
            if(p1.equals("Luke") && p2.equals("padre")){
                System.out.println("TOP SECRET");
            } else {
                System.out.printf("%s, yo soy tu %s%n", p1, p2);
            }
        }
        sc.close();
    }
}