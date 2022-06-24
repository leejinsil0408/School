import java.util.Scanner;
import SlimeSlimeextends.*;


public class main {

    public static void main(String[] arg) {
        SlimeGo();
    }

    private static void SlimeGo() {
        RedSlime redSlime = new RedSlime(20, 30, "red", "예쁜이");

        redSlime.initSlime();
        redSlime.getColor();
    }

    private static void usePotion() {
    //용사의 인벤토리에 아이템 번호를 가지고 포션을 사용합니다
    RedPotion redpotion = new RedPotion(30, 1);
    RedPotion redpotion_x3 = new RedPotion(30, 3);

    redpotion.usePotionText();
    int effectHP = redpotion.useitem(20);
    int effectHP_x3 = redpotion_x3.useitem(4);

    System.out.println("용사는 포션을 사용하여 HP " + effectHP + "를 회복하였습니다");
    System.out.println("용사는 포션을 사용하여 HP " + effectHP_x3 + "를 회복하였습니다");
    }
}
