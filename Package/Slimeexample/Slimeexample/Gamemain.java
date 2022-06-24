package Slimeexample;
import java.util.ArrayList;
import java.util.Scanner;

import Slimeexample.Warrior;
import Slimeexample.WarriorType;


public class Gamemain {
    public static void main(String[] arg) {

        String WarriorName = "";
        String input_2 = ""; 

        Scanner scan2 = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("* * * * * SlimeGame * * * * *");

        boolean game = true;

        // while(game) {
        System.out.println("용사의 직업을 선택하세요");
        System.out.println("1.기사");
        System.out.println("2.마법사");
        System.out.println("3.궁수");
        int warriorjob = scan2.nextInt();
        WarriorType.warriortype(warriorjob);


        System.out.println("용사의 이름을 적어주세요");
        WarriorName = scan.nextLine();
        



        boolean checkwarriorjob = true;
        
        System.out.println("입력한 정보로 시작하시겠습니까? 맞으면 yes, 아니면 no를 입력해주세요");
        

        Warrior warrior = new Warrior(WarriorName, 1000, 3000 );

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
