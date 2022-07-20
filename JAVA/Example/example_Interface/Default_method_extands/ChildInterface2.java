package example_Interface.Default_method_extands;

// ChildInterface2는 ParentInterface를 상속. ParentInterface의 디폴트 메소드인 method2() 재정의
// 자신의 추상 메소드인 method3() 재정의

public interface ChildInterface2 extends ParentInterface {
    @Override
    public default void method2() {
        System.out.println("ChildInterface2-method2() 실행");
    }
    public void method3();
}
