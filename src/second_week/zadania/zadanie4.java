package second_week.zadania;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        double liczba = skaner.nextDouble();
        if(liczba <0){
            System.out.println("Liczba jest mniejsza od 0");
        }
        if (liczba >0){
            System.out.println("Liczba większa od 0");
        }
        if(liczba == 0){
            System.out.println("Liczba równa 0");
        }
        String login = "admin";
        String haslo = "haslo";
        System.out.println("Wpisz login:");
        String log = skaner.next();
        System.out.println("Wpisz hasło:");
        String has = skaner.next();
if(log.equals("admin")){
    System.out.println("Zalogowano pomyślnie");
}
else{
    System.out.println("Nie zalogowano");
}
if(has.equals("haslo")){
        System.out.println("Hasło pomyślnie wpisane");
    }
else{
        System.out.println("Hasło źle wpisane");
    }
    
}
}