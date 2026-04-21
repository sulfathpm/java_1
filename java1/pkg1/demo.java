import arithmetic1.*;
import java.util.*;
public class demo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        calc ca=new calc();
        while (true) {
            System.out.println("1.add\n2.sub\n3.mul\n4.div");
            int ch=s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("2 nos:");
                    int a=s.nextInt();
                    int b=s.nextInt();
                    System.out.println("addition:"+ca.add(a, b));
                    break;
                 case 2:
                    System.out.println("2 nos:");
                    int c=s.nextInt();
                    int d=s.nextInt();
                    System.out.println("sub:"+ca.sub(c,d));
                    break;
                case 0:
                    System.exit(0);    
                default:
                    break;
            }
        }
    }
}