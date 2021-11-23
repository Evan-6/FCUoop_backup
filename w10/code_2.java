import java.util.Scanner;

class card{
    public long a;
    public long sum=0;
    public void isPerfect(){
        for(long i=2 ; i<Math.sqrt(a) ; i++){
            if(a%i==0){
                sum+=i;
                sum+=a/i;
            }
        }
        sum+=1;
        if(sum==a){
            System.out.println("isPerfect");
        }
        else{
            System.out.println("notPerfect");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        card member = new card();
        member.a=a.nextInt();
        member.isPerfect();
    }
}
