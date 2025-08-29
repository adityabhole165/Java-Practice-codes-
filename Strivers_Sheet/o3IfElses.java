import java.util.Scanner;

public class o3IfElses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks = ");
        int marks  =sc.nextInt();

        char grade;

        if(marks < 25) {
            grade= 'F';
        } else if( marks <= 44) {
            grade = 'E';
        } else if( marks <= 49) {
            grade = 'D';
        } else if( marks <= 59) {
            grade = 'C';
        } else if ( marks <= 69) {
            grade = 'B';
        } else if( marks >= 70 ) {
            grade = 'A';
        } else {
            grade= 'x';
        }
        System.out.println("Grade:" + grade);
        sc.close();


    }
}