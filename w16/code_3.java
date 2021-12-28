import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArguementException {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        try {
            for(int i=0 ; i<str.length() ; i++){
                if(str.charAt(i) == ' ') {
                    throw new ArguementException(1," 空白字串");
                }
                else if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')) {
                    throw new ArguementException(2," 英文字母");
                }
                else if (str.charAt(i)<'0' || str.charAt(i)>'9'){
                    throw new ArguementException(3," 符號");
                }
            }

        } catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }
}

class ArguementException extends Exception {
    int num;
    String msg;
    public ArguementException(int num, String msg) {
        this.num=num;
        this.msg=msg;
    }
    public String getMessage(){
        return "ArguementException:"+Integer.toString(this.num)+this.msg;
    }

}


