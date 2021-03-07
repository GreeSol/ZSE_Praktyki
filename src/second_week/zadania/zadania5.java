package second_week.zadania;

public class zadania5 {
    public static void main(String[] args) {
//        System.out.println("Pętla co 2");
        int number1;
        for(number1 = 0; number1 <= 20; number1++){
            System.out.println("NUMER: " +number1++);

        }
//        System.out.println("Pętla co 3 od tyłu");
        int number2;
        for(number2 = 30;number2>=0; number2 --) {
            System.out.println("NUMER: " + number2--);
            number2--;
        }
//        System.out.println("Tabliczka mnożenia");
        for(int i =1; i<10;i++){
            System.out.println("\t" +i +"przejście");
            for(int l =1;l<10;l++){
                System.out.println("(i:" +i+ ")" + "(l:" +l+ ")" +i+ "*" +l+ "=");
                int wynik = i*l;
                if(wynik%2==0){
                    System.out.println(wynik);
                }
                else{
                    System.out.println("x");
                }
            }
            System.out.println();
        }
//        System.out.println("Pętla od -40 do 40");
        for(int numer3=-40;numer3<=40;numer3++){
            if(numer3 %4==0){
                System.out.println("NUMER: " + numer3);
            }
        }
    }
}
