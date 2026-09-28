public class cars {

    
    String color;
    String model;
    int year;
    int speed;
    boolean engineOn;

    
    public static void start() {
        engineOn = true;
        System.out.println("Mercedes C-Class engine is starting.");
    }

    public static void accelerate() {
        speed = speed + 20;
        System.out.println("Mercedes C-Class is accelerating.");
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void brake() {
        speed = speed - 10;

        if (speed < 0) {
            speed = 0;
        }

        System.out.println("Mercedes C-Class is braking.");
        System.out.println("Speed: " + speed + " km/h");
    }

    public  static void stop() {
        speed = 0;
        engineOn = false;
        System.out.println("Mercedes C-Class has stopped.");
    }
}




    public static void main(String[] args) {

        
        MercedesCClass car = new MercedesCClass();

        
        car.color = "Black";
        car.model = "C-Class C300";
        car.year = 2025;
        car.speed = 0;
        car.engineOn = false;

        
        System.out.println("===== MERCEDES C-CLASS =====");
        System.out.println("Color: " + car.color);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Speed: " + car.speed + " km/h");

        
        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.stop();
    }
