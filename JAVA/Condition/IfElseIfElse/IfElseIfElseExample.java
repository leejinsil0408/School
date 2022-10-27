package Condition.IfElseIfElse;
//p111 if-else if-else문
//처음 if문의 조건식이 false일 경우 다른 조건식의 결과에 따라 실행 블록 선택
//if 블록 끝에 else if문을 붙인다.
//모든 조건식이 false일 경우 else 블록 실행하고 if문을 벗어나게 된다.

//점수가 90점 이상이거나 미만일 경우에 대해 식 만들기

public class IfElseIfElseExample {
    public static void main(String[] args) {
//        int score = 75;
//        if (score >= 90) {
//            System.out.println("점수가 90점 이상입니다");
//            System.out.println("등급은 A입니다");
//        } else if (score >= 80) {
//            System.out.println("점수가 80~89점 입니다.");
//            System.out.println("등급은 B입니다");
//        } else if (score >= 70) {
//            System.out.println("점수가70~79점 입니다");
//            System.out.println("등급은 C입니다");
//        } else {
//            System.out.println("점수가 60점 미만입니다");
//            System.out.println("등급은 D입니다");
//        }

        int score = 80;
        if(score >= 90) {
            System.out.println("점수가 100~90점 입니다");
            System.out.println("등급은 A 입니다");
        } else if (score >= 80 ) {
            System.out.println("점수가 80~89점 입니다");
            System.out.println("등급은 B 입니다");
        } else if (score >= 70) {
            System.out.println("점수가 70~79점 입니다");
            System.out.println("등급은 C 입니다");
        } else {
            System.out.println("점수가 70점 미만입니다");
            System.out.println("등급은 D 입니다");
        }
    }
}
