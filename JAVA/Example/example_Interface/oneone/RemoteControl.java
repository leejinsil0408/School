package example.example_Interface.oneone;

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setvolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음");
        } else {
            System.out.println("무음 해제");
        }
    }
    
    static void changeBattery() {
        System.out.println("배터리 교체");
    }
}
