import java.util.*;
public class Multiplication{
    public void MultiplicationTable(int n){
        if(n<0)
            System.out.println("invalid no");
        else
            for(int i=1;i<=10;i++){
                System.err.println(n+" x "+i+" = "+(n*i));
            }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("N=?");
       int n=sc.nextInt();
       Multiplication m=new Multiplication();
       m.MultiplicationTable(n);
    }
}
