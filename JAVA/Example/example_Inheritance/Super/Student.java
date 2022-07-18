package example.Inheritance.Super;

public class Student extends people {
    public int studentNo;
    //슈퍼로 people 클래스의 생성자 호출
    public Student(String name, String ssn,int studentNo) {
        super(name, ssn); //부모 생성자 호출

    }
}
