/*class Oops{
    String colour;

    void reset() 
    {
        System.out.println("Car Started");
    }
}
    public class Main 
    {
    
    public static void main(String[]args)
    {
    Oops c1=new Oops();
        c1.colour="red";
        c1.reset();
        System.out.println(c1.colour);
    }
}*/

class Student{
    String name;
    String dept;
    int age;
    int roll_no;
    void display(){
        System.out.println("NAME "+name);
        System.out.println("DEPT "+dept);
        System.out.println("AGE "+age);
        System.out.println("ROLL NO "+roll_no);
}
}
class construc{
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.name="Dinesh";
        s1.dept="IT";
        s1.age=20;
        s1.roll_no=+9;
        s1.display();
    }
}
    
