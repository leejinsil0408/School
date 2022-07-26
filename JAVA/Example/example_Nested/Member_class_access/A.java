package example_Nested.Member_class_access;
//p396 중첩 클래스의 접근 제한 - 바깥 필드와 메소드에서 사용 제한
public class A {
    class B{}
    static class C {}

    //인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    //인스턴스 메소드
    void method1() {                //로컬변수
        B var1 = new B();
        C var2 = new C();
    }
    //인스턴스 멤버 클래스든 정적 멤버든 사관없이 인스턴스 필드 또는 인스턴스 메소드에서
    //아무런 제한 없이 객체를 생성할 수 있다



    //정적 필드
    //static B field3 = new B();
    //B라는 클래스는 A 객체가 생성되어야 쓸 수 있다.
    static C field4 = new C();
    //정적 멤버 클래스로 선언되어 A 객체 없이도 C를 만들 수 있다.


    //정적 메소드
    static void method2() {
        //B var1 = new B();
        //메소드2는 static 선언이 되어 A라는 객체가 없이도 메소드2 호출이 가능한 실행문을 써야한다.
        C var2 = new C();

    }

    //중첩 클래스 중 멤버클래스는 바깥 클래스의 필드와 메소드에서 사용이 될 수 있는데
    //인스턴스 필드와 메소드는 인스턴스 멤버 클래스든 정적 멤버 클래스든 상관없이 바깥 클래스에서 사용이 가능한데
    // 정적 필드와 정적 메소드는 정적 멤버클래스만 사용할 수 있다.
    // static은 static을 사용한다.
}
