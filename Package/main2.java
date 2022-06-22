import java.util.Scanner;
import SlimeSlime.*;


public class main2 {

    public static void main(String[] arg) {
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자,,용사 객체 생성(1명)

        //string 메모리를 적게 쓰는 법은?
        String input = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사를 정해주세요");
        //키보드 입력값을 input 변수에 할당 
        input = scan.nextLine();

        Warrior warrior = new Warrior(input, 1000, 5000);




        // while문 (슬라임과 용사가 열심히 반복적으로 싸우는 구역)
        // while (true) {

            warrior.info();

            // 텍스트 랜덤으로 입력값 받기 (랜덤함수와 아스키코드 랜덤 출력)
            // 슬라임 몬스터 생성(다수)
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            int input_hp = 30;
            int input_mp = 3;

            Slime slime_normal = new Slime();
            Slime slime_A = new Slime(input_name_1, input_hp, input_mp);
            Slime slime_B = new Slime(input_name_2, input_hp, input_mp);
            Slime slime_C = new Slime(input_name_3, input_hp, input_mp);
            Slime slime_D = new Slime(input_name_4, input_hp, input_mp);

            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();


            // 슬라임은 증식을 한다


            System.out.println("---------Slime_A----------");
            System.out.println(slime_A.name);
            System.out.println(slime_A.hp);
            System.out.println(slime_A.mp);

            System.out.println("---------Slime_B----------");
            System.out.println(slime_B.name);
            System.out.println(slime_B.hp);
            System.out.println(slime_B.mp);

            // 용사의 공격(1턴)
            slime_B.dmg(5);

            System.out.println("---------Slime_B----------");
            System.out.println(slime_B.name);
            System.out.println(slime_B.hp);
            System.out.println(slime_B.mp);

            // 슬라임의 공격(1턴)
            slime_A.dmg(slime_B.att());

            // 용사는 슬라임을 공격하여 슬라임은 죽는다

            // if(모든 슬라임이 죽을 경우) break;
        }

    }