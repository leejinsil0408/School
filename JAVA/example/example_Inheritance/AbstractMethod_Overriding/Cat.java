package example.Inheritance.AbstractMethod_Overriding;

public class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");         //추상 메소드 정의
    }
}
