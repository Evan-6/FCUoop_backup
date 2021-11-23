import java.util.Scanner;

class card{
    public int a;
    public int b=10;
    public String set;
    public int one() {
        return a/b;
    }
    public int two() {
        return a%b;
    }
    public void three() {
        StringBuilder dest = new StringBuilder();
        while(a>0){
            dest.append(two());
            dest.append(" ");
            a=one();
        }
        for(int i=dest.length()-2 ; i>=0 ; i--){
            System.out.print(dest.charAt(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        card member = new card();
        member.a=a.nextInt();
        member.three();
    }
}
