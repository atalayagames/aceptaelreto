package thundercode.entrenament;

//Foto con Mafalda

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, nfotos, mafaldas;
        String nom;
        HashMap<String, Integer> psjs = new HashMap<>();
        while((num = sc.nextInt()) != 0){
            mafaldas = nfotos = 0;
            for (int i = 0; i < num; i++) {
                nom = sc.next();
                if (!psjs.containsKey(nom)) psjs.put(nom, 1);
                else psjs.put(nom, psjs.get(nom) + 1);
                if (psjs.size() >= 3 && psjs.containsKey("Mafalda")) {
                    mafaldas++;
                    ArrayList<String> eliminables = new ArrayList<>();
                    ArrayList<String> reducibles = new ArrayList<>();
                    for (Map.Entry<String, Integer> m : psjs.entrySet()) {
                        nfotos++;
                        if (m.getValue() == 1) eliminables.add(m.getKey());
                        else reducibles.add(m.getKey());
                    }
                    for (String x : eliminables) psjs.remove(x);
                    for (String x : reducibles) psjs.put(x, psjs.get(x) - 1);
                }
            }
            System.out.println(mafaldas + " " + (num - nfotos));
            psjs.clear();
        }
        sc.close();
    }
}
