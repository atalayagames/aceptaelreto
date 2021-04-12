package thundercode;

//Espionaje en Navidad

import java.util.Scanner;

public class P364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linia;
        while(!(linia = sc.nextLine().trim().toUpperCase()).equals("FIN")){
            for(char c : linia.toCharArray()) System.out.print(c == 'Z' ? 'A' : (c == ' ' ? ' ' : (char)(int)(c + 1)));
            System.out.println();
        }
        sc.close();
    }
}