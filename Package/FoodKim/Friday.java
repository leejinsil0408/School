
public class Friday extends foodkim {
    //금요일 샌드위치 재료 빵, 버터, 아보카도, 계란
    //아보카도 샌드위치
    public String name;
    public Stirng avocado;
    public Stirng egg;
    
    public Friday(String name, String butter, String bread) {
        this.name = "아보카도 샌드위치";
        this.avocado = "아보카도";
        this.egg = "계란";
    }

    public void info() {
        System.out.println("오늘은 금요일, " + this.name + " 입니다.");
        System.out.println("-----" + this.name + " 재료-----" );
        System.out.println(this.avocado + "와 " + this.egg + "가 필요합니다.");
    }
}
