
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.next();
        try {
            //??????????????

            if(b.charAt(0)=='-')throw new BadNumberException();
            int flag=0;
            char c = b.charAt(0);
            for(int i=0 ; i<b.length() ;i++){
                if(b.charAt(i)!=c)flag=1;
            }
            if(flag==0)
            throw new BadNumberException(b);
            //??????????????

        }
        catch(BadNumberException ex) {
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }

}

class BadNumberException extends Exception {

    int Badnumber;
    String msg = "";
    public BadNumberException(String Badnumber) {
        //???????????
        msg = "BadNumberException "+Badnumber;
    }

    public BadNumberException() {
        //????????????
        msg = "BadNumberException";
    }

    public String getMessage() {
        return (msg);
    }
}
