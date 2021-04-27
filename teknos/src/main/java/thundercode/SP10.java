package thundercode;
import java.util.ArrayList;
import java.util.Scanner;
public class SP10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
		int balones, posicion, cont, tamaño;
		while ((balones = sc.nextInt()) != 0 && (posicion = sc.nextInt()) != 0) {
			int j = 0;
			for (int i = 0; i < balones; i++) lista.add(i+1);
			for (int i = 0; i < balones; i++) {
				cont = 0;
				tamaño = lista.size();
				while(cont < posicion) {
					j++;	
					cont++;
					if(lista.size()==1) break;
					if (cont == posicion) {
						if (j == tamaño) {
							lista.remove(j-1);
							j = 0;
						} else {
							j--;
							lista.remove(j);
						}
					}
					if (j == tamaño) j = 0;
				}
			}
			System.out.println(lista.get(0));
            lista.clear();
		}
	}
}