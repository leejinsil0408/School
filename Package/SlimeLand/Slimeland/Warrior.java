package Slimeland;
public class Warrior {
    public String name;
    public int hp;
    public int mp;

    public Warrior(String input_name, int input_hp, int input_mp) {
    this.name = input_name;
    this.hp = input_hp;
    this.mp = input_mp;

    }

    public void info() {
        System.out.println("-----" + this.name + "-----");
        System.out.println("hp : " + this.hp );
        System.out.println("mp : " + this.mp );
        System.out.println(" Game Start! ");
    }
}
