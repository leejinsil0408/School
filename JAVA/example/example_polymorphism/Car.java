package example.example_polymorphism;

public class Car {
    //필드
    Tire frontLeftTire = new Tire("앞왼쪽",6);
    Tire frontRightTire = new Tire("앞오른쪽",2);
    Tire backLeftTire = new Tire("뒤왼쪽",3);
    Tire backRightTire = new Tire("뒤오른쪽",4); //자동차는 4개의 타이어를 가진다.
    //생성자 (스킵)
    //메소드
    int run() {
        System.out.println("[자동차가 달립니다]");
        if(frontLeftTire.roll()==false) {stop(); return 1; }
        if(frontRightTire.roll()==false) {stop(); return 2; }
        if(backLeftTire.roll()==false) {stop(); return 3;}
        if(backRightTire.roll()==false) {stop(); return 4;}
        return 0;

    //모든 타이어를 1회 회전시키기 위해 각 Tire객체의 roll매소드 호출
    //false를 리턴하는 roll이 있을 경우 stop 메소드 호출, 해당 타이어 번호 리턴

    // tire 객체의 roll메소드가 호출되지만 금호타이어와 한국타이어로 교체되면
    // roll메소드를 재정의 하고 있으므로 한국타이어와 금호타이어의 roll메소드가 호출된다.

    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");    //펑크났을 때 실행
     }


//    Car mycar = new Car();
//    mycar.frontRightTire = new HankookTire();
//    mycar.backLeftTire = new KumhoTire();
//    mycar.run();
    //Tire 객체가 저장되어야하지만 Tire의 자식 객체가 저장되어도 문제 없음
    //자식 타입은 부모 타입으로 자동 타입 변환이 가능하기 때문이다.
    //한국타이어와 금호타이어는 부모인 타이어필드와 메소드를 가지고 있다.

}
