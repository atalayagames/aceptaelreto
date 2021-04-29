package thundercode.concurs;

import java.util.Scanner;
public class ExerciciC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] preus;
        int dies;
        int lastP;
        int cont = 1;
        int contfinal = 1;
        dies = sc.nextInt();
        while (dies != 0){
            preus = new int[dies];
            for (int i = 0; i < dies; i++) {
                preus[i] = sc.nextInt();
            }
            for (int p : preus) {
                lastP = p;
                for (int p2 : preus) {
                    if (lastP < p2) {
                        lastP = p2;
                        cont+=1;
                    }
                    if (cont > contfinal)
                        contfinal = cont;
                }
                cont = 1;
            }
            System.out.println(contfinal);
            cont = 1;
            contfinal = 1;
            dies = sc.nextInt();
        }
    }
}