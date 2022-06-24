package Slimeexample;

public class Slime {
    //필드값 (슬라임의 hp,mp ...)

    public String name;
    public int hp;
    public int mp;

    //생성자 (슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체 만들기
    
    public Slime() {
    this.name = "약한 슬라임";
    this.hp = 1;
    this.mp = 0;
    }

    public void dmg(int dmg) {
        this.hp = this.hp -dmg;
        System.out.println(this.name+"은 " + dmg + "공격을 받았습니다!");
    }

    public int att() {
        System.out.println(this.name+"은 " + 1 + "공격을 했습니다!");
        return 1;
    }

    public void info() {
        System.out.println("-----" + name + "-----");
        System.out.println("HP = " + this.hp);
        System.out.println("HP = " + this.mp);
        System.out.println("  ");
    }

    public void die() {
        if(this.hp <= 0 ) {
            System.out.println("꾸에엑! " + this.name + "을 퇴치하였습니다. ");
            System.out.println("  ");
        } else {
            System.out.println("슬라임이 억울해합니다. ");
            System.out.println("  ");
        }
    
    }
}


//     public Slime(String input_name, int input_hp, int input_mp) {
//         this.name = input_name;
//         this.hp = input_hp;
//         this.mp = input_mp;
//     }


//     public void info() {
//         System.out.println("----------" +name+ "----------");
//         System.out.println("HP = " + this.hp);
//         System.out.println("HP = " + this.mp);
// }
    
// }
