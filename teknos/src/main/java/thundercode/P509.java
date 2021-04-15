package thundercode;

//Cargando el móvil

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P509 {
    public static void main(String[] args) {
        int columnes, files;
        ArrayList<Integer> minimoBateria = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(!scanner.hasNextInt()){
                break;
            }
            columnes = scanner.nextInt();
            files = scanner.nextInt();
            for (int i = 0; i < files; i++) {
                int resultados = 2;
                minimoBateria.add(i, 2);
                for (int j = 0; j < columnes; j++) {
                    int altitud = scanner.nextInt();
                    resultados += altitud;
                    if (resultados < 2 && altitud < 0)
                        while (altitud < 0) {
                            minimoBateria.set(i, minimoBateria.get(i) + 1);
                            altitud++;
                        }
                }
            }
            Collections.sort(minimoBateria);
            System.out.println(minimoBateria.get(0));
            minimoBateria.clear();
        }
        scanner.close();
    }
}