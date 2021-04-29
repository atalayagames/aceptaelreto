package thundercode.entrenament;

//Desembalse

import java.util.ArrayList;
import java.util.Scanner;

public class P535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dada, total;
        ArrayList<Integer> matriu = new ArrayList<>();
        while(((dada = sc.nextInt()) == 0) ^ (total = 0) == 0){
            for(int i = 0; i < dada; i++) matriu.add(sc.nextInt());
            for(int j = matriu.size() - 1; j >= 0; j--) total += (matriu.get(matriu.size() - 1) - matriu.get(j));
            matriu.clear();
            System.out.println(total);
        }
        sc.close();
    }
}