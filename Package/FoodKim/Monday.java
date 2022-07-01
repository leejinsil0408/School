package FoodKim;
public class Monday extends foodkim {
    //월요일 샌드위치 재료 빵, 버터, 블루베리, 베이컨
    //블루베리샌드위치
    public String name;
    public String Bluebarry;
    public String bacon;

    public Monday() {
        this.name = "블루베리 샌드위치";
        this.Bluebarry = "블루베리";
        this.bacon = "베이컨";
    }

    public void info() {
        System.out.println("오늘은 월요일, " + this.name + " 입니다.");
        System.out.println(" * * * " + this.name + " 재료 * * * " );
        System.out.println(this.Bluebarry + "와 " + this.bacon + "이 필요합니다.");
    }
}
