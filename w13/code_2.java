//import java.util.Scanner;

class Vechile{
    public int num;
    public char color;

    public void setNum(int num){
        this.num=num;
    }
    public void setColor(char color){
        this.color=color;
    }
    public void setCar(int num , char color) {

    }
    public void printCar(){
        System.out.println("Engine Number:"+this.num+"\nColor:"+this.color);
    }
}

class Car extends Vechile{
    public int doors;

    public void setDoors(int doors){
        this.doors=doors;
    }
    @Override
    public void printCar(){
        char color = super.color;
        int num = super.num;
        System.out.println("Engine Number:"+num+"\nColor:"+color+"\nDoors Number:"+this.doors);
    }
    public void setCar(int num, char color,int doors) {
        super.setNum(num);
        super.setColor(color);
        this.doors=doors;
    }
}

public class Main {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
        Car a = new Car();
        Car b = new Car();
//        int count= a.nextInt();
        a.setCar(1233567,'W',4);
        a.printCar();
        b.setCar(5678567,'B',5);
        b.printCar();

    }
}



