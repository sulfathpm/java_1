import arithmetic.*;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        op obj=new op();
        while(true){
            System.out.println("1.add\n2.sub\n3.div\n4.mul\nchoice?");
            obj.show(sc.nextInt());
            System.out.println("cntnue?");
            if(sc.nextInt()==0)
                System.exit(0);
        }
    }
}
