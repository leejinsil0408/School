package example.example_Interface.Default_method_extands;
//p382 디폴트 메소드가 있는 인터페이스 상속
public interface ParentInterface {
    public void method1();
    public default void method2() {
        System.out.println("ParentInterface-method2()");
    }
}
