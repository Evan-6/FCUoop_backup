abstract class Person{
    public String name="";
    public abstract void total();
}

class Student extends Person{
    private int a;
    private int b;
    private int c;

    public void set(int a,int b,int c,String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public void total(){
        int sum=a+b+c;
        System.out.println("Name: "+name);
        System.out.println("Total score: "+sum);
    }
}
class Employee extends Person{
    public int hours;
    public void set(int hours , String name){
        this.hours=hours;
        this.name=name;
    }

    public void total(){
        int sum=24*hours*800;
        System.out.println("Name: "+name);
        System.out.println("Daily hours: "+hours);
        System.out.println("Salary: "+sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        Employee b = new Employee();
        a.set(97,80,87,"Eric");
        a.total();
        b.set(7,"Amy");
        b.total();
    }
}



