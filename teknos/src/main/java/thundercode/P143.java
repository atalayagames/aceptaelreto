package thundercode;

//Leyendo el diccionario

import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class P143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mult, num, acum;
        while((mult = sc.nextInt()) != 0 && (acum = 0) == 0){
            while((num = sc.nextInt()) != 0){
                acum += num * mult;
            }
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date((acum * 1000) - 3600000)));
        }
        sc.close();
    }
}