package PACKAGE_NAME;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //원본배열
        int[] arr = {1, 2, 3, 4, 5};

        //배열뒤집기
        int[] reverseArr = new int[5];

        //원본배열(arr)의 마지막 인덱스(int i = arr.length -1)부터 탐색하여
        //뒤집은배열(reverseArr)에 순서대로 값 세팅
        for(int i = arr.length -1, j = 0; i>=0; i--,j++) {
            reverseArr[j] = arr[i];
        }

        System.out.println("arr " + Arrays.toString(arr));
        System.out.println("reverseArr: " + Arrays.toString(reverseArr));
    }
}
