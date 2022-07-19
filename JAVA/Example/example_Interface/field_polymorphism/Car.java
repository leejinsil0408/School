package example.example_Interface.field_polymorphism;

public class Car {
// 인터페이스 배열로 구현 객체 관리
    Tire[] tires = {
        new HankookTire(),
        new HankookTire(),
        new HankookTire(),
        new HankookTire()
    };

    void run() {
        for(Tire tire : tires) {
            tire.roll();
        }
    }



//    인터페이스 타입 필드 선언과 초기 구현 객체 대입
//    Tire frontLeftTire = new HankookTire();
//    Tire frontRightTire = new HankookTire();
//    Tire backLeftTire = new HankookTire();
//    Tire backRightTire = new HankookTire();
//
//    void run() {
//        frontLeftTire.roll();
//        frontRightTire.roll();
//        backLeftTire.roll();
//        backRightTire.roll();
//    }
}
