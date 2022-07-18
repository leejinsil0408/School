package example.Inheritance.ClassExtends;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        //CellPhone으로부터 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);
        //DmbCellPhone에서 생성된 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        System.out.println("------------------------");

        //CellPhone으로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("거기 츄잇네 집 맞나요?");
        dmbCellPhone.sendVoice("아닌데요");
        dmbCellPhone.hangUp();


        //DmbCellPhone의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
