public class CarDemo {

    public static void main(String[] args) {
        // Skapa några objekt(instanser)

        // 1. Skapa referensvariabel
        Car car1;
        // 2. Skapa objektet(minnesutrymme) med nycjekordet new
        car1 = new Car();

        System.out.println(car1); // Skriver ut referensvariabeln i hashcode Car@5f184fc6

        // Steg 1 och 2 i samma sats
        Car car2 = new Car();
        System.out.println(car2); // Car@3feba861
    }
}
