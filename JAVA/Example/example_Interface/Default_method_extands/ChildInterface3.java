package example_Interface.Default_method_extands;

//부모가 가진 메소드2를 재정의를 하되, 추상메소드로 만듬
public interface ChildInterface3 extends ParentInterface {
    @Override
    public void method2();  //차일드인터페이스3을 구현한 클래스는 반드시 메소드2 재정의해야함.
    public void method3();
}
