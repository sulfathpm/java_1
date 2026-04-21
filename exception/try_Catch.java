public class try_Catch {
    public static void main(String[] args) {
        int[] a={10,2};
        try{
            //System.out.println("element 3: "+a[3]);
            //System.out.println(10/0);
            String s=null;
            int length1=s.length();
            System.out.println(length1);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Array Index Out Of Bounds Exception occured :"+aie);
        }catch(ArithmeticException ae){
            System.out.println("\nArithmetic Exception occured : "+ae);
        }catch(NullPointerException ne){
            System.out.println("\n"+ne);
        }
        finally{
            System.out.println("finally excuted");
        }
    }
}
