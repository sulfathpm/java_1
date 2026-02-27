package arithmetic1;
public class calc implements arithmeticop{

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
     }
    public double div(double a,double b){
        if(b==0){
            System.out.println("Error:division by zero");
            return Double.NaN;
        }
        return a/b;
    }
}
