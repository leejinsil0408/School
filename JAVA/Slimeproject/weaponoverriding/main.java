package weaponoverriding;
public class main {

    /* 용사는 슬라임을 잡기 위해 무기 교체 시스템을 개발하려고 합니다
    상속과 오버라이딩을 사용하여
    주먹,숏소드,롱소드,랜스 4가지의 무기타입을 교체합니다.
    필드명 AttRange, ChangeTime 으로 무기 교체 시간과 공격 범위를 상속받고
    메서드 attAction으로 이벤트를 발생시키시오

    //어려운 문제
    용사와 슬라임 3마리가 자동으로 싸우며 랜덤으로 무기를 교체하고 효율적으로
    자동전투를 할 수 있는 시스템을 개발하시오
    다 만들면 포션의 개수와 공격력 랜덤 출력하는 게임 시스템을 추가하여
    용사 1턴마다 효율적인 공격방식을 재구성하는 알고리즘을 만드시오
    
    무기공격력,공격범위 

    용사 입장에서 슬라임의 수를 확인한다
    용사 입장에서 가지고 있는 무기 타입의 공격범위와 공격력을 확인한다
    용사 입장에서 가지고 있는 무기 타입을 교체하는 시간까지 고려하여 연산
    효율적인 방식을 선택하여 진행 */

    
    public static void main(String[] arg) {

        CreateSlime();

    }

    public static void CreateSlime() {

        System.out.println(" * * * Game Start * * * ");

        String[] arrSlimeName = new String[4];
        arrSlimeName[0] = "검은색";
        arrSlimeName[1] = "붉은색";
        arrSlimeName[2] = "푸른색";
        arrSlimeName[3] = "초록색";

        int num = (int)(Math.random()*arrSlimeName.length);
                //랜덤함수 뽑기, int는 정수로 뽑겠다는 뜻

        int input_hp = (int)(Math.random()*100);
        int input_mp = (int)(Math.random()*30);
        RedSlime red_1_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        input_hp = (int)(Math.random()*100);
        input_mp = (int)(Math.random()*30);
        RedSlime red_2_slime = new RedSlime(input_hp,input_mp,arrSlimeName[num], arrSlimeName[num]);

        red_1_slime.getColor();
        System.out.println(red_1_slime.getName()+"의 공격력은 " +red_1_slime.att() + "입니다.");
        red_1_slime.att();

        red_1_slime.getColor();
        System.out.println(red_2_slime.getName()+"의 공격력은 " +red_1_slime.att() + "입니다.");

    } 

        public static void weaponBasic() {
        weaponlance lance = new weaponlance();
        weaponLong long_1 = new weaponLong();
        weaponShort short_1 = new weaponShort();

        lance.attAction();
        lance.destruction();

    }

    public static void Warrior() {
        Warrior warrior = new Warrior("이진실",1000, 500);
        warrior.info();
        warrior.att();
        System.out.println();
        
    }
}
