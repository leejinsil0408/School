package example_Interface.InstanceOf;

//p 375 객체타입확인(instanceof)
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.Drive(bus);
        driver.Drive(taxi);
    }

}

