package thundercode.concurs;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class ExerciciJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int cas = sc.nextInt();
            StringBuilder temp = new StringBuilder("1");
            while(parseInt(temp.toString()) % cas != 0) temp.append("1");
            System.out.println(temp.toString().length());
        }
    }
}//static boolean multiple(int num, int mult) { return num % mult == 0; }
