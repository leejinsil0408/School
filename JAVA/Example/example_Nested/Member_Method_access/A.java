package example_Nested.Member_Method_access;

public class A {
    int field1; //인스턴스 필드
    void method1() {} //인스턴스 메소드

    static int field2; //정적 필드
    static void method2() {} //정적 메소드

    class B { //중첩 클래스인 인스턴스 멤버 클래스 선언
        void method() {
            field1 = 10; //바깥 클래스 A의 필드와 메소드 사용
            method1();   //클래스 B는 클래스A와 아주 밀접한 관계이기 때문에 접근하고 사용 가능
            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            //field1 = 10;
            //필드1은 A 객체가 반드시 있어야 사용 가능한데 static클래스는 A 객체 없이도 C 객체가 만들어 질 수 있다.
            //
        }
    }
}
