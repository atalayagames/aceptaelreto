package thundercode;
import java.io.IOException;
import java.util.ArrayList;
//https://github.com/sweed33/AceptaElReto/blob/master/470%20Montando%20Semaforos
public class SP09 {

    static ArrayList<Character> a = new ArrayList<>();
    static int can;

    public static void main(String[] args) throws IOException {

        int n = System.in.read();
        int tot = 0;
        while(n!=-1){
            tot = 0;
            a.clear();
            can = 0;
            while (n >= 65 && n <= 122) {
                switch (n) {
                    case 82:
                        a.add('R');
                        can = 1;
                        break;
                    case 65:
                        a.add('A');
                        switch (can) {
                            case 2:
                                can = 0;
                                break;
                            case 1:
                                can = 2;
                                break;
                            default:
                                can = 0;
                                break;
                        }
                        break;
                    default:
                        a.add('V');
                        if (can == 2) {
                            can = 0;
                            tot++;
                            a.remove(a.size() - 1);
                            a.remove(a.size() - 1);
                            a.remove(a.size() - 1);
                            mirarAnteriores();
                        } else {
                            can = 0;
                        }

                        break;
                }
                n = System.in.read();
                if (n == 13) {
                    System.in.read();
                }
            }

            System.out.println(tot);
            n = System.in.read();
        };
    }

    private static void mirarAnteriores() {
        if (a.size() >= 1) {
            if (a.get(a.size() - 1) == 'R') {
                can = 1;
            }
        }

        if (a.size() >= 2) {
            if (a.get(a.size() - 2) == 'R' && a.get(a.size() - 1) == 'A') {
                can = 2;
            }
        }
    }

}
/*import java.util.Scanner;
public class SP09 {
    static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int max, n, temp;
        int n1, n2;
        boolean valid;
        while (s.hasNext()) {
            max = s.nextInt();
            n = s.nextInt();
            valid = true;
            temp = 0;
            n1 = s.nextInt();
            for (int i = 1; i < n; i++) {
                n2 = s.nextInt();
                if (n2 > n1) {
                    temp += Math.abs(n1 - n2);
                } else temp = 0;
                if (temp > max) {
                    valid = false; s.nextLine();
                    break;
                }
                n1 = n2;
            }
            System.out.println( (valid) ? "APTA" : "NO APTA" );
        }
    }
}*/