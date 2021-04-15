package thundercode;

//Primo de riesgo
import java.util.Scanner;

public class P210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, times = sc.nextInt();
        String item;
        sc.nextLine();
        for (int i = 0; i < times; i++) {
            item = sc.nextLine();
            if(item.length() > 50) break;
            for (char c : item.toCharArray()) total += (int) c;
            System.out.println(total);
            while (!esPrim(total)) --total;
            System.out.println(total);
            total = 0;
        }
        sc.close();
    }
    
    public static boolean esPrim(int numero) {
        int contador = 0;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) contador++;
            if (contador > 0) return false;
        }
        return true;
    }
}