
public class SingletinEx {
    
    public static void main(String[] args) {

    /*Singleton obj1 = new Singleton(); //컴파일 에러
    Singleton obj2 = new Singleton(); //컴파일 에러
    */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("Singleton ==");
        }else {System.out.println("Singleton !==");}
        }
    }
