package example.Inheritance.Parameter_Child;

//p321 매개변수의 다형성
public class Driver {

    public void drive(Vehicle vehicle) {
        vehicle.run();
        //drive()메소드에서 Vehicle 타입의 매개값을 받아 run()메소드 호출

    }
}
