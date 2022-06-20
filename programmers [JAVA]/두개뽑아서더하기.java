package folder;

import java.util.Iterator;
import java.util.TreeSet;

class Solution {
    // 설계도
    public static void main(String[] arg) {
        int[] numbersArr = { 2, 1, 3, 4, 1 };
        solution(numbersArr); // 인자 값 써주기 (함수 호출 시 전달하는 값)
    }
                                    // 매개변수 (함수 내에서 전달된 값을 받아들이는 변수)
    public static int[] solution(int[] numbers) {
    // int 배열 타입 solution은 정수배열 numbers
        int[] answer;
        //int배열의 변수명은 answer로 한다
        TreeSet<Integer> arr = new TreeSet<>();
        // TreeSet 생성
        // TreeSet<자료형> 변수명 = new TreeSet<자료형(생략가능)>();  
        int idx = 0;
        // 정수타입인 idx의 값에 0 대입
        
                                //i는 인덱스 번호기때문에 -1
                                //배열 i에서 마지막 값은 모든 값과 한 번씩 만나봤기 때문에 -1을 해줌
        for (int i = 0; i < numbers.length - 1; i++) {
            // int i의 값에 0을 넣는다. i는 numbers 배열의 길이에서 -1한 값보다 작을 때 증가
                        
            for (int j = i + 1; j < numbers.length; j++) {
            // int j는 i+1의 값을 가지며, j가 배열의 길이보다 작으면 j는 1씩 증가
            // j는 i의 인덱스와 중복값 없이 수를 뽑아 더해야 하므로 i + 1
                arr.add(numbers[i] + numbers[j]);
            /* arr 즉 Treeset에 add() 메소드를 사용해 값 추가. 
            numbers 배열 i 와 j를 더한다 */
        }
    }
        answer = new int[arr.size()];
        // asnwer 선언하며 TreeSet에 저장된 데이터의 개수(크기)를 얻어와 대입한다.
        Iterator<Integer> iterator = arr.iterator();
        // lterator 정의(사용) Iterator<자료형> 변수명 = treeSet객체명.iterater(); 
        // 이터레이터로 객체 전체를 대상으로 한번씩 반복해서 가져온다. 
        while (iterator.hasNext()) {
            /*while(iterator명.hasNext()) { iterator.next(); } 
            hasNext : 다음에 읽어올 값이 있는지 확인하는 메소드.  값이 있으면 true 없으면 false */
            // 조건 값이 있을 때까지 반복. while문으로 iterator 활용
            answer[idx++] = (int)iterator.next();
            //next(): Iterator에서 하나의 객체를 가져옴.
            //answer에 배열을 1씩 증가, iterator.next 대입

        return answer;
    }
    }



//   풀이법
// 정수 배열에 서로 다른 인덱스의 값 두개끼리 더해서 만들 수 있는 모든 경우의 수를 찾기
// 더한 값에서 중복은 제거 ( 5= 1+4, 2+3 두 개 나오므로 하나만 나오게끔 중복 제거)
// 오름차순으로 정렬
// 2중 for문으로 모든 경우의 수를 찾기

 
// * 컬렉션 프레임워크: 프로그램 구현에 필요한 자료구조를 구현해놓은 JDK라이브러리
// 컬렉션 인터페이스 : 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스

// 컬렉션 하위에 List와 set이 있음.
// 그 중 set은 순서와 관계없이 중복 허용X, 유일한 값을 관리하는데 필요한 메서드 
// Set은 HashSet, Treeset이 있다.
// Set은 인덱스로 객체를 검색해서 가져오는 메소드가 없다.
// 보통의 배열은 index로 ex) array[1]
// 보통의 리스트는 index를 get으로 ex) list.get(i)
// 자료를 출력하기 때문에 for문만을 활용하여 전체 배열을 출력해 줄 수 있다. 


/* Iterator<해당데이터형> 변수명 = 셋이름.iterator();
    while(변수명.hasNext()){
        변수명.next(); } */



//   TreeSet
// 이 클래스를 이용해서 더한 값의 중복을 제거, 오름차순 정렬 가능

//   Iterator  (객체 전체를 대상으로 한 번씩 반복해서 가져오는 반복자)
// 순서(index)가 존재하지 않는 Set 인터페이스에서 사용된다.
// 컬렉션 프레임워크에 저장된 요소들을 순서대로 참조하는 기능.
// List 혹은 Set 인터페이스를 구현하는 컬렉션은 iterator() 가 요소들을 순회한다.

/* iterator를 쉽게 비유

-우리가 책을 보관하는 책장(컬렉션)이 있고, 그곳에는 책(컬렉션 안에 들어갈 객체)이 있다.
-이 책장은 도서관 사서(iterator)가 관리한다. 
-사서는 단순 무식한 녀석이라 책장 처음부터 끝까지 한번에 하나씩 밖에 못가져 온다.  */

/* Iterator에서 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
next() 메소드를 사용하기전에 먼저 가져올 객체가 있는지 확인하는것이 좋다.
hashNext() 메소드는 가져올 객체가 있으면 true를 리턴, 가져올 객체가 없으면 flase를 리턴 */

//   integer
/* int는 변수의 타입( 변수는 값을 저장할 수 있는 메모리 상의 공간이며, 자료형 중 하나다.)
자료형은 data의 type에 따라 값이 저장될 공간의 크기와 저장 형식을 정의한 것
아까 배운 기본타입과 참조타입 중 기본타입 . 그 기본형을 표현하는 경우가 있다.
1- 매개변수로 객체를 필요로 할 때
2- 기본형 값이 아닌 객체로 저장해야할 때
3- 객체 간 비교가 필요할 때
이런 경우 기본형을 객체로 다루기 위해 사용하는 클래스들을 래퍼 클래스(wrapper class)라고 한다.
그리고 Integer는 int의 레퍼클레스 */



/* import java.util.Iterator;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        TreeSet<Integer> arr = new TreeSet<>();
        int idx = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[arr.size()];

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            answer[idx++] = (int)iterator.next();
        }

        return answer;
    }
} */