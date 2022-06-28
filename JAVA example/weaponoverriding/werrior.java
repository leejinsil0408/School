public class werrior {
    public String name;
    public int hp;
    public int mp;

    public int att() {
        return 10;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
    }

    public void info() {
        System.out.println("----------" + name + "----------");
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
    }
}
