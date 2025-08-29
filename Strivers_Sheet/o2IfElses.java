import java.util.Scanner ;

public class o2ifElses{
    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in);

        int marks = sc.nextInt();
        char grade = 'F';
        if(marks < 25) {
            grade = 'F';
            System.out.println("GRADE:"+ grade);
        } else if (marks >= 25 && marks <= 44 ) {
            grade = 'E';
            System.out.println("GRADE:" + grade );
        } else if ( marks > 44 && marks <= 49 ) {
            grade = 'C';
            System.out.println("GRADE:" + grade) ;
        } else if (marks > 49 && marks <= 59) {
            grade = 'B';
            System.out.println("GRADE:" + grade) ;
        }  else if( marks > 59 &&  marks <= 70) {
            grade = 'A';
            System.out.println("GRADE:" + grade) ;
        } else {
            System.out.println("Invalid Marks") ;
            
        }
        sc.close();
    }
}