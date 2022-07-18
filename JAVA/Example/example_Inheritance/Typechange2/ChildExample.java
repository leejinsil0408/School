package example.Inheritance.Typechange2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;       //자동타입변환
        parent.method1();
        parent.method2();            //재정의된 메소드 호출
        //parent.method3();(호출 불가능)

        //Child 객체는 method3() 메소드를 가지고 있지만,
        //Parent 타입으로 변환된 이후에는 method3()을 호출할 수 없다.
        //그러나 method2() 메소드는 부모와 자식 모두에게 있다.
        //이렇게 오버라이딩 된 메소드는 타입 변환 이후에도 자식 메소드가 호출된다.
    }
}
