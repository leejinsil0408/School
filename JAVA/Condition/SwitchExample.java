package Condition;

//p116 switch : 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다. if문보다 코드가 간결한 장점
//괄호안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행시킨다.
//동일한 값을 갖는 case가 없으면 default로 가서 실행문을 실행시킨다. default는 생략 가능

//IfDiceExample을 switch로 변형한 예제문

public class SwitchExample {
    public static void main(String[] args) {
        int num=(int)(Math.random()*6) +1;

        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다");
                break;
            case 2:
                System.out.println("2번이 나왔습니다");
                break;
            case 3:
                System.out.println("3번이 나왔습니다");
                break;
            case 4:
                System.out.println("4번이 나왔습니다");
                break;
            case 5:
                System.out.println("5번이 나왔습니다");
                break;
            case 6:
                System.out.println("6번이 나왔습니다");
                break;

                //break가 붙는 이유: 빠져나가기 위해서
        }
    }
}
