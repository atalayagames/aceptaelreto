package thundercode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

//Felipe y sus tareas

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

public class P579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tasca> tasques = new ArrayList<>();
        int times, p, t;
        while((times = sc.nextInt()) != 0) {
            for (int i = 0; i < times; i++) {
                p = sc.nextInt();
                t = sc.nextInt();
                tasques.add(new Tasca(p, t));
            }
            Stream<Tasca> tasquesOr = tasques.stream().sorted(Comparator.comparing(Tasca::getPrior).thenComparing(Tasca::getTemps));
            tasquesOr.forEach(System.out::println);
            System.out.println("---");
            tasques.clear();
        }
        sc.close();
    }
}
