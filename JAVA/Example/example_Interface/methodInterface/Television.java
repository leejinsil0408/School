package example.example_Interface.methodInterface;

import example.example_Interface.methodInterface.RemoteControl;

public class Television implements RemoteControl {
    //필드
    private int volume;

    //turnOn() 추상 메소드의 실체 메소드
    public void turnon() {
        System.out.println("TV를 켭니다");
    }

    //turnOff() 추상 메소드의 실체 메소드
    public void turnoff() {
        System.out.println("TV를 끕니다");
    }

    //setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if(volume> RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨: " + this.volume);
    } // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
}
