package Condition.IfElseIfElse;
//p114 주사위 랜덤 뽑기
public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        //Math.random() 메소드는 0.0~1.0사이에 속하는 난수 하나 리턴
        //정수를 얻기 위해 int타입 강제변환

        if (num == 1) {
            System.out.println("1번이 나왔습니다");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다");
        } else if (num == 6) {
            System.out.println("6번이 나왔습니다");
        }
    }
}