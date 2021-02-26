package first_week.statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lekcja_warunki {
    /*if (warunek){
        zrobCos1;
        zrobCos2;
        ...
        zrobCosX;
        }
      else{
      zrobcosinnego1;
      zrobcosinnego2;
      .....
      zrobcosinnegoX;
      }
     */
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
//        boolean stan =true;
//                if(stan){
//                    System.out.println("Wykonała się instrukcja IF.");
//
//                }
//                else{
//                    System.out.println("Wykonała się instrukcja ELSE.");
//                }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek: ");
//        int wiek = skaner.nextInt();
//        if(wiek >= 18){
//            System.out.println("Jesteś pełnoletni!");
//        }
//        else{
//            System.out.println("Jesteś niepełnoletni!");
//        }

//        System.out.println("Podaj liczbę");
//        int liczba = skaner.nextInt();
//
//        if(10 < liczba && liczba <20) {
//            System.out.println("Liczba mieści się w zakresie.");
//        }
//        else {
//            System.out.println("Liczba nie mieści się w zakresie.");
//        }

//        System.out.print("Podaj liczbę całkowitą A");
//        int a = skaner.nextInt();
//
//        System.out.print("Podaj liczbę całkowitą B");
//        int b = skaner.nextInt();
//
//        if (a > b) {
//            System.out.println("A jest większe od B.");
//        }
//        if (a < b) {
//            System.out.println("A jest mniejsze od B.");
//        }
//        if (a == b) {
//            System.out.println("A jest równe od B.");
//        }
//
//        if (a > b) {
//            System.out.println("A jest większe od B.");
//        }
//        else {
//            if (a < b) {
//                System.out.println("A jest mniejsze od B.");
//            }
//            else{
//                System.out.println("A jest równe od B.");
//            }
//        }

//       char charA = 'A';
//        char charB = 'B';
//        if (charA> charB) {
//            System.out.println("charA ma wiekszą wartość od charB w tabelii ASCI");
//        }
//        else{
//            System.out.println("charA ma mniejszą wartość od charB w tabelii ASCII");
//        }
//        String hello = "hello";
//        String world = "world";
//        if(hello.equals(world)){
//            System.out.println("Hello jest równe world");
//        }
//        else{
//            System.out.println("Hello nie jest równe world");
//        }
//        System.out.println("Podaj swórj wybór (1, 2): ");
//        int x = skaner.nextInt();
//
//        switch(x){
//            case 1:
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case 2:
//                System.out.println("Przypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }

//
//        System.out.println("Podaj swórj wybór (A, B): ");
//        String y = skaner.next();
//
//        switch(y){
//            case "1":
//                System.out.println("Przypadek 1");
//                break;
//            case "2":
//                System.out.println("Przypadek 2");
//                break;
//            case "A":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "B":
//                System.out.println("Przypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }

        System.out.println("Podaj swórj wybór (1, 2, A, B): ");
        char z = skaner.next().charAt(0);

        switch(z){
            case '1':
                System.out.println("Przypadek 1");
                break;
            case '2':
                System.out.println("Przypadek 2");
                break;
            case 'A':
                System.out.println("Przypadek A.");
                break;
            case 'B':
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }
    }
}


