package thundercode;

//Felipe y sus tareas

//Inspirado en https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Tasca {
    private int prior;
    private int temps;
    public Tasca(int prior, int temps){
        this.prior = prior;
        this.temps = temps;
    }
    public int getTemps(){
        return this.temps;
    }
    public int getPrior(){
        return this.prior;
    }
    @Override
    public String toString(){
        return this.prior + " " + this.temps;
    }
}
class PriorComp implements Comparator<Tasca> {
    @Override
    public int compare(Tasca t1, Tasca t2) {
        return t2.getPrior() - t1.getPrior();
    }
}
class TempsComp implements Comparator<Tasca> {
    @Override
    public int compare(Tasca t1, Tasca t2) {
        return t1.getTemps() - t2.getTemps();
    }
}
class MultiComp implements Comparator<Tasca> {
 
    private List<Comparator<Tasca>> listComparators;
 
    @SafeVarargs
    public MultiComp(Comparator<Tasca>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Tasca t1, Tasca t2) {
        for (Comparator<Tasca> comparator : listComparators) {
            int result = comparator.compare(t1, t2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
public class P579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Comparator<Tasca> comparaTasques = Comparator.comparing(Tasca::getPrior, Comparator.reverseOrder()).thenComparing(Tasca::getTemps);
        ArrayList<Tasca> tasques = new ArrayList<>();
        int times, p, t;
        while((times = sc.nextInt()) != 0) {
            for (int i = 0; i < times; i++) {
                p = sc.nextInt();
                t = sc.nextInt();
                tasques.add(new Tasca(p, t));
            }
            Collections.sort(
                tasques, new MultiComp(
                    new PriorComp(),
                    new TempsComp()
                )
            );
            for (Tasca tasca : tasques) {
                System.out.println(tasca);
            }
            System.out.println("---");
            tasques.clear();
        }
        sc.close();
    }
}