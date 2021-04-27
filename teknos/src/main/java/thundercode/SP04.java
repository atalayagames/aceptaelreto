package thundercode;

import java.util.Scanner;

public class SP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < times; i++) {
            String[] linia = sc.nextLine().split(" es ");
            System.out.println(linia[0].toLowerCase().equals(linia[1].toLowerCase()) ? "TAUTOLOGIA" : "NO TAUTOLOGIA");
        }
        sc.close();
    }
}
