package example.Inheritance.Casting;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();       //자동타입변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2";          사용불가능
        parent.field3();                  사용불가능
        */

        Child child = (Child)parent;      //강제타입변환
        child.field2 = "data3";
        child.method3();
    }
}
