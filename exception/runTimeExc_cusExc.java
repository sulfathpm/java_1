import java.util.Scanner;

// Change 'Exception' to 'RuntimeException'
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}

public class CustomExc {
    // No 'throws' keyword needed anymore!
    static void withdraw(int blnc, int amt) {
        if (amt > blnc) {
            throw new MyRuntimeException("Insufficient balance!");
        }
        System.out.println("Withdrawing: " + amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter blnc, amt:");
        int blnc = sc.nextInt();
        int amt = sc.nextInt();

        // The try-catch is now OPTIONAL. 
        // If you remove it, the program will simply crash with the error message.
        try {
            withdraw(blnc, amt);
        } catch (MyRuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}