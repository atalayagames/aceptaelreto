package thundercode;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
//https://github.com/MiYazJE/Acepta-el-reto/blob/master/p464.java
class Tiempo implements Comparable<Tiempo> {
    public int pos;
    public int tiempo;
    Tiempo(int j, int x) {
        pos = j; 
        tiempo = x;
    }
    @Override
    public int compareTo(Tiempo o) {
        return this.tiempo - o.tiempo;
    }
}

public class SP01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer casos;
        int pos, auxPos;
        String[] tiempo;
        LinkedList<Tiempo> tiempos = new LinkedList<>();
        LinkedList<Tiempo> res = new LinkedList<>();
        Tiempo prev, actual;
        StringBuilder output = new StringBuilder();
        String n;
        while (!(n = sc.nextLine()).equals("0")) {
            casos = Integer.parseInt(n);
            for (int i = 0; i < casos; i++) {
                tiempo = sc.nextLine().split(":");
                tiempos.add(new Tiempo(i, (Integer.parseInt(tiempo[0]) * 3600) + (Integer.parseInt(tiempo[1]) * 60) + Integer.parseInt(tiempo[2])));
            }
            Collections.sort(tiempos);
            auxPos = pos = 1;
            prev = tiempos.get(0);
            res.add(new Tiempo(pos, prev.pos));
            for (int i = 1; i < tiempos.size(); i++) {
                actual = tiempos.get(i);
                ++auxPos;
                if (Math.abs(prev.tiempo - actual.tiempo) > 1) {
                    pos = auxPos;
                }
                prev = actual;
                res.add(new Tiempo(pos, actual.pos));
            }
            Collections.sort(res);
            for (int i = 0; i < casos; i++) {
                output.append(res.get(i).pos);
                if (i < casos - 1) output.append("\n");
            }
            System.out.println(output.toString());
            tiempos.clear();
            res.clear();
            output.delete(0, output.length());
            System.out.println("");
        }
        sc.close();
    }

}
/*import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SP01 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Date> datas = new ArrayList<>();
        ArrayList<Integer> poss = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        int players;
        while((players = sc.nextInt()) != 0){
            sc.nextLine();
            int currentPos = 1;
            for (int i = 0; i < players; i++) {
                datas.add(dateFormat.parse(sc.nextLine()));
                if(i > 0){
                    if(Math.abs(datas.get(i).getTime() / 1000L - datas.get(i-1).getTime() / 1000L) > 2){
                        currentPos = i + 1;
                    }
                }
                poss.add(currentPos);
            }
            datas.clear();
        }
        for (Integer integer : poss) {
            System.out.println(integer);
        }
        sc.close();
    }    
}*/
