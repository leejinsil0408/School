public class Warrior {
    public String name;
    public int hp;
    public int mp;

    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }
    

    public int att() {
        return 10;
    }

    public int att_A() {
        this.mp = this.mp - 10;
        return 30;
    }

    public int att_B() {
        this.mp = this.mp - 20;
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
    }

    public void info() {
        System.out.println("----------" + name + "----------");
        System.out.println("현재 HP = " + this.hp);
        System.out.println("현재 MP = " + this.mp);
    }
}
