import java.util.Arrays;

public class 참조타입 {


    public static void main(String[] arg) {
        System.out.println("test");

        /* 배열 
        int[] arr = null;
        int[] arr_1 = null;
        System.out.println(arr[0]);
        arr = new int[3];
        arr_1 = new int[3];
        System.out.println(arr);
        System.out.println(arr_1);  
        //메모리 힙 구조에 공간 할당. 각 값의 위치 알려줌
        // 주소값 시작위치는 그 배열의 0번째 시작위치와 동일
        // equals 객체끼리의 내용을 비교하여 (문자열끼리의 비교) 같으면 true, 다르면 false를 반환
        */


       /* 
        //배열의 복사와 주소값
        int[] arr1 = {100, 200, 300};
        int[] arr3 = null;
        //배열로 선언된 변수끼리 대입연산자?
        // 배열 주소를 대입한다. 힙에 있는 주소를 공유하고 있다.

        arr3 = arr1;
        System.out.println("arr3 : " + arr3);
        arr3[0] = 400;
        System.out.println("arr1 :" + Arrays.toString(arr1));
        System.out.println("arr3 :" + Arrays.toString(arr3));
        toString : 그 객체를 설명해주는 문자열을 리턴한다 
        Copyof : 특정 배열의 원하는 길이만큼 새로운 배열로 복사하는 메소드 함수 */

        
        
        int[] arr1 = {100, 200, 300};
        System.out.println("arr1 : " +arr1);

        int[] arr2 = null;
        System.out.println("arr2 : " +arr2);
        System.out.println(Arrays.toString(arr1));

        arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr2 : " +arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

