package example.example_Class.Values;

//216p 매개변수의 수를 모를 경우
public class Computer {

    //매개변수를 배열로 선언한 sum1()
    int sum1(int[] values) {
        int sum=0;
        for(int i= 0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    //매개변수를 "..."로 선언한 sum2()
    int sum2(int ...vlues) {
        int sum=0;
        for(int i=0; i<vlues.length; i++) {
            sum += vlues[i];
        }
        return sum;
    }

    //sum1()과 sum2() 메소드의 실행문이 일치함. 선언 방법만 다를 뿐 매개변수의 타입이 배열이므로 처리 내용 걑음

}
