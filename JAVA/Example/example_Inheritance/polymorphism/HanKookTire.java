package example.Inheritance.polymorphism;

public class HanKookTire extends Tire {
    //필드
    //생성자
    public HanKookTire(String location, int maxRotation) {
        super(location,maxRotation);
        //필드X 생성자(매개값)O = super 부모 호출
    }
    //메소드                          출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll 메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " HanKookTire 수명: " +
                    (maxRotation-accumulatedRotation) + "회 ");
            return true;
        }else {
            System.out.println("*** " + location + "HanKookTire 펑크 ***");
            return false;
        }
    }
}
