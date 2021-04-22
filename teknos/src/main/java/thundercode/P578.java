package thundercode;

//Haciendo inventario

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class P578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int times = sc.nextInt();
            sc.nextLine();
            String linia;
            Set<String> productes = new HashSet<String>();
            if(times == 0) break;
            for (int i = 0; i < times; i++) {
                linia = sc.nextLine();
                productes.add(linia.toLowerCase());
            }
            System.out.println(productes.size());
        }
        sc.close();
    }
}