package second_week.zadania;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadania6 {
    public static void main(String[] args) {
        char[] charArray={'P','R','A','K','T','Y','K','I','2','1'};
        Arrays.sort(charArray);
        System.out.println("Tab1" + Arrays.toString(charArray));
        String[] stringArray={"Paweł","Robert","Adam","Karol","Tomek","Yyy","Kajfasz","Igor","2021","10"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Tab1" + Arrays.toString(stringArray));

        Random rand = new Random();
        int rand_int = rand.nextInt(3);
        String[] pies={"Pimpek","Borys","Drako"};
        System.out.println("Pies ma na imię " + pies[rand_int]);
        int jedz = rand.nextInt(5);
        int jedz1 = rand.nextInt(5);
        int jedz2 = rand.nextInt(5);
        String[] jedze={"Spaghetti","Lasagne","Kebab","Jajecznica","Kanapka"};
        System.out.println("Na śniadanie zjem: " + jedze[jedz] + ", ");
        System.out.println("Na obiad zjem: " + jedze[jedz1] + ", ");
        System.out.println("Na kolacje zjem: " + jedze[jedz2] + ", ");

        Integer[] tab2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Arrays.sort(tab2,0,10, Collections.reverseOrder());
        System.out.println("Tablica" + Arrays.toString(tab2));
    }
}
