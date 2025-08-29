import java.util.Scanner ;

public class o1IfElses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an Adult");
        }
        sc.close();
    }
}