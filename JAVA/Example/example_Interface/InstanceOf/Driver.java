package example.example_Interface.InstanceOf;

public class Driver {
    public void Drive(Vehicle vehicle) {
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.Checkfare();
        } vehicle.run();
    }
} //taxi는 instanceof가 false가 나오기 때문에 단순하게 run()만 실행

