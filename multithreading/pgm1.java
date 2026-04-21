class Person {
    String name;
    public Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int rollno;
    double mark;
    Student(String name,int rollno,double mark){
        super(name);
        this.rollno=rollno;
        this.mark=mark;
    }
    void print_details(){
        System.out.println("Roll no "+rollno+"Nmae : "+name+" Mark : "+mark);
    }

}

public class pgm1 {
    
}
