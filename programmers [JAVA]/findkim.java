//package STUDYJAVA;
import java.util.ArrayList;

class solution {
    // 클래스:설계도 
    public static void main(String[] arg) {
        System.out.println("programmers start!");

        ArrayList<String> inputArray = new ArrayList<String>();
        // 타입<속성값> 변수명 = 대입연산자 , 할당.  new는 인스턴스, 메모리
        // string: return할 때 뭐로 할건지, 어레이리스트는 가변배열. size를 쓴다
        // 자바는 공간을 미리 선언
        inputArray.add("Jane"); // 0번째 배열 제인
        inputArray.add("kim");  // 1번째 배열 킴 을 넣어준다. 어레이에 데이터 넣을 땐 에드.
        System.out.println(Solution(inputArray));
        // 출력한다. 
    }


                 // 리턴타입 스트링 
    public static String Solution(ArrayList<String> inputArray) {
                                // 타입,속성값

        System.out.println(inputArray.size());
        String answer = "";
        //선언,할당

        String[] array_name = new String[3];
        // 인스턴스 만들고 타입 설정, 고정값을 넣음

        array_name[0]="kim";
        array_name[1]="Park";
        array_name[2]="Yi";
        // 스트링은 고정값이기 때문에 순번만 써주면 할당함 
        System.out.println(inputArray.size()); // 배열3개 고정. 수정하려면 다시 삭제하고 수정해야 한다.
        //seoul 배열을 순회해서 kim의 위치 찾기
        
        for(int i = 0; i< inputArray.size(); i++ ) {
            // if(array_name[i].equals("kim") {
            // 어레이는 겟 아이, 이퀄스는 고정 배열의 값 비교)
        {
            if(inputArray.get(i) == "kim") {
                // 킴하고 i하고 비교하겠다.
                System.out.println("ok");
            }
            
            // 검색 추천 문장 : java 값 비교 (주소비교, 값 비교)
            // equals
            // 위치 저장
        }
        

        StringBuffer text_test = new StringBuffer("helloww");
        text_test.append("abc");
        text_test.append("kkk");
        System.out.println(text_test.length());
        return answer;
        // "김서방은 [배열위치]에 있다"
        // answer = text [배열위치] + 에 있다.     
        }
    }
}
