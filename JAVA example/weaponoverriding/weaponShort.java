public class weaponShort extends weaponBasic {
    weaponShort() {
        this.name = "숏소드";
        this.AttRange = 2;
        this.ChangeTime = 2;
    }

    @Override
    public void attAction() {
        System.out.println("무기 " + this.name + "을(를) 장착하였습니다.");
        System.out.println("무기의 공격 범위는 " + this.AttRange + "입니다.");
        System.out.println("무기의 교체 시간은 " + this.ChangeTime + "입니다.");
    }
    @Override
    public void destruction() {
        super.destructionBefore(super.defaultName); //부모클래스의 상수를 매개변수로 넣음
        attAction();
    }
}
