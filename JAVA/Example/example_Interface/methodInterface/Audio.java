package example.example_Interface.methodInterface;

public class Audio implements RemoteControl {
    private int volume;
    //private 쓰는 이유?

    //turnOn() 추상 메소드의 실체 메소드
    public void turnon() {
        System.out.println("Audio를 켭니다");
    }
    //turnOff() 추상 메소드의 실체 메소드
    public void turnoff() {
        System.out.println("Audio를 끕니다");
    }
    //setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}
