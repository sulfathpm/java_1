import java.util.Scanner;

class Myexcepton extends Exception{
    public Myexcepton(String message){
        super(message);
    }
}
public class custm_exc {
    static void withdraw(int blnc,int amt) throws Myexcepton{
        if(amt>blnc){
            throw new Myexcepton("insufficient balance");
        }
        System.out.println("withdrawing "+amt);
    }

    public static void main(String[] args) {
        try{

            Scanner sc=new Scanner(System.in);
            System.out.println("blnc,amt?");
            int blnc=sc.nextInt();
            int amt=sc.nextInt();
            withdraw(blnc, amt);
        }catch(Myexcepton e){
            System.out.println(e);
        }
    }
}
