
//Extends를 통해 NamalSlime의 데이터를 물려받았습니다 (상속)
public class RedSlime extends NormalSlime {

    public String color;

    public RedSlime(int hp, int mp, String color, String name) {
        this.hp = hp;
        this.mp = mp;
        this.color = color;
        this.name = name;
    }

    public void getColor() {
        System.out.println("슬라임의 색상은 " + this.color + " 입니다.");
    }
}
