public class Tuesday extends foodkim {
    //화요일 샌드위치 재료 빵, 버터, 상추, 베이컨
    //상추베이컨 샌드위치
    public String name;
    public String lettuce;
    public String bacon;

    public Tuesday(String name, String lettuce,String bacon) {
        this.name = "상추베이컨 샌드위치";
        this.lettuce = "상추";
        this.bacon = "베이컨";
    }

    public void info() {
        System.out.println("오늘은 화요일 ");
        System.out.println("-----" + this.name + "-----" );
        System.out.println("재료는 " + s);
    }
    }
