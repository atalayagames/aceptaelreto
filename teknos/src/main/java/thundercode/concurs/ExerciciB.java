package thundercode.concurs;

import java.util.*;
public class ExerciciB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linia;
        List<String> casos;
        while (!(linia = sc.nextLine()).equals(".")) {
            int v = 0;
            int i = 0;
            casos = Arrays.asList(linia.split(" "));
            for (String c: casos) {
                switch (c){
                    case "A":
                        v++;
                        i++;
                        break;
                    case "V":
                        v++;
                        break;
                    case "I":
                        i++;
                        break;
                }
            }
            if (v < i) System.out.println("INVIERNO");
            else if (v > i) System.out.println("VERANO");
            else System.out.println("EMPATE");
        }
    }
}