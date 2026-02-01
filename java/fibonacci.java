import java.util.*;
public class fibonacci {
    public static int Fibonacci(int n){
         if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=?");
        int n=sc.nextInt();
        System.out.println("nth fibonacci number= "+Fibonacci(n));
        sc.close();
    }
}
