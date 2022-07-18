package weaponoverriding;

public class weaponBasic {
    public final String defaultName = "주먹";
    public final int defaultAttRange = 1;
    public final int defaultChangeTime = 1;

    public String name = "주먹";
    public int AttRange = 1;
    public int ChangeTime = 1;


    public void attAction() {
        System.out.println("무기 " + this.name + "을(를) 장착하였습니다.");
    }

    public void destruction() {
        System.out.println("무기가 파괴되었습니다.");
    }

    public void destructionBefore(String input_name) {
        this.name = input_name;
    }

    
}
