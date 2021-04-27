package thundercode;
import java.util.Scanner;

public class SP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int casos;
		int diferencia;
		int dia;
		int dia2;
		while (sc.hasNext()) {
			casos = sc.nextInt();
			dia = sc.nextInt();
			diferencia = 0;
			for (int i = 1; i < casos; i++) {
				dia2 = sc.nextInt(); 
				if (dia2 < dia) dia = dia2;
				else diferencia = Math.max(diferencia, dia2 - dia);
			}
			System.out.println(diferencia);
		}
	}
}