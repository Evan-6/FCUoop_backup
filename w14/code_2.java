abstract class Test{
    public int max;
    public int avg;
    public abstract void print();
}

class Mid extends Test{
    public void set(int max , int avg){
        this.max=max;
        this.avg=avg;
    }
    public void print(){
        System.out.println("MidTerm:");
        System.out.println("MaxScore:"+max);
        System.out.println("AvgScore:"+avg);
    }

}
class Final extends Test{
    public void set(int max , int avg){
        this.max=max;
        this.avg=avg;
    }
    public void print(){
        System.out.println("FinalTerm:");
        System.out.println("MaxScore:"+max);
        System.out.println("AvgScore:"+avg);
    }
}
class Quiz extends Test{
    public void set(int max , int avg){
        this.max=max;
        this.avg=avg;
    }
    public void print(){
        System.out.println("Quiz:");
        System.out.println("MaxScore:"+max);
        System.out.println("AvgScore:"+avg);
    }
}

public class Main {
    public static void main(String[] args) {
        Mid a = new Mid();
        Final b =new Final();
        Quiz c = new Quiz();
        a.set(98,60);
        b.set(87,63);
        c.set(100,77);
        a.print();
        b.print();
        c.print();
    }
}



