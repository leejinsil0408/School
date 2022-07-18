package example.example_Interface.oneone;

import java.util.Scanner;

// import exam_Interface.SmartTelevision;

public class RemoteControlExample {
    
    public static void main(String[] arg) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl.changeBattery();

        Audio audio_A = new Audio();

        audio_A.turnOn();
        audio_A.turnOff();
        audio_A.setMute(true);
        audio_A.setvolume(15);

        tv.setMute(true);

        RemoteControl rc = tv;
        Searchable searchable = tv;

    }
}
