package Me;
import java.util.concurrent.TimeUnit;

public class kim implements Remote {
    public void tv_remote(int input_channel) {
        try {
            for (int i=0; i<5; i++) {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("김준석의 채널" + input_channel + "번 화면 출력");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}