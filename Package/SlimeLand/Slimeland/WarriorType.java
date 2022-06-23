package Slimeland;
public class WarriorType {

    public static void WarriorType(int warriorjob) {
        if(warriorjob ==1) {
            System.out.println("용사의 직업은 마법사입니다.");
        } else if(warriorjob ==2) {
            System.out.println("용사의 직업은 기사입니다.");
        } else if(warriorjob ==3) {
            System.out.println("용사의 직업은 궁수입니다.");
        } else {
            System.out.println("1,2,3 중 숫자로만 입력해주세요.");
        }
    } 
}
