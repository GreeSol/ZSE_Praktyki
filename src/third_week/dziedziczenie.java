package third_week;

public class dziedziczenie {

    public static class Vehicle {
        protected final int tankCapacity = 60;
        protected int fuelLevel = 40;
        public void fillTank() {
            int toFill = tankCapacity - fuelLevel;
            fillTank(toFill);
        }
        public void fillTank(int toFill){
            if (toFill + fuelLevel > tankCapacity){
                System.out.println("Nie moge wlać do baku " + toFill + " litrów.");
            }
            else{
                fuelLevel += toFill;
                System.out.println("Wlano " + toFill + " litrów.");
            }
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Maks w baku: " + vehicle.tankCapacity);
        System.out.println("Ile jest w paliwa: " + vehicle.fuelLevel);
        vehicle.fillTank();
        System.out.println("Ile jest w paliwa: " + vehicle.fuelLevel);
        vehicle.fillTank(10);
    }
}