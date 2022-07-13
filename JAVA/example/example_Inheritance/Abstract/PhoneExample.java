package example.Inheritance.Abstract;

// Phone의 생성자 호출해서 객체 생성 불가능. 대신 자식 SmartPhone로 객체 생성해서 Phone의 메소드 가져옴

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();  인스턴스화 할 수 없다.

        SmartPhone smartPhone = new SmartPhone("이진실");

        smartPhone.turnon();    //Phone 메소드
        smartPhone.internetSearch();
        smartPhone.turnoff();   //Phone 메소드
    }
}
