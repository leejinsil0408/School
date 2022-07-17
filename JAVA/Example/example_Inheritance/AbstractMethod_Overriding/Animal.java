package example.Inheritance.AbstractMethod_Overriding;
//p334 추상메소드와 오버라이딩
//추상클래스는 추상메소드를 선언할 수 있다.
//메소드 선언만 통일화하고 실행 내용은 실체 클래스마다 다른 경우
//자식클래스는 반드시 추상 메소드를 재정의(오버라이딩)해서 실행 내용을 작성해야 한다. (안하면 컴파일 에러)

//[public | protected] abstract 리턴타입 메소드명(매개번수, ...);

public abstract class Animal {                       //추상클래스
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다");
    }

    public abstract void sound();                    //추상메소드
}
