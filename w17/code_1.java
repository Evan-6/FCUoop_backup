import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int m=a.nextInt();
        System.out.println(fib(m));
    }

    public static long fib(int n){
        if(n==1)
            return 1;
        else if (n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
