package example.example_Interface.Casting;

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();
        vehicle.run();
        // vehicle.Checkfare();  Vehicle 인터페이스에는 Checkfare 메소드가 없음

        Bus bus =(Bus) vehicle;    //강제타입변환
        bus.run();
        bus.Checkfare();
    }

    //인터페이스에서는 구현객체의 메소드를 실행할 수 없기 때문에 강제타입변환을 한다.
}
