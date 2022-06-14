import java.util.Iterator;
import java.util.TreeSet;

class Solution {
//설계도 
    public int[] solution(int[] numbers) {
    // int 배열 타입 solution은 numbers라는 메소드 실행
        int[] answer;
        //int타입의 변수명은 answer로 한다
        TreeSet<Integer> arr = new TreeSet<>();
        // TreeSet 생성. 자동으로 오름차순 정렬되는 treeset선언 
        int idx = 0;
        // 정수타입인 idx의 값을 0으로 할당한다. 

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);

        // 
            }
        }

        answer = new int[arr.size()];

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            answer[idx++] = (int)iterator.next();
        }

        return answer;
    }
} 


정수 배열에 서로 다른 인덱스의 값 두개끼리 더해서 만들 수 있는 모든 경우의 수를 찾기
더한 값에서 중복은 제거 ( 5= 1+4, 2+3 두 개 나오므로 하나만 나오게끔 중복 제거)
오름차순으로 정렬
2중 for문으로 모든 경우의 수를 찾기

=TreeSet 클래스를 이용해서 더한 값의 중복을 제거, 오름차순으로 정렬




/* class Solution {
    public int[] solution(int[] numbers) 
} */
