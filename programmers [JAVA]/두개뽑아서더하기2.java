/* import java.util.TreeSet;
class Solution {

    public static void main(String[] arg) {
        int[] numbersArr = {2,1,3,4,1};
        Solution(numbersArr);
    }

    public static TreeSet<Integer> Solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<Integer>();
            for (int i = 0; i < numbers.length-1; i++) {
                for (int j =i+1; j < numbers.length; j++) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
            return answer;

    }
} */

import java.util.*;

class 두개뽑아서더하기2 {
    public static int[] solution(int[] numbers) {
        
        // 선언 타입                인스턴스생성
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int N;
        N = numbers.length;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                // 콘탠스메소드 : arr 안에 있는 값을 순회해서 뒤의 인자값(i+j)과 비교
                // 예를들어 2,3,4,5 면 2+3 5가 있는지 확인 -> 없으니 false인데 !로 인해 true값 반환
                // 그러므로 arr에 없었던 값들이 들어감. 반복 
                // true는 !(논리부정연산자)로 인해 false가 된다. (if=true일때만 실행)
                // arr에 5 라는게 있으면 true인데 ! 로 인해 false가 되어서 아래값이 실행 되지 않음
                // -> 중복값은 들어갈 수 없다.
                if (!arr.contains(numbers[i] + numbers[j])) {
                    arr.add(numbers[i] + numbers[j]);
                    //add는 arraylist에 값을 넣고 싶을 때 쓰는 명령어 
                }
            }
        }

        // array는 가변, size를 씀. answer는 고정배열
        // arraylist로 선언 된 것을 int[]로 리턴하기 위해서 for문 작성
        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
            // arr의 값을 가져와 answer에 대입해줌
        }
        // System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
        // sort : 안에 있는 원소값이 오름차순으로 정렬
        return answer;
    }
}