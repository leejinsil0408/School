class solution {

    public static void main(String[] arg) {
        int price = 3; //3이라는 값을 price라는 변수명에 대입. int는 타입
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
        // 프린틴 메소드 실행하여 출력한다. 프린트인은 솔루션 메소드 실행. 그 메소드 안에 price, money, count가 있다. 
    }
    
    public static long solution(int price, int money, int count) {
                // long은 리턴타입
        long answer = -1; // 리턴값
        long sum = 0;
            // int는 정수
        for(int i =1; i<count+1; i++) { 
        sum += price * i;
    }

        if(sum > money) {
            answer = sum - money;
        }
        return answer;
    }
}
