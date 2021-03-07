package second_week.zadania;

public class zadania8 {

    interface piecPiekacz {
            void pieczenieChleba();
            void pieczenieCiastek();
        }
        interface piecGrill{
        void grillKurczak();
        }
    public static class Piece implements piecPiekacz,piecGrill {
        private int temp;
        private int czas;

@Override
        public void pieczenieChleba() {
            temp = 200;
            czas = 120;
            wlaczPiec();
        }

@Override
        public void pieczenieCiastek() {
            temp = 150;
            czas = 200;
            wlaczPiec();
        }

@Override
        public void grillKurczak() {
            temp = 120;
            czas = 300;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Włączamy piece i " +
                    "ustawiamy temperature na: " +
                    temp + " stopni, " + "czas na: " +
                    czas + " sekund");
        }

        public static void main(String[] args) {
            Piece Piece = new Piece();
            piecGrill piecGrill=Piece;
            piecPiekacz piecPiekacz=Piece;

            piecPiekacz.pieczenieChleba();
            piecPiekacz.pieczenieCiastek();
            piecGrill.grillKurczak();

        }
    }
}
