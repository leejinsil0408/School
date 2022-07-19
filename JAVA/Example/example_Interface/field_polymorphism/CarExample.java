package example.example_Interface.field_polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.run();

        mycar.tires[0] = new KumhoTire();
        mycar.tires[1] = new KumhoTire();
        mycar.run();
    }



//        Car mycar = new Car();
//        mycar.run();
//
//        mycar.frontLeftTire = new KumhoTire();
//        mycar.frontRightTire = new KumhoTire();
//
//        mycar.run();
//    }
}
