package SlimeSlimeextends;

public class RedPotion extends Potion {
    //포션의 효과 증폭 수치 
    public int effect;

    //포션을 생성할 때 효과 수치를 받음
    public RedPotion(int hp, int ettectHP) {
        this.effectHP = hp;
        this.effect = effect;
}

    public int useitem(int invenUseNumber) {
        int result = effectHP * effect;
        return result;
    }
    
}
