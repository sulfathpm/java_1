import java.util.*;
interface showable {
    public void show(Pgstudent[] students);
}
class Person{   
        Scanner sc=new Scanner(System.in);
    Person (){
        System.out.println("enter name,gender,phn?");
    String name1=sc.next();
    String gender=sc.next();
    String phn=sc.next();
    }
}
class Student extends Person{
    String course;
    int score;
    Scanner sc=new Scanner(System.in);
    Student(){
        System.out.println("Enter course,score?");
        course=sc.next();
        score=sc.nextInt();
    }

}
class Pgstudent extends Student{
    String rarea,guide;
    Scanner sc=new Scanner(System.in);
     Pgstudent(){
        System.out.println("Enter reaserch-area,guide?");
        rarea=sc.next();
        guide=sc.next();
    }
public String toString(){
    return name1+'|'+course+'|'+score+'|'+rarea; 
}
}
public class pg13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total no. of students:");
        int n=sc.nextInt();
        Pgstudent p[]=new Pgstudent[n];
        showable printer=(Pgstudent[] students)->
        {
            for(Pgstudent s:students)
                System.out.println(s);
        };
        for (int index = 0; index < n; index++) {
            p[index]=new Pgstudent();
            Arrays.sort(p,(a,b)->b.score-a.score);
            System.out.println("\nsorted by rank:");
            printer.show(p);
            Arrays.sort(p,(a,b)->a.rarea.compareToIgnoreCase(b.rarea));
            System.out.println("sorted based on resaerch-arae:");
            printer.show(p);
        }
    }
}
