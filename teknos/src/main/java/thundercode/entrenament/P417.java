package thundercode.entrenament;

//Nana al bebé de papá y mamá

import java.util.Scanner;

public class P417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paraula;
        boolean esRepeteix;
        int tamany, posicio;
        while (sc.hasNext()) {
            paraula = sc.next().toUpperCase();
            tamany = 0;
            esRepeteix = true;
            for (int i = 0; i < paraula.length() / 2; i++) {
                esRepeteix = true;
                posicio = 0;
                for (int j = i + 1; j < paraula.length(); j++) {
                    if (paraula.charAt(posicio) != paraula.charAt(j)) { 
                        esRepeteix = false; 
                        break;
                    }
                    posicio = ++posicio % (i + 1);
                }
                if (esRepeteix) {
                    tamany = ++i;
                    break;
                }
            }
            System.out.println((esRepeteix && tamany > 0 && paraula.length() % tamany == 0) ? tamany : paraula.length());
        }
        sc.close();
    }
}