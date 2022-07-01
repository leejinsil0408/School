package weaponoverriding;
public class Slime {
    
    public String name;
    public String color;
    public int hp;
    public int mp;
    public int exp;

    public void initSlime() {
        System.out.println(this.name+" 슬라임이 태어났습니다");
    }

    public String getName() {
        return this.name;
    }

    public int att() {
        return 10;
    }

    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은 " + dmg + "공격을 받았습니다");
    }

}
