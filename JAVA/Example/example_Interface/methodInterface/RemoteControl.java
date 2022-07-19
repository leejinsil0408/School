package example.example_Interface.methodInterface;
//p348 인터페이스
// 상수와 메소드만으로 구성 (메소드:상수,추상,디폴트,정적)
public interface RemoteControl {

    //상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상 메소드
    public void turnon();
    public void turnoff();
    public void setVolume(int volume);     //메소드 선언부만 작성(추상 메소드)

    //디폴트 메소드
    default void setmute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다");
        }else {
            System.out.println("무음 해제합니다");      //실행 내용까지 작성 ,클래스 인스턴스 메소드와 동일
        }
    }

    //정적 메소드
    static void ChangeBattery() {
        System.out.println("건전지를 교환합니다");
    }
}