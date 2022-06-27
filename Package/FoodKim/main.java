import java.util.ArrayList;

public class main {
   
    public static void main(String[] numbers) {

        Monday Monday = new Monday();
        Tuesday Tuesday = new Tuesday();
        Wednesday wednesday = new Wednesday();
        Thursday Thursday = new Thursday();
        Friday Friday = new Friday();


        // String[] weeks = new String[4];
        // System.out.println(weeks[3]);

        String[] weeks = {"월","화","수","목","금"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        System.out.println(weeks[1]);



        Monday.info();
        System.out.println("------------------------------------------");
        Tuesday.info();
        System.out.println("------------------------------------------");
        wednesday.info();
        System.out.println("------------------------------------------");
        Thursday.info();
        System.out.println("------------------------------------------");
        Friday.info();
        System.out.println("------------------------------------------");

    }



}