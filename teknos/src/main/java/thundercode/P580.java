package thundercode;

import java.util.HashMap;
import java.util.Scanner;

//Foto con Mafalda

public class P580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String nom;
        HashMap<String, Integer> psjs = new HashMap<>();
        while((num = sc.nextInt()) != 0){
            for (int i = 0; i < num; i++) {
                nom = sc.next();
                if (!psjs.containsKey(nom)) psjs.put(nom, 1);
                else psjs.put(nom, psjs.get(nom) + 1);
                if (psjs.size() >= 3 && psjs.containsKey("Mafalda")) {
                    psjs.keySet()
                }
            }
        }
        sc.close();
    }
}
