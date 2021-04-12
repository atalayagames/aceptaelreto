package thundercode;

//Conjugar verbos

import java.util.Scanner;

public class P123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] verb = sc.nextLine().split(" ");
        while (!verb[1].toUpperCase().equals("T")) {
            verb[0] = verb[0].substring(0, Math.max(0, verb[0].length() - 2)).toLowerCase();
            verb[1] = verb[1].toUpperCase();
            switch (verb[1]) {
                case "A":
                    System.out.printf("yo %s%s%n", verb[0], "o");
                    switch (verb[0]) {
                        case "ar":
                            System.out.printf("tu %s%s%n", verb[0], "as");
                            System.out.printf("el %s%s%n", verb[0], "a");
                            System.out.printf("nosotros %s%s%n", verb[0], "amos");
                            System.out.printf("vosotros %s%s%n", verb[0], "ais");
                            System.out.printf("ellos %s%s%n", verb[0], "an");
                            break;
                        case "er":
                            System.out.printf("tu %s%s%n", verb[0], "es");
                            System.out.printf("el %s%s%n", verb[0], "e");
                            System.out.printf("nosotros %s%s%n", verb[0], "emos");
                            System.out.printf("vosotros %s%s%n", verb[0], "eis");
                            System.out.printf("ellos %s%s%n", verb[0], "en");
                            break;
                        case "ir":
                            System.out.printf("tu %s%s%n", verb[0], "es");
                            System.out.printf("el %s%s%n", verb[0], "e");
                            System.out.printf("nosotros %s%s%n", verb[0], "imos");
                            System.out.printf("vosotros %s%s%n", verb[0], "is");
                            System.out.printf("ellos %s%s%n", verb[0], "en");
                            break;
                    }
                    break;
                case "P":
                    switch (verb[0]) {
                        case "ar":
                            System.out.printf("yo %s%s%n", verb[0], "e");
                            System.out.printf("tu %s%s%n", verb[0], "aste");
                            System.out.printf("el %s%s%n", verb[0], "o");
                            System.out.printf("nosotros %s%s%n", verb[0], "amos");
                            System.out.printf("vosotros %s%s%n", verb[0], "asteis");
                            System.out.printf("ellos %s%s%n", verb[0], "aron");
                            break;
                        case "er":
                        case "ir":
                            System.out.printf("yo %s%s%n", verb[0], "i");
                            System.out.printf("tu %s%s%n", verb[0], "iste");
                            System.out.printf("el %s%s%n", verb[0], "io");
                            System.out.printf("nosotros %s%s%n", verb[0], "imos");
                            System.out.printf("vosotros %s%s%n", verb[0], "isteis");
                            System.out.printf("ellos %s%s%n", verb[0], "ieron");
                            break;
                    }
                    break;
                case "F":
                    switch (verb[0]) {
                        case "ar":
                            System.out.printf("yo %s%s%n", verb[0], "are");
                            System.out.printf("tu %s%s%n", verb[0], "aras");
                            System.out.printf("el %s%s%n", verb[0], "ara");
                            System.out.printf("nosotros %s%s%n", verb[0], "aremos");
                            System.out.printf("vosotros %s%s%n", verb[0], "areis");
                            System.out.printf("ellos %s%s%n", verb[0], "aran");
                            break;
                        case "er":
                            System.out.printf("yo %s%s%n", verb[0], "ere");
                            System.out.printf("tu %s%s%n", verb[0], "eras");
                            System.out.printf("el %s%s%n", verb[0], "era");
                            System.out.printf("nosotros %s%s%n", verb[0], "eremos");
                            System.out.printf("vosotros %s%s%n", verb[0], "ereis");
                            System.out.printf("ellos %s%s%n", verb[0], "eran");
                            break;
                        case "ir":
                            System.out.printf("yo %s%s%n", verb[0], "ire");
                            System.out.printf("tu %s%s%n", verb[0], "iras");
                            System.out.printf("el %s%s%n", verb[0], "ira");
                            System.out.printf("nosotros %s%s%n", verb[0], "iremos");
                            System.out.printf("vosotros %s%s%n", verb[0], "ireis");
                            System.out.printf("ellos %s%s%n", verb[0], "iran");
                            break;
                    }
                    break;
            }
            verb = sc.nextLine().split(" ");
        }
        sc.close();
    }
}