package second_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class lekcja_arrays {
    public static void main(String[] args){
//        int[] array ={1, 45, 56, -23};
//        int array2[] ={-7, 6, 52, 2, 100, 0, 777};
//        System.out.println("Element pierwszy tablict array[0]" + array[0]);
//        System.out.println("Długość tablicy array" + array.length);
//
//        System.out.println("\n\nTablica array przed zmianą:" + Arrays.toString(array));
//
//        array[0] = 15;
//        array[1] = 10;
//        array[2] = 5;
//        array[3] = 0;
//
//        System.out.println("Tablica array po zmianie:" + Arrays.toString(array));
//
//        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("\n\narray3 = {");
//        for(int i = 0; i < array3.length; i++) {
//            if (i == array3.length - 1) {
//                System.out.print(array3[i] + "};");
//            } else {
//                System.out.print(array3[i] + ",");
//            }
//        }
        Integer[] intArray = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};
//        Arrays.sort(intArray);
//        System.out.println("Sortowanie w porządku rosnącym" + Arrays.toString(intArray));
//
//        Arrays.sort(intArray, Collections.reverseOrder());
//        System.out.println("Sortowanie w porządku malejącym" + Arrays.toString(intArray));

        Arrays.sort(intArray, 2, 8);
        System.out.println("Sortowanie z zakresem:" + Arrays.toString(intArray));

        char[] charArray = {'z', 'w', 'j', 'e', 'g', 's', 'p', 'q', 'm', 'a', 'c', 'o', 'f'};
        Arrays.sort(charArray);
        System.out.println("sortowanie w porządku rosnącym" + Arrays.toString(charArray));

        Character[] charArray2 = {'z', 'w', 'j', 'e', 'g', 's', 'p', 'q', 'm', 'a', 'c', 'o', 'f'};
        Arrays.sort(charArray2, Collections.reverseOrder());
        System.out.println("sortowanie w porządku malejącym" + Arrays.toString(charArray2));
        String[] stringArray = {"~", "Ala", "ma","kota",",", "a", "pies","o", "imieniu","Pimpek", "ma", "kość"};
        Arrays.sort(stringArray);
        System.out.println("Sortowanie w porządku rosnącym" + Arrays.toString(stringArray));

        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym" + Arrays.toString(stringArray));
        Random rand = new Random();

        int rand_int1 = rand.nextInt(10);
        System.out.println("Wartość rand_int1: " + rand_int1);

        int rand_int2 = rand.nextInt(10) + 1;
        System.out.println("Wartość rand_int2: " + rand_int2);
    }
}