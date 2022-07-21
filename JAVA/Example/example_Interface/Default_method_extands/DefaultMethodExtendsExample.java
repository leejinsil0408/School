package example_Interface.Default_method_extands;

public class DefaultMethodExtendsExample {
    public static void main(String[] args) {
        // 디폴트 메소드 활용 방법 1번째 : 디폴트 메소드를 단순히 상속만 받는다.
        //익명구현객체 만들어보기
        ChildInterface1 ci1 = new ChildInterface1() {

            @Override
            public void method1() {
                System.out.println("ci1-method1()");
            }

            @Override
            public void method3() {
                System.out.println("ci1-method3()");
            }
        };
        //칠드런 인터페이스1이 페어런트인터페이스의 메소드 1,2를 상속해 가지고 있을테니 호출 가능
        //페어런트 디폴트메소드2는 그대로 가지고 와서 사용

        ci1.method1();
        ci1.method2();  //부모인터페이스의 메소드2 호출
        ci1.method3();
        System.out.println();


        // 디폴트 메소드 활용 방법 2번째 : 디폴트 메소드를 상속받아 재정의한다
        ChildInterface2 ci2 = new ChildInterface2() {

            @Override
            public void method1() {
                System.out.println("ci2-method1()");
            }

            @Override
            public void method3() {
                System.out.println("ci2-method3()");
            }
        };

        ci2.method1();
        ci2.method2();   //자식 인터페이스에서 재정의된 메소드2 호출
        ci2.method3();
        System.out.println();

        // 디폴트 메소드 활용 방법 3번째 : 디폴트 메소드를 상속받아 추상메소드로 만든 뒤, 구현 클래스에서 재정의
        ChildInterface3 ci3 = new ChildInterface3() {

            @Override
            public void method1() {
                System.out.println("ci3-method1()");
            }

            @Override
            public void method2() {
                System.out.println("ci3-method2()");
            }

            @Override
            public void method3() {
                System.out.println("ci2-method3()");
            }
        };

        ci3.method1();
        ci3.method2();   //자식 인터페이스에서 재정의된 메소드2 호출
        ci3.method3();

        System.out.println("프로그램이 정상적으로 실행됩니다 이진실");
    }
}