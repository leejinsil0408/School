package example_Interface.InstanceOf;


public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
    public void Checkfare() {
        System.out.println("승차요금을 확인합니다.");
    }
}
