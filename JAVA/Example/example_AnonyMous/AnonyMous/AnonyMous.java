package example_AnonyMous.AnonyMous;

import example_AnonyMous.Extends.WayToWork;

public class AnonyMous extends Person {
    //필드로 익명객체 사용법
    Person field = new Person() {
        //익명 객체 생성
        //익명 객체는 필드 인스턴스 안에 무언가르 집어넣을 수 있다.
        // 선언 부분에 한번 쓰고 버릴 수 있는 객체를 만들 수 있다. (한 번 정의하고 끝나는 객체)
        // 단독 생성 불가, 항상 클래스 상속하거나 인터페이스 구현해야 생성 가능, 클래스 안에 넣는다.
        // 외부에서는 익명 객체의 필드와 메소드에 접근할 수 없다
        // 익명 객체는 부모 타입 변수에 대입되므로 부모 타입에 선언된 것만 사용 가능
        int fieldInt;

        void work() {
            System.out.println("뛰어갑니다.");
        }

        @Override
        void wake() {
            fieldInt = 40;
            System.out.println("늦잠자서 7시에 일어났습니다.");
            work();
        }
    };

        WayToWork way = new WayToWork() {
            @Override
            public void run();
        };

        @Override
        void wake() {
        fieldInt = 9;
        System.out.println("늦잠자서 7시에 일어났습니다.");
        System.out.println(fieldInt + "시까지 가야합니다.");
        work();
    }

        private void work() {
        System.out.println("뛰어갑니다.");
        }
    };

    void method1() {
        Person localVar = new Person() {
            @Override
            void wake() {
                System.out.println("10시에 일어났습니다.");
                work();
            }

            private void work() {
                System.out.println("후다닥 달려갑니다.");
            }
        };
        localVar.wake();
    }
    void method2(Person person_1){
        person_1.wake();
    }
}