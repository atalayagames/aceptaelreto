package thundercode;

//Cargando el móvil

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P509 {
    public static void main(String[] args) {
        int columnes, files;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> minimoBateria = new ArrayList<>(), resultados = new ArrayList<>(), altitud = new ArrayList<>();
        while (scanner.hasNextInt()) {
            columnes = scanner.nextInt();
            files = scanner.nextInt();
            for (int i = 0; i < files; i++) {
                resultados.add(i, 2);
                minimoBateria.add(i, 2);
                for (int j = 0; j < columnes; j++) {
                    altitud.add(j, scanner.nextInt());
                    resultados.set(i, resultados.get(i) + altitud.get(j));
                    if (resultados.get(i) < 2 && altitud.get(j) < 0)
                        while (altitud.get(j) < 0) {
                            minimoBateria.set(i, minimoBateria.get(i) + 1);
                            altitud.set(j, altitud.get(j) + 1);
                        }
                }
            }
            Collections.sort(minimoBateria);
            System.out.println(minimoBateria.get(0));
            minimoBateria.clear();
            resultados.clear();
            altitud.clear();
        }
        scanner.close();
    }
}