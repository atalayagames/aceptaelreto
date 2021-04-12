package thundercode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Cargando el móvil

public class P509 {
    public static void main(String[] args) {
        int c, f;
        Scanner s = new Scanner(System.in);
        ArrayList < Integer > m = new ArrayList < > (), r = new ArrayList < > (), a = new ArrayList < > ();
        while (s.hasNextInt()) {
            c = s.nextInt();
            f = s.nextInt();
            for (int i = 0; i < f; i++) {
                r.add(i, 2);
                m.add(i, 2);
                for (int j = 0; j < c; j++) {
                    a.add(j, s.nextInt());
                    r.set(i, r.get(i) + a.get(j));
                    if (r.get(i) < 2 && a.get(j) < 0)
                        while (a.get(j) < 0) {
                            m.set(i, m.get(i) + 1);
                            a.set(j, a.get(j) + 1);
                        }
                }
            }
            Collections.sort(m);
            System.out.println(m.get(0));
            m.clear();
            r.clear();
            a.clear();
        }
        s.close();
    }
}