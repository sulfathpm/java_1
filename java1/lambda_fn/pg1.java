interface Dim {
        double area(int x);                                                             
    
}
public class pg1 {
    public static void main(String[] args) {
        Dim square=(x)->x*x;
        Dim cube=(x)->x*x*x;
        Dim circle=(x)->2*Math.PI*x;
        Dim sphere=(x)->(4/3)*Math.PI*x*x;
        System.out.println("sq:"+square.area(5)+"cube:"+cube.area(5)+"circle:"+circle.area(1)+"sphere:"+sphere.area(1));
    }
}
