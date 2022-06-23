package Slimeland;
import Slimeland.WarriorType;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    public String WarriorType;

    public Warrior(String input_name, int input_hp, int input_mp) {
    this.name = input_name;
    this.hp = input_hp;
    this.mp = input_mp;
    // this.WarriorType = input_WarriorType;

    }

    public void info() {
        System.out.println("-----" + this.name + "-----");
        System.out.println("hp : " + this.hp );
        System.out.println("mp : " + this.mp );
        System.out.println("mp : " + this.mp );
        System.out.println("mp : " + this.mp );

        System.out.println(" Game Start! ");
    }
}
