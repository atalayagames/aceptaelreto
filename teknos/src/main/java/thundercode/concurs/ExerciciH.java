package thundercode.concurs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//https://www.techiedelight.com/find-maximum-minimum-custom-objects-java/
public class ExerciciH {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int anyRefer, nObras;
        ArrayList<Libro> libros = new ArrayList<>();
        while (s.hasNextInt()) {
            anyRefer = s.nextInt();
            s.nextLine();
            nObras = s.nextInt();
            for (int i = 0; i < nObras; i++) {
                int any = s.nextInt();
                if(any >= anyRefer){
                    String titol = s.nextLine().trim();
                    libros.add(new Libro(any, titol));
                } else {
                    s.nextLine();
                }
            }
            if(libros.size() == 0){
                System.out.println("NINGUNA");
            } else if(libros.size() < nObras){
                System.out.println(libros.stream().min(Comparator.comparingInt(x -> x.any)).get().titol);
            } else {
                System.out.println("TODAS");
            }
            libros.clear();
        }
    }
}
class Libro {
    public int any;
    public String titol;
    public Libro(int any, String titol){
        this.any = any;
        this.titol = titol;
    }
}
