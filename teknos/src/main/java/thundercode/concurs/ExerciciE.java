package thundercode.concurs;
import java.util.Scanner;

public class ExerciciE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean be = true;
        int casos;
        int temp;
        int cont = 0;

        casos = sc.nextInt();
        while (casos != 0) {
            for (int i = 0; i < casos; i++) {
                temp = sc.nextInt();
                if (be && temp <= 4) {
                    be = false;
                    cont += 1;
                }
                if (temp > 6) be = true;

            }
            System.out.println(cont);
            casos = sc.nextInt();
            cont = 0;
            be = true;
        }
    }
}
