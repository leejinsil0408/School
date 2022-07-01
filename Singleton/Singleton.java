public class Singleton {

    public class Singleton {
        private static Singleton singeton = new Singleton();
        //객체 딱 하나 만들기
        
        private Singleton() {}
        
        static Singleton getInstance(); {
            return singeton; //리턴받는 객체가 static이다. 
        }
    }
}
    
