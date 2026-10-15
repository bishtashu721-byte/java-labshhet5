class Vehicle {
    void start() { System.out.println("Vehicle started."); }
    void stop() { System.out.println("Vehicle stopped."); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is driving."); }
}
class ElectricCar extends Car {
    void chargeBattery() { System.out.println("Battery is charging."); }
}
public class Q09_VehicleElectricCar {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start(); car.drive(); car.chargeBattery(); car.stop();
    }
}
