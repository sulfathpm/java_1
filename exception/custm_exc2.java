import java.util.Scanner;

class Myexcepton extends Exception{
    public Myexcepton(String message){
        super(message);
    }
}
public class custm_exc2 {
    static void withdraw(int blnc,int amt){
        try{
        if(amt>blnc){
            throw new Myexcepton("insufficient balance");
        }
        System.out.println("withdrawing "+amt);
        }catch(Myexcepton e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("blnc,amt?");
            int blnc=sc.nextInt();
            int amt=sc.nextInt();
            withdraw(blnc, amt);
        System.out.println("Transaction attempt finished.");
    }
}
