import SlimeLend.*;


public class main3 {
    public static void main(String[] arg) {
    
        Slime slime_weak = new Slime();
        slime_weak.info();
        slime_weak.dmg(5);
        slime_weak.die();
    
        System.out.println("-----정명훈-----");
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
