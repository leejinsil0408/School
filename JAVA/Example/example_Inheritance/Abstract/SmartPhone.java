package example.Inheritance.Abstract;

//자식 객체는 추상클래스의 생성자를 상속 super를 사용해 호출
public class SmartPhone extends Phone {
    //생성자
    public SmartPhone(String owner) {
        super(owner);

    }
    //메소드
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다");
    }
}
