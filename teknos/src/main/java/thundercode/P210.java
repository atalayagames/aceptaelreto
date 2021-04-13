package thundercode;

//Primo de riesgo

import java.util.Scanner;

public class P210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(primProper(sc.nextLine()));
        }
        sc.close();
    }
    public static int primProper(String item) {
        int total = 0;
        for (char c : item.toCharArray()) total += (int) c;
        while(!esPrim(total)) --total;
        return total;
    }
    public static boolean esPrim(int numero){
        int contador = 0;
        for(int i = numero; i > 0; i--) if(numero % i == 0) contador++;
        return contador == 2;
    }
}