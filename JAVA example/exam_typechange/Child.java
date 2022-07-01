package exam_typechange;

public class Child {
    public class Child extends Parent {

        public Child(String input_bagName, int input_money) {
            super(input_bagName, input_money);
        }
    }

    @Override
    public void goToWork() {
        System.out.println("나는 학교에 출근합니다");
    }

    public void goToPCRoom() {
        System.out.println("나는 PC방에 갑니다");
    }
}
