package example.example_Interface.InstanceOf;

import example.example_Interface.parameter_polymorphism.Vehicle;

public class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}
