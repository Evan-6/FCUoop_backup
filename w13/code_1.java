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
        System.out.println("Engine Number:"+this.num+"\nColor:"+this.color+"\nDoors Number:"+this.doors);
    }

}

public class Main {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
        Car a = new Car();
        Car b = new Car();
//        int count= a.nextInt();
        a.setNum(1233567);
        a.setColor('W');
        a.setDoors(4);
        a.printCar();
        b.setNum(5678567);
        b.setColor('B');
        b.setDoors(5);
        b.printCar();
        b.setColor('W');
        b.printCar();

    }
}



