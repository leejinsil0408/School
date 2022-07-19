package example.example_Interface.Extends;
//p377
public class ImplementationC implements InterfaceC {
    //인터페이스C를 구현했기 때문에 인터페이스 A,B,C가 가진 모든 추상메소드 재정의
    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");

    }



}
