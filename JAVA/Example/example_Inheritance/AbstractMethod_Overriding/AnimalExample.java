package example.Inheritance.AbstractMethod_Overriding;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("------- 일반적인 방법 호출 -------");
        dog.sound();
        cat.sound();
        System.out.println("--------------------------------");

        //변수의 자동 타입 변환
        System.out.println("------- 자동타입 변환 방법 호출 -------");
        Animal animal = null;  //초기화
        animal = new Dog();             // Animal 변수로 타입 변환 뒤
        animal.sound();                 // 재정의된 sound()메소드 호출
        animal = new Cat();
        animal.sound();
        System.out.println("--------------------------------");


        System.out.println("------- 부모 매개변수에 자식 객체 대입 자동 변환 -------");
        //메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());

        System.out.println("--------------------------------");
    }

    public static void animalSound(Animal animal) {
                                    //Dog,Cat의 자동 타입 변환
                                   //부모 타입의 매개 변수에 자식 객체 대입 (다형성)

        animal.sound();           //재정의된 메소드 호출
    }

}
