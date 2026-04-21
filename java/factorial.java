import java.util.*;
public class factorial {
    public static int Factorial(int n){
        if(n==0||n==1)
            return 1;
        else
            return n*Factorial(n-1);
    }

    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+"="+Factorial(n));
        sc.close();
    }
}
