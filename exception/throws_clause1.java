import java.util.Scanner;

public class throws_clause1 {
    static void validatemonth(int m) throws IllegalArgumentException{
        if(m<=0 || m>12){
            throw new IllegalArgumentException("invalid month");
        }
        System.out.println("vlid month");
    }
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("month?");
            int m=sc.nextInt();
            validatemonth(m);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
