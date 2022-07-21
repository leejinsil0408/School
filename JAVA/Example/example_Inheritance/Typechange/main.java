package example.example_Inheritance.Typechange;
import java.util.Scanner;


public class main {
    public static void main(String[] arg) {
    
    TodoList();
    }

    private static void TodoList() {
        Child Child_A = new Child("책가방",3000);
        Child Child_B = new Child("손가방", 60000);
        Child Child_C = new Child("서류가방", 100000);

        System.out.println("------CHAPTER1. 형변환 전 ------");
        Child_A.goToWork();
        Child_A.goToPCRoom();
        Child_A.buyBranch(50000);
        System.out.println("------child------");

        Child_B.goToWork();
        Child_B.buyBranch(50000);
        Child_B.goToPCRoom();
        System.out.println("------Sister------");

        Child_C.goToWork();
        Child_C.buyBranch(50000);
        Child_C.goToPCRoom();
        System.out.println("------Parent------");

        Parent Not_Child_A = (Parent)Child_A;
        Parent Not_Child_B = (Parent)Child_B;
        Parent Not_Child_C = (Parent)Child_C;

        System.out.println("------CHAPTER2. 형변환 후------");
        Not_Child_A.goToWork();
        // Not_Child_A.goToPCRoom();
        Not_Child_A.buyBranch(50000);

        Child_B.goToWork();
        Child_B.buyBranch(50000);
        // Child_B.goToPCRoom();
        System.out.println("------Sister------");

        Child_C.goToWork();
        Child_C.buyBranch(50000);
        // Child_C.goToPCRoom();
        System.out.println("------Parent------");

        //Parent[] Not_Child_Array = new Parent[3];
        //Not_Child_Array[0] = Child_A;

        //Not_Child_A.goToWork();
        //Not_Child_A.goToPCRoom();
        System.out.println();
        Child Child_AA = (Child)Not_Child_A;
        //Sister Child_BB = (Sister)Not_Child_B;

        Child_AA.goToWork();
        Child_AA.goToPCRoom();
        Child_AA.buyBranch(50000);
        System.out.println("-----child-----");

    }
}
