class Car {
    private String car_id;
    private static int count = 0; // Shared across all instances

    public Car(String car_id) {
        this.car_id = car_id;
        count++; // Increment count whenever a new car is created
    }

    // Instance method to display car ID
    public void displayCarId() {
        System.out.println("Car ID: " + car_id);
    }

    // Static method to display total car count
    public static void displayTotalCars() {
        System.out.println("Total participating cars: " + count);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("RACE_01");
        Car c2 = new Car("RACE_02");
        Car c3 = new Car("RACE_03");

        c1.displayCarId();
        c2.displayCarId();
        c3.displayCarId();

        // Calling static method via class name
        Car.displayTotalCars();
    }
}