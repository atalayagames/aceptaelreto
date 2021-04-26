package thundercode;
//Puntos de silla
import java.util.Scanner;
public class P600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int files, columnes;
        int[][] matriu;
        while((files = sc.nextInt()) != 0 && (columnes = sc.nextInt()) != 0){
            matriu = new int[files][columnes];
            for (int i = 0; i < files; i++) {
                for (int j = 0; j < columnes; j++) matriu[i][j] = sc.nextInt();
            }
            boolean temp = columnaValida(0, matriu) && columnaValida(columnes - 1, matriu) && filaValida(0, matriu) && filaValida(files - 1, matriu);
            System.out.println(temp ? "SI" : "NO");
        }
        sc.close();
    }
    public static boolean filaValida(int index, int[][] matriu) {
        for (int i = 1; i < matriu[index].length; i++) if(matriu[index][0] > matriu[index][i]) return false;
        return true;
    }
    public static boolean columnaValida(int index, int[][] matriu) {
        for (int i = 1; i < matriu.length; i++) if(matriu[0][index] < matriu[i][index]) return false;
        return true;
    }
}