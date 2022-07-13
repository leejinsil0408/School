package CheckMento;

public class Exercise182_07 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);
    }


    }
//        int max = 0;
//        int[] array = {1, 5, 3, 8, 2};
//        for (int i = 0; i < 5; i++) {
//            int a = array[i];
//            if (max < a)
//                max = a;
//        }
//    }
//}                                   //선생님 답


//        for(int a:array) {
//            if(max < a) {
//                max = a;
//            }
//            System.out.println("max: " + max);
//        }
                                    //향상된 for문

