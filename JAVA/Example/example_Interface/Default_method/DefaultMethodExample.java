package example.example_Interface.Default_method;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterface mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();

        MyInterface mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
//기존 인터페이스를 그대로 유지한 채 메소드를 추가하기 위해 디폴트메소드 생김
    }
}
