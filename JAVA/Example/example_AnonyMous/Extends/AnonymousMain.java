package example_AnonyMous.Extends;

import example_AnonyMous.AnonyMous.AnonyMous;
import example_AnonyMous.AnonyMous.Person;

public class AnonymousMain {

    public static void main(String[] args) {

        //1. 필드값으로 익명객체 사용
        AnonyMous anonyMous_1 = new AnonyMous();
        anonyMous_1.field.wake(); //실행메소드
        anonyMous_1.wayToWork_1.run();

        System.out.println("---------------------------");
        //2. 메서드(지역변수)로 익명객체 사용
        anonyMous_1.method1();

        //3. 매개변수로 익명객체 사용
        anonyMous_1.method2(
                new Person() {
                    @Override
                    void wake() {
                        System.out.println("11시에 일어났습니다");
                    }
                }
        );
    }
}
