package example.Inheritance.InstanceOf;
//p326 Instanceof 강제타입변환(부모클래스-> 자식클래스) 객체가 부모인지 자식인지 확인할 때 사용

public class InstanceofExample {
    public static void method1(Parent parent) {
        if(parent instanceof Child) {          //Child 타입으로 변환이 가능한지 확인
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        }else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;        //ClassCastException 발생 가능성
        System.out.println("method2 - Child로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();                 //Child 객체를 매개값으로 전달
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();               //Parent 객체를 매개값으로 전달
        method1(parentB);
        method2(parentB);    //예외발생
    }
}

//method1()과 method2()를 호출할 경우, Child 객체를 매개값으로 전달하면
//두 메소드 모두 예외가 발생하지 않지만, Parent 객체를 매개값으로 전달하면
//method2()에서는 ClassCastException이 발생한다.
//method1()은 instanceof 연산자로 변환이 가능한지 확인했지만 method2()는 무조건 반환하려 했기 때문이다.


