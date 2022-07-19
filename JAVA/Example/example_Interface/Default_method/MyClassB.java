package example.example_Interface.Default_method;

public class MyClassB implements MyInterface {
    @Override
    public void method1() {
        System.out.println("MyClassB-methdod2() 실행");
    }
    //구현클래스에서는 인터페이스가 가지는 디폴트메소드를 재정의 할 때는 디폴트 키워드를 붙히면 안됨.
    @Override
    public /*default*/ void method2() {
        System.out.println("MyClassB-method2() 실행");

    }
}
