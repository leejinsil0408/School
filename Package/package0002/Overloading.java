package package0002;

public class Overloading {              // 오버로딩 클래스

    public String company = "hyundai";
    public String model;             // 필드값 선언,정의. 선언만 된건 값 null
    public String color;
    public int maxSpeed;


    public Overloading() {     // 생성자. 구현할 객체가 데이터에 따라 달라질 수 있는 부분은 오버로딩 처리
    }             // 생성자 만들면 매개변수안에 있는 데이터에 따라 객체의 스타일이 달라짐. this 사용으로 지정
    
            //생성자,   매개변수 
    public Overloading(String model) {
        this.model = model;
        // this - 자신 위치에서 가까운 객체 가리킴 
    }

    public Overloading(String model, String color) {
        this.model = model;
        this.color = color;
    } 

    public Overloading(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    } 
}