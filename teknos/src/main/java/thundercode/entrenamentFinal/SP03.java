package thundercode.entrenamentFinal;

import java.util.Scanner;
public class SP03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        String n1, n2, output;
        int acarreo, len, n;
        for (int j = 0; j < casos; j++) {
            n1 = s.next();
            n2 = s.next();
            if (n1.length() < n2.length()) {
                while (n1.length() < n2.length()) {
                    n1 = "0" + n1;
                }
            }
            else if (n2.length() < n1.length()) {
                while (n2.length() < n1.length()) {
                    n2 = "0" + n2;
                }
            }
            len = n1.length()-1;
            acarreo = 0;
            output = "";
            for (int i = len; i >= 0; i--) {
                n = Integer.parseInt(""+n1.charAt(i)) * Integer.parseInt(""+n2.charAt(i)) + acarreo;
                acarreo = n / 10;
                if (i-1 != -1) n = n % 10;
                output = n + output;
            }
            System.out.println(output);
        }

    }

}
    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        String n1, n2, output;
        int acarreo, n;
        for (int j = 0; j < casos; j++) {
            n1 = s.next();
            n2 = s.next();
            if (n1.length() < n2.length()) {
                n1 = LPad(n1, Math.max(n1.length(), n2.length()), '0');
            }
            else if (n2.length() < n1.length()) {
                n2 = LPad(n2, Math.max(n1.length(), n2.length()), '0');
            }
            acarreo = 0;
            output = "";
            for (int len = n1.length() - 1; len >= 0; len--) {
                n = Integer.parseInt("" + n1.charAt(len)) * Integer.parseInt("" + n2.charAt(len)) + acarreo;
                acarreo = n / 10;
                if (len - 1 != -1) n = n % 10;
                output = n + output;
            }
            System.out.println(output);
        }
    }
    public static String LPad(String str, Integer length, char car) {
        return (str + String.format("%" + length + "s", "").replace(" ", String.valueOf(car))).substring(0, length);
    }  
}*/