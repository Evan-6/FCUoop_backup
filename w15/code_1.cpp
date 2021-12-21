import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num=a.nextInt();
        try {
            for(int i=0 ; i<num ; i++){
                int put=a.nextInt();
                if(put>=3)throw new PowerFailureException();
            }
        }
        catch(PowerFailureException ex) {
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }

}

class PowerFailureException extends Exception {
    public String getMessage() {
        return ("Power Failure!");
    }
}
