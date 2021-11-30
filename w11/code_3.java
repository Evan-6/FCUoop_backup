import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Person S = new Student();
        S.name = a.next();
        S.ID = a.next();
        S.grade[0]=a.nextInt();
        S.grade[1]=a.nextInt();
        S.grade[2]=a.nextInt();
        S.printPerson();

    }
}

class Person {
    public String name;
    public String ID;
    public int grade[]=new int[3];
    public Person() {

    }
    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    public void printPerson() {
        System.out.println(name + " " + ID);
    }
}
class Student extends Person {
    @Override
    public void printPerson() {
        String name = super.name;
        String ID = super.ID;
        System.out.println("Student:" + name);
        System.out.println("ID:" + ID);
        int sum=0;
        sum+=grade[0];
        sum+=grade[1];
        sum+=grade[2];
        System.out.print("Average score:"+sum/3);
    }
}

