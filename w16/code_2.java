import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            printNum();
        }catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public static void printNum() throws IllegalArgumentException, ArithmeticException {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num>100)throw new ArithmeticException();
        else if(num<0)throw new IllegalArgumentException();
        else{
            for(int i=0 ; i<num ; i++){
                System.out.print((2*i+1)+",");
            }
        }
    }

}

class IllegalArgumentException extends Exception {
    public String getMessage(){
        return "Argument should be larger than 0";
    }
}

class ArithmeticException extends Exception {
    public String getMessage(){
        return "Argument should be smaller than 100";
    }
}

