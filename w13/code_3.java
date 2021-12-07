class Person{
    public int id;
    public String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPerson(){
        System.out.println("Name:"+this.name+"ID:"+this.id);
    }
}

class Teacher extends Person{
    public int hours;
    public void setHours(int hours){
        this.hours=hours;
    }

    @Override
    public void printPerson(){
        String name = super.name;
        int id = super.id;
        System.out.println("Name:"+name+"\nID:"+id+"\nType:Teacher\nAverageHours:"+this.hours/18);
    }
}
class Salesperson extends Person{
    public int salary;
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    public void printPerson(){
        String name = super.name;
        int id = super.id;
        System.out.println("Name:"+name+"\nID:"+id+"\nType:Salesperson\nSalary:"+this.salary/12);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher a = new Teacher();
        Salesperson b = new Salesperson();
        a.setName("Eric");
        a.setId(159598);
        a.setHours(144);
        a.printPerson();
        b.setName("Amy");
        b.setId(158965);
        b.setSalary(432000);
        b.printPerson();
    }
}



