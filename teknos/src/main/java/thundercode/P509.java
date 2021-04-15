package thundercode;

//Cargando el móvil

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P509 {
    public static void main(String[] args) {
        int columnes, files, altitud, resultados, minB = 2;
        ArrayList<Integer> minimoBateria = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            files = scanner.nextInt();
            columnes = scanner.nextInt();
            for (int i = 0; i < files; i++) {
                for (int j = 0; j < columnes; j++) {
                    minB = 2;
                    resultados = 0;
                    altitud = scanner.nextInt();
                    resultados += altitud;
                    if (resultados < 2 && altitud < 0)
                        while (altitud < 0) {
                            minB++;
                            altitud++;
                        }
                }
                minimoBateria.add(i, minB);
            }
            System.out.println(Collections.min(minimoBateria));
            minimoBateria.clear();
        }
        scanner.close();
    }
}