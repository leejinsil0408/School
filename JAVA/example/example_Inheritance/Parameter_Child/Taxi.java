package example.Inheritance.Parameter_Child;

//버스와 택시 모두 Vehicle 클래스 상속받아 run() 메소드 오버라이딩
public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
