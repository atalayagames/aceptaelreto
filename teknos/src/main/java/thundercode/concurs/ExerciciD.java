package thundercode.concurs;
import java.util.Scanner;

public class ExerciciD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int contCopias, nCopias, cont;
        for (int i = 0; i < casos; i++) {
            s.nextLine();
            contCopias = 0;
            cont = 0;
            nCopias = s.nextInt();
            while (contCopias < nCopias) {
                if (contCopias <= 0) {
                    contCopias++;
                } else {
                    contCopias += contCopias;
                    cont++;
                }

            }
            System.out.println(cont);
        }
    }
}
