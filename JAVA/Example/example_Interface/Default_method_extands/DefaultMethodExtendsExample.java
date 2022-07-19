package example.example_Interface.Default_method_extands;

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

        ci1.method1();
        ci1.method2();
        ci1.method3();

        //칠드런 인터페이스1이 페어런트인터페이스의 메소드 1,2를 상속해 가지고 있을테니 호출 가능
        //페어런트 디폴트메소드2는 그대로 가지고 와서 사용
    }
}
