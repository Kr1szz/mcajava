//interface Vehicle that defines the basic operations for vehicles
interface Vehicle{
    void start();
}

// Abstract class that provides a common base for vehicles
abstract class VehicleBase{
    abstract void Drive();
}

//class Car and MotorBike that implement the Vehicle interface and extend VehicleBase
class Car extends VehicleBase implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    void Drive() {
        System.out.println("Car is driving");
    }
}

class MotorBike extends VehicleBase implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    void Drive() {
        System.out.println("Bike is driving");
    }
}

//main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        //polymorphic behavior of vehicles 
        // using the Vehicle interface and VehicleBase abstract class
        // creating instances of Car and MotorBike and invoking their methods
        Vehicle car = new Car();
        car.start();
        ((Car) car).Drive();

        Vehicle bike = new MotorBike();
        bike.start();
        ((MotorBike) bike).Drive();
    }
}
