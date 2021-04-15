package thundercode;

//Cargando el móvil

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P509 {
    public static void main(String[] args) {
        int columnes, files, altitud, resultados, minB;
        ArrayList<Integer> minimoBateria = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            files = scanner.nextInt();
            columnes = scanner.nextInt();
            for (int i = 0; i < files; i++) {
                resultados = 2;
                minB = 2;
                for (int j = 0; j < columnes; j++) {
                    altitud = scanner.nextInt();
                    resultados += altitud;
                    if (resultados < 2 && altitud < 0) {
                        while (altitud < 0) {
                            minB++;
                            altitud++;
                        }
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