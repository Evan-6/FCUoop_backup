import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {

        try {
            col();
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void col() throws IllegalArgumentException {
        //throw new IllegalArgumentException
        Scanner s = new Scanner(System.in);
        int a, b ,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(c==0)throw new IllegalArgumentException();
        else{
            System.out.println(a*b/c);
        }
    }

}


class IllegalArgumentException extends Exception {
    //getMessage() return c不能是0
    public String getMessage() {
        return "c不能是0";
    }
}



