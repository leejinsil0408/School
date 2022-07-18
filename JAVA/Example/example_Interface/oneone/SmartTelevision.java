package example.example_Interface.oneone;


public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    public void turnOn() {
        System.out.println("tv 켬");
    }
    public void turnOff() {
        System.out.println("tv 끔");
    }

    public void setvolume(int volume) {
        if(volume> MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume< MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" " + volume);
    }
    
    public void search(String url) {
        System.out.println(url + " ");
    }
}