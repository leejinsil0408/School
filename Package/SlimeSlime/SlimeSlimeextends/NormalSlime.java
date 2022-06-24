package SlimeSlimeextends;

public class NormalSlime {
    //필드값    우리의 슬라임은 1lv의 갸냘픈 슬라임입니다.
    public int hp;
    public int mp;
    public String name;
    public int exp;

    public void initSlime() {
        System.out.println(this.name + " 슬라임이 태어났습니다");
    }
}