package example.Inheritance.Parameter_Child;

public class DriverExample {
    public static void main(String[] args) {
        //드라이버 객체 생성
        Driver driver = new Driver();
        //버스 객체 생성
        Bus bus = new Bus();
        //택시 객체 생성
        Taxi taxi = new Taxi();

        driver.drive(bus);    //자동타입변환 : Vehicle vehicle = bus;
        driver.drive(taxi);   //자동타입변환 : Vehicle vehicle = taxi;

        //매개 변수의 타입이 클래스일 경우, 해당 클래스의 객체뿐만 아니라
        //자식 객체까지도 매개값으로 사용할 수 있다
        //매개값의 자동 타입 변환과 메소드 오버라이딩을 이용한 매개 변수의 다형성 구현

    }
}
