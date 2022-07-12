package example.Inheritance.Abstract;

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
