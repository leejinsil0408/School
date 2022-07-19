package example.example_Interface.Extends;
//구현클래스를 이용하는 실현클래스
//구현객체가 상위 인터페이스를 상속했을 경우 해당 구현객체를 어떤 인터페이스에 대입을 하냐에 따라 호출하는 메소드가 달라짐
public class Example_ABC {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); //인터페이스A에는 메소드 A만 선언 돼있음
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB(); //인터페이스B에는 메소드 B만 선언 돼있음
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC(); //모든 추상메소드를 물려받음
        System.out.println();
    }
}
