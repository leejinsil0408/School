package example_Nested.Object;

/*바깥 클래스 */
public class A {
    A() {
        System.out.println("A객체가 생성됨");

        B b = new B();
        b.field1 = 3;
        b.method1();
    }

    class B {
        int field1;
        B() {
            System.out.println("B객체가 생성됨");
        }
        void method1() {};
    }

    static class C {
        int field1;
        static int field2;
        C() {
            System.out.println("C 객체가 생성됨");
        }
        void method1() {}
        static void method2() {}
    }
    void method() {
        class D {
            int field1;
            D () {
                System.out.println("D객체가 생성됨");
            }
            void method1() {}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}






