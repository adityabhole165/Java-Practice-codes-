import java.util.Scanner;
public class EgIfElse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks = sc.nextInt();
        char grade ='F' ;

        if(marks >= 90) {
            grade ='A';
        } else if(marks >= 70 ) {
            grade =  'B';
        } else if( marks >= 50) {
            grade = 'C';
        } else if( marks >= 35) {
            grade = 'D';
        } else {
            System.out.println("Fail");
        }
        System.out.println("Grade = " + grade);
        sc.close();
    }
}