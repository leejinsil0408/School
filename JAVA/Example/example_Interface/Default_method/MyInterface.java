package example.example_Interface.Default_method;

//인터페이스에 추상메소드 추가 --> 기존 구현 클래스(MyClassA)에 에러가 난다.
//하나가 아니라 수십개면 재정의가 힘든 경우, 내가 아닌 다른 사람이 만든 코드인 경우,소스파일X바이트파일만 있는 경우
//에러사항이 많이 발생, 디폴트 메소드 쓰면 에러가 발생하지 않음.

public interface MyInterface {
    public void method1();
    // public void method2(); X

    public default void method2() {
        System.out.println("MyInterface-method2() 실행");  //디폴트는 실행블록을 가진다.
    }
}
