import java.util.Scanner;  // java 안 scanner 클래스 import(가져옴,결합. 외부에 있는 자바 파일을 가져오는 용도)


    public class ScannerEx {// 클래스 이름(ScannerEx), public은 외부에서 자유롭게 가져와 쓸 수 있다는 뜻 
    
    public static void main(String args[]) // main 메소드는 시작점
         {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);  
        // Scanner:타입(int,string 같은) 선언, 구조를 만들고 변수명 scanner로 하겠다는 뜻
        // new는 클래스(설계도에 떠다니는 느낌) 메모리에 고유 영역을 갖고 있음(=인스턴스) 새로운 구조를 만들겠다는 뜻. (class 설계 도면 위 메모리에 새로 만들어지는 것)   
        // Scanner라는 설계 도면에 
        // system.in은 인자값. 데이터 주고받는 통로(System)안에 in 이라는 객체 받아옴.
        // 그것을 변수 scanner에 할당시키겠다는 뜻 
        // 자바의 배열을 생각하면 쉽다. system in은 정보를 집어 넣겠다는 뜻

        String name = scanner.next();  // 문자열 읽기
        //string: 타입을 name이라는 변수 선언, scanner 변수 안에 next라는 메소드 실행. 실행된 값을 name에 집어넣음 
        System.out.print("이름은" + name + ", ");
        // system.out는 입력한 것 출력

        String city = scanner.next();  // 문자열 읽기
        System.out.print("도시는" + city + ", ");

        int age = scanner.nextInt();   // 정수 읽기
        System.out.print("나이는" + age + "살, ");

        double weight = scanner.nextDouble();  // 실수 읽기
        System.out.print("체중은" + weight + "kg, ");

        boolean isSingle = scanner.nextBoolean(); // 논리값 읽기
        System.out.println("독신 여부는 " + isSingle + "입니다. ");
        
        scanner.close();   // scanner 객체 닫기
    }    
}
