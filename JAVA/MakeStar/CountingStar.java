package JavaExample.MakeStar;
public class CountingStar {

    public static void main(String[] arg) {

        /*
        //직사각형 만들기
        int x;
        int y;

        for(x=0; x<6; x++) {
        for(y=0;y<6; y++) {
        System.out.print("*");
        }System.out.println("*");
        }
        }
         */


        // 직각삼각형 만들기
        
        /*
        int x;
        int y;
          
        for(y=0; y<10; y++) {
        for(x=0; x<y; x++) {
        System.out.print("1");
        }
        System.out.println("3");
        }
        }
        } 
        */
         

        // 반대 직각삼각형 만들기2

        int x;
        int y;
        int j;
        for(x=0; x<7; x++) {
            for( y=0; y<6-x; y++) {
            System.out.print("1");
        }
        for(j = 0; j<x; j++) {
        System.out.print("*");
        }
        System.out.println("");
        } 
    }
}



        //역직각삼각형 만들기
/* 
        int x;
        int y;

        for(y=10; y>0; y--) {
            for(x=0; x>0-y; x--) {
                System.out.print("*");
            }
            System.out.println("1");
        }
    }
} */


// 정삼각형 만들기

// 마름모 만들기
// 원 만들기
