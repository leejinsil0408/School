
public class Wednesday extends foodkim {
    //수요일 샌드위치 재료 빵, 버터, 단호박
    //단호박 샌드위치

    public String name;
    public String sweetPumkin;

    public Thursday(String name, String sweetPumkin) {
        this.name = "단호박 샌드위치";
        this.sweetPumkin = "단호박";
    }

    public void info() {
        System.out.println("오늘은 수요일, " + this.name + " 입니다.");
        System.out.println("-----" + this.name + " 재료-----" );
        System.out.println(this.sweetPumkin + "이 필요합니다.");
    }
}
