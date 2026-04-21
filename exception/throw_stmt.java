import java.util.Scanner;

public class throw_stmt {
    static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
    public static void main(String[] args) {
        try{
            int age;
            Scanner sc=new Scanner(System.in);
            System.out.println("age?");
            age=sc.nextInt();
            validateAge(age);
            System.out.println("valid age");
        }catch(IllegalArgumentException e){
            System.out.println("exception : "+e);
        }
    }
}
