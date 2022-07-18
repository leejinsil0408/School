package example.Inheritance.polymorphism;
public class CarExample {              //Tire,Car,HanKookTire,KumhoTire 클래스를 이용하는 실행 클래스
    public static void main(String[] args) {
        Car car = new Car();  //객체 생성

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();   //Car 객체의 run 메소드 5번 반복 실행
            if(problemLocation !=0) {
                System.out.println(car.tires[problemLocation-1] + " HanKookTire로 교체");
                car.tires[problemLocation-1] =
                        new HanKookTire(car.tires[problemLocation-1].location, 15);
            } // ?? 이해안감..


//            switch (problemLocation) {
//                case 1:
//                    System.out.println("앞왼쪽 HanKooKTire로 교체");
//                    car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
//                    //13,18,22,26라인 Car 객체의 Tire 필드에 한국,금호타이어 객체 대입
//                    //즉, 자동타입변환 (자식클래스 -> 부모클래스)
//                    //교체된 이후 Car 객체의 run메소드가 호출될 때
//                    //한국,금호 타이어에서 재정의(오버라이딩)된 메소드 실행
//                    break;
//                case 2:
//                    System.out.println("앞오른쪽 KumhoTire로 교체");
//                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
//                    break;
//                case 3:
//                    System.out.println("뒤왼쪽 HanKookTire로 교체");
//                    car.backLeftTire = new HanKookTire("뒤왼쪽", 14);
//                    break;
//                case 4:
//                    System.out.println("뒤오른쪽 KumhoTire로 교체");
//                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
//                    break;
//            }
            System.out.println("------------------------");         //1회전 시 출력되는 내용 구분
        }
    }
}

