package arithmetic;
import java.util.*;
public class op implements menu{
    public void show(int c){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no.s:");
        switch (c) {
            case 1:
                System.out.println(add(sc.nextInt(),sc.nextInt()));
                break;
            case 2:
                System.out.println(sub(sc.nextInt(),sc.nextInt()));
                break;
            case 3:
                System.out.println(div(sc.nextInt(),sc.nextInt()));
                break;
            case 4:
                System.out.println(mul(sc.nextInt(),sc.nextInt()));
                break;
        
            // default:
            //     System.exit(0);
            //     break;
        }
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return  a*b;    
    }
    public int div(int a,int b){
        return a/ b;
    }
}
