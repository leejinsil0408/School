package example.Inheritance.ClassExtends;
//자식클래스 생성
public class DmbCellPhone extends CellPhone {
    //필드
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel) {    //부모클래스에게 모델,컬러 필드를 상속받는다
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    //메소드
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 변경합니다.");
    }

    void turnOffDmb() {
        System.out.println(" DMB 방송 수신을 종료합니다.");
    }
}
