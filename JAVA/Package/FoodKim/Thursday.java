package FoodKim;
public class Thursday extends foodkim {
    //목요일 샌드위치 재료 빵, 버터, 계란, 샐러드
    //에그샐러드 샌드위치
    public String name;
    public String egg;
    public String salad;
    
    public Thursday() {
        this.name = "에그샐러드 샌드위치";
        this.egg = "계란";
        this.salad = "샐러드";
    }

    public void info() {
        System.out.println("오늘은 목요일, " + this.name + " 입니다.");
        System.out.println(" * * * " + this.name + " 재료 * * * " );
        System.out.println(this.egg + "과 " + this.salad + "가 필요합니다.");
    }
}
