// import package0001.*;
// import package0002.Overloading;
// import package0003.*;
import java.util.Scanner;
import package0004.*;
import package0004.Computermake.CheckYn;
import package0004.Computermake.OsCheck;

import java.util.ArrayList;


public class main {
    public static void main(String[] arg) {
        Scanner computer = new Scanner(System.in); 
    

    //    -------------------------- package0004 (선생님꺼) -------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("OS타입을 입력해주세요.");
        System.out.println("1. MAC OS 일 경우 1을 입력하세요");
        System.out.println("2. windows OS 일 경우 2를 입력하세요");

        int osType = input.nextInt();
        OsCheck.osCheck(osType);

        boolean checkComputerwile = true;
        ArrayList<String> computerArray = new ArrayList<String>();

       

        while(true) {
            System.out.println("컴퓨터 사양을 입력해주세요.");
            System.out.println("ex) cpu:i7, ram:8g, ssd:128g ..");

            computerInputData = input.nextLine();
            System.out.println("입력하신 내용이 다음과 같습니까? 맞으면 yes, 아니면 no를 입력해주세요.");

            System.out.println(computerInputData);
            checkOk = input.nextLine();

            branch = CheckYn.CheckYn(checkOk, "inputCheck");
            if(branch) {
                computerArray.add(computerInputData);
            }
             else {
                continue;
            };

            System.out.println("데이터를 계속 입력하겠습니까? 맞으면 yes, 아니면 no를 입력해주세요.");
            checkOk = input.nextLine();
            branch = CheckYn.CheckYn(checkOk, "brakeCheck");

            if(branch) {
                continue;
            } else {
                break;
            }
        
        
            //입력구문 출력
            for(String i : computerArray) {
                System.out.println(i);
                String[] splitCheck = i.split(",");
                for(String j : splitCheck) {
                String[] dataCheck = j.split(",");
                    }
                }
            }
        }
    }
    

    // 배열을 ,와 : 기준으로 분해하여 저장
    // input 데이터 무결성 체크 (데이터가 잘 왔는지 확인)
    // 인자값을 통해 인스턴스 생성자 생성
    // 인스턴스 생성자를 배열에 추가
    //     }
    // }   



        //계획서
        //학생의 데이터를 받고, 객체를 출력해서 점수나 코멘트 보기

        //데이터 받아오는 방식 : API(네트워크) / Excel파일 읽어오기(파일 로딩) / CLI(terminal에서 데이터 받아오기, scanner사용)

        //조별 실행학습 = 취업, 평가지
        //김준석 선생님은 컴퓨터를 사고싶다.
        //프로그래밍으로 사고 싶은 컴퓨터의 성능 지표를 출력하는 시스템 개발하고 싶다.
        //데이터를 받아오고, 그 데이터를 통해 컴퓨터의 성능을 출력하는 시스템 개발
        //컴퓨터 이름(맥북pro 2021)
        //cpu성능
        //RAM
        //SSD(하드디스크)
        //단, 데이터가 없는 필드값에 대해 오버로딩으로 처리하세요.
        //extra. 데이터가 부족할 경우, 여러 데이터를 동시에 받을 경우에 대해 고민해보세요
        //extra. 배열, if문, for문 복합적으로 쓰시면 어떨까요?
        //Scanner로 데이터를 받아옵니다.







        // -----------------------------------package 0003 -----------------------------------

        //Scanner 인스턴스 생성
        // Scanner input = new Scanner(System.in);
        // System.out.println("Student Name");
        // String inputStudentName = input.nextLine();

        // System.out.println("Subject Name");
        // String inputSubjectName = input.nextLine();

        // System.out.println("Grade Name");
        // int inputGradeName = input.nextInt();

        // System.out.println("student = " + inputStudentName + " // subject = " + inputStudentName + " // grade = " + inputGradeName);

        // //input데이터 무결정 체크 (데이터가 잘 왔는지 확인)

        // //인자값을 통해 인스턴스 생성자 생성
        // StudentGrade student = new StudentGrade();
        // StudentGrade student_1 = new StudentGrade(inputStudentName);
        // StudentGrade student_2 = new StudentGrade(inputStudentName, inputSubjectName, inputGradeName);

        // System.out.println(student.ClassName);
        // System.out.println("----------");
        // System.out.println(student_2.ClassName);
        // System.out.println(student_2.name);
        // System.out.println(student_2.subject);
        // System.out.println(student_2.grade);
        // System.out.println("----------");







       // -----------------------------------package 0002 -----------------------------------

        // System.out.println("car1.company : " + car1.company); //매개변수 받은 것 
        // System.out.println();

        // Overloading car2 = new Overloading("model_name");
        // //컴퍼니는 이미 패키지에 지정되어있어 model부터 시작 
        // System.out.println("car2.company : " + car2.company);
        // System.out.println("car2.model : " + car2.model);
        // System.out.println();   

        // Overloading car3 = new Overloading("model_name", "black");
        // System.out.println("car3.company : " + car3.company);
        // System.out.println("car3.model : " + car3.model);
        // System.out.println("car3.color : " + car3.color);
        // System.out.println();   
        
        // Overloading car4 = new Overloading("model_name", "black", 200);
        // System.out.println("car3.company : " + car4.company);
        // System.out.println("car3.model : " + car4.model);
        // System.out.println("car3.color : " + car4.color);
        // System.out.println("car3.color : " + car4.maxSpeed);
        // System.out.println();   






        // -----------------------------------package 0001 -----------------------------------
        // //인스턴스 생성
        // Car myCar = new Car();
        // Car anotherCar = new Car();
    
        // //인스턴스 내용 출력
        // System.out.println(": " + myCar.company);
        // System.out.println(": " + myCar.model);
        // System.out.println(": " + myCar.color);
        // System.out.println(": " + myCar.maxSpeed);
        // System.out.println(": " + myCar.speed);


        // //인스턴스의 값 출력
        // myCar.speed = 3000;
        // System.out.println("myCar : " + myCar.speed);
        // System.out.println("anotherCar : " + anotherCar.speed);

        /* 
        int check = myCar.speedCheck();
        System.out.println("this speed = " + check);
        System.out.println("calc speed = " + Calc.calcTest(check)); */
    


