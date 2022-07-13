package example.Inheritance.Abstract;
//p329 추상클래스 (실체간 공통되는 특성을 추출한 것)

//상속의 관계 (추상클래스:부모,실체클래스:자식). 실체클래스는 추상클래스의 특성+추가적 특성을 가짐
//abstract 사용. 객체를 직접 생성할 수 없으므로 new연산자 사용 못하고 상속을 통해 자식클래스만 만들 수 있다.

//용도
//실체 클래스의 공통된 필드와 메소드의 이름을 통일
//실체 클래스를 작성할 때 시간을 절약

public abstract class Phone {
    //필드
    public String owner;
    //생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    //메소드
    public void turnon() {
        System.out.println("폰 전원을 켭니다");
    }
    public void turnoff() {
        System.out.println("폰 전원을 끕니다");
    }
}
