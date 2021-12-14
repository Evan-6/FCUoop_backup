abstract class Vehicle{
    public int num;
    public int price;
    public abstract void show();
}

class Car extends Vehicle{
    public int passenger;
    public void set(int passenger ,int num ,int price){
        this.passenger=passenger;
        this.num=num;
        this.price=price;
    }

    public void show() {
        System.out.println("Engine Number:"+num);
        System.out.println("Price:"+price);
        System.out.println("Passengers:"+passenger);
    }
}
class Trucks extends Vehicle{
    public int cargo;
    public void set(int cargo ,int num ,int price){
        this.cargo=cargo;
        this.num=num;
        this.price=price;
    }
    public void show() {
        System.out.println("Engine Number:"+num);
        System.out.println("Price:"+price);
        System.out.println("Cargo Capacity:"+cargo);
    }
}
public class Main {
    public static void main(String[] args) {
        Car a = new Car();
        Trucks b = new Trucks();
        a.set(7,1233567,800000);
        a.show();
        b.set(30,5678567,1200000);
        b.show();
    }
}



