import java.util.*;
public class CheckPrime {
    public void prime(int n){
        if(n<=1)
            System.out.println("Not prime");
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("not prime");
                    return;
                }
            }
            System.out.println("prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=?");
        int n=sc.nextInt();
        CheckPrime c=new CheckPrime();
        c.prime(n);
        sc.close();
    }
}
