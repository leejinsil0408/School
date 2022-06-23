package Slimeland;
import java.util.Scanner;


public class main3 {
    public static void main(String[] arg) {

        String input_1 = "";
        String input_2 = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사의 이름을 적어주세요");
        input_1 = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("용사의 직업을 선택하세요");
        System.out.println("1.마법사 2.기사 3.궁수");

        input_2 = scan.nextLine();

        Warrior warrior = new Warrior(input_1, 1000, 3000 );

        warrior.info();

        System.out.println("<< 슬라임월드에 입장하였습니다. >>");
        System.out.println("슬라임이 나타났습니다!");
        System.out.println("");

        Slime slime_weak = new Slime();
        
        slime_weak.info();

        String input2 = "";
        System.out.println("1 : 공격 2 : 회피 3 : 스킬 ");
        Scanner scan3 = new Scanner(System.in);
        input2 = scan2.nextLine();

        slime_weak.dmg(5);
        slime_weak.die();
        

        System.out.println("-----약한슬라임-----");
        System.out.println("HP : " + slime_weak.hp);
        System.out.println("MP : " + slime_weak.mp);
        

    
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자,,용사 객체 생성(1명)
        // while문
        // 슬라임은 증식을 한다
        // 용사는 슬라임을 공격하여 슬라임은 죽는다
        // 용사 객체 생성(1명)
        // 슬라임 몬스터 생성(다수)
        // 용사의 공격(1턴)
        // 슬라임의 공격(1턴)
        // if(모든 슬라임이 죽을 경우) break;
    
    }
}
