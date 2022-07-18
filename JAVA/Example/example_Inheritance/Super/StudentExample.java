package example.Inheritance.Super;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동","960402-2224567",1);
        System.out.println("name :" + student.name);
        System.out.println("ssn: " + student.ssn);         //부모에서 물려받은 필드 출력
        System.out.println("studentNo :" + student.studentNo);
    }
}
