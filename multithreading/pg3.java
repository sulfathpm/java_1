import java.util.Scanner;

class Account{
    int blnc;
    synchronized void deposit() throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("amt to depost ? ");
        int amt=sc.nextInt();
        blnc+=amt;
        System.out.println("new blnc : "+blnc);

    }
    synchronized void withdraw() throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("amt to withdraw? ");
        int amt=sc.nextInt();
         if (blnc < amt) {
            System.out.println("Insufficient balance");
        } else {
            blnc -= amt;
            System.out.println("Remaining balance: " + blnc);
        }
    }
}

public class pg3 {
    public static void main(String[] args) {
        Account a=new Account();
        Thread t1=new Thread(()->
        {
            for (int i = 0; i < 3; i++) {
                try{
                    a.withdraw();
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    );
    Thread t2=new Thread(()->
    {
        for (int i = 0; i < 3; i++) {
            try{
                a.deposit();
                Thread.sleep(500);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
);
t2.start();
t1.start();


    }
}
