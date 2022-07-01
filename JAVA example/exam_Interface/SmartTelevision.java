package exam_Interface;


public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    public void turnOn() {
        System.out.println("tv 켬");
    }
    public void turnOff() {
        System.out.println("tv 끔");
    }

    public void setvolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" " + volume);
    }
    
    public void search(String url) {
        System.out.println(url + " ");
    }
}
