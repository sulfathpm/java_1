interface Comparable {
    public double vol();
    public String compare(Comparable c);
}
class cuboid implements Comparable{
    int l,b,h;
    cuboid(){
        l=16;
        b=12;
        h=10;
    }
    public double vol(){
        return l*b*h;
    }
    public String compare(Comparable c){
           if(this.vol()>c.vol()){
            return "cuboid has larger volume"+vol();
           }
           else if(this.vol()<c.vol()){
            return "cylinder has larger vol"+c.vol();
           }
           else{
            return "both-same" +vol();
           }
    }
}
class cylinder implements Comparable{
    int r,h;
    cylinder(){
        r=12;
        h=10;
    }
    public double vol(){
        return Math.PI*h*Math.pow(r,2);
    } 
    public String compare(Comparable b){
        return " ";
    }
}
public class pg12 {
    public static void main(String[] args) {
        Comparable a=new cuboid();
        System.out.println("area of"+a.compare(new cylinder()));
    }
}
