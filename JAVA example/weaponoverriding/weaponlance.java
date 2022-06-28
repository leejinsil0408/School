public class weaponlance extends weaponBasic {
    weaponlance() {
        this.name = "랜스";
        this.AttRange = 2;
        this.ChangeTime = 3;
    }

    @Override //메서드 재정의
    public void attAction() {
        System.out.println("무기 " + this.name + "을(를) 장착하였습니다.");
        System.out.println("무기의 공격 범위는 " + this.AttRange + "입니다.");
        System.out.println("무기의 교체 시간은 " + this.ChangeTime + "입니다.");
    }

    @Override
    public void destruction() {
        super.destructionBefore(super.defaultName); 
        //주먹 = this.name
        //부모클래스의 상수를 매개변수로 넣음
        attAction();
    }
}