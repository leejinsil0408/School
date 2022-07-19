package example.example_Interface.InstanceOf;

import example.example_Interface.parameter_polymorphism.Bus;
import example.example_Interface.parameter_polymorphism.Driver;
import example.example_Interface.parameter_polymorphism.Taxi;

public class DriverExample {
    public static void main(String[] args) {
        example.example_Interface.parameter_polymorphism.Driver driver = new Driver();

        example.example_Interface.parameter_polymorphism.Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);      //자동타입변환 Vehicle vehicle = bus;
        driver.drive(taxi);     //자동타입변환 Vehicle vehicle = taxi;
    }
}
