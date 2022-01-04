import java.io.*;
public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(buf.readLine());
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
